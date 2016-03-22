/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.service;

import com.sf.biocapture.entity.security.KMUser;
import com.sf.kyc.vas.dao.KmUserDao;
import com.sf.kyc.vas.dao.TransactionHistoryDao;
import com.sf.kyc.vas.dao.VtuUserDao;
import com.sf.kyc.vas.dao.VtuWalletDao;
import com.sf.kyc.vas.entity.TransactionHistory;
import com.sf.kyc.vas.entity.VtuUser;
import com.sf.kyc.vas.entity.VtuWallet;
import com.sf.kyc.vas.enums.ClientTransactionChannelType;
import com.sf.kyc.vas.enums.TransactionCategory;
import com.sf.kyc.vas.enums.TransactionStatus;
import com.sf.kyc.vas.enums.TransactionType;
import com.sf.kyc.vas.enums.WalletType;
import com.sf.kyc.vas.model.GenericResponse;
import com.sf.kyc.vas.model.VasIdRequest;
import com.sf.kyc.vas.model.VtuTopUpRequest;
import com.sf.kyc.vas.model.WalletBalanceResponse;
import com.sf.kyc.vas.util.CryptoUtils;
import com.sf.kyc.vas.util.RSAServiceUtil;
import com.sf.kyc.vas.util.Utilities;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import lombok.extern.log4j.Log4j;
import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author UCHECHUKWU
 */
@Log4j
@Service
public class VasService {

    @Inject
    VtuUserDao vtuUserDao;
    @Inject
    KmUserDao kmUserDao;
    @Inject
    VtuWalletDao vtuWalletDao;
    @Inject
    TransactionHistoryDao transactionHistoryDao;

    @Transactional
    public GenericResponse getVasClientId(VasIdRequest vasIdRequest, String ipAddress) {
        GenericResponse response = new GenericResponse();
        VtuUser vu = vtuUserDao.getVtuUserByEmail(vasIdRequest.getEmail());
        if (vu == null) {
            response.setResponseCode("02");
            response.setResponseDescription("Could not get VTU user");
            return response;
        }
        if (vu.getVasClientId() == null) {
            response.setResponseCode("03");
            response.setResponseDescription("Could not get user vas client id");
            return response;
        }
        if (!vu.isActive()) {
            response.setResponseCode("04");
            response.setResponseDescription("VTU user account is disabled");
            return response;
        }
        response.setResponseCode("00");
        response.setResponseDescription("VTU user vas client id successfully retrieved");
        response.setAppId(new String(Base64.encodeBase64(vu.getVasClientId().getBytes(Charset.forName("UTF-8")))));
        return response;
    }

    @Transactional
    public WalletBalanceResponse getWalletBalance(VasIdRequest vasIdRequest, String encryptedAppId, String ipAddress) {
        WalletBalanceResponse response = new WalletBalanceResponse();
        VtuUser vu = vtuUserDao.getVtuUserByEmail(vasIdRequest.getEmail());
        if (vu == null) {
            response.setResponseCode("02");
            response.setResponseDescription("Could not get VTU user");
            return response;
        }
        if (vu.getVasClientId() == null) {
            response.setResponseCode("03");
            response.setResponseDescription("Could not get user vas client id");
            return response;
        }
        if (!vu.isActive()) {
            response.setResponseCode("04");
            response.setResponseDescription("VTU user account is disabled");
            return response;
        }
        VtuWallet vw = vtuWalletDao.getVtuWalletByVtuUserId(vu.getPk());
        if (vw == null) {
            response.setResponseCode("05");
            response.setResponseDescription("Could not get user wallet information");
            return response;
        }
        response.setResponseCode("00");
        response.setResponseDescription("VTU user vas client id successfully retrieved");
        response.setAvailableBalance(Utilities.format(vw.getAvailableBalance()));
        response.setBookBalance(Utilities.format(vw.getBookBalance()));
        response.setWalletId(vw.getWalletId());

        return response;
    }

    @Transactional
    public GenericResponse customerTopUp(VtuTopUpRequest vtuTopUpRequest, String encryptedAppId, String ipAddress) {
        RSAServiceUtil rsu = new RSAServiceUtil();
        GenericResponse response = new GenericResponse();
        try {
            VtuUser vu = vtuUserDao.getVtuUserByEmail(vtuTopUpRequest.getUsername());
            if (vu == null) {
                response.setResponseCode("02");
                response.setResponseDescription("Could not get VTU user");
                return response;
            }
            if (vu.getVasClientId() == null) {
                response.setResponseCode("03");
                response.setResponseDescription("Could not get user vas client id");
                return response;
            }
            if (!vu.isActive()) {
                response.setResponseCode("04");
                response.setResponseDescription("VTU user account is disabled");
                return response;
            }
            VtuWallet vw = vtuWalletDao.getVtuWalletByVtuUserId(vu.getPk());
            if (vw == null) {
                response.setResponseCode("05");
                response.setResponseDescription("Could not get user wallet information");
                return response;
            }

            VtuWallet vw2 = vtuWalletDao.getVtuWalletByWalletId(vtuTopUpRequest.getWalletId());
            if (vw2 == null) {
                response.setResponseCode("05");
                response.setResponseDescription("Could not get user wallet information");
                return response;
            }
            if (!(vw.getWalletId().equalsIgnoreCase(vw2.getWalletId()))) {
                response.setResponseCode("09");
                response.setResponseDescription("Agent Wallet account mis-match");
                return response;
            }
            VtuWallet seamfixWallet = vtuWalletDao.getVtuWalletByWalletType(WalletType.SEAMFIX);
            if (seamfixWallet == null) {
                response.setResponseCode("07");
                response.setResponseDescription("System error");
                return response;
            }
            rsu.initiate("vtupuk.key", "vtupvk.key");
            String clearPin = rsu.decrypt(vtuTopUpRequest.getEncryptedPin());
            boolean isPinValid = CryptoUtils.validatePassword(clearPin, vu.getPin(), true);
            if (!isPinValid) {
                response.setResponseCode("08");
                response.setResponseDescription("Invalid pin");
                return response;
            }
            if (vtuTopUpRequest.getAmount() > vw.getAvailableBalance().doubleValue()) {
                response.setResponseCode("10");
                response.setResponseDescription("Insufficient balance");
                return response;
            }
            vw.setAvailableBalance(vw.getAvailableBalance().subtract(new BigDecimal(vtuTopUpRequest.getAmount())));
            vw.setBookBalance(vw.getBookBalance().subtract(new BigDecimal(vtuTopUpRequest.getAmount())));
            seamfixWallet.setAvailableBalance(seamfixWallet.getAvailableBalance().add(new BigDecimal(vtuTopUpRequest.getAmount())));
            seamfixWallet.setBookBalance(seamfixWallet.getBookBalance().add(new BigDecimal(vtuTopUpRequest.getAmount())));
            vtuWalletDao.save(vw);
            vtuWalletDao.save(seamfixWallet);
            TransactionHistory debitLegTtrnHis = new TransactionHistory();
            TransactionHistory creditLegTtrnHis = new TransactionHistory();
            if (vtuTopUpRequest.getVtuType().equalsIgnoreCase("DATA")) {
                debitLegTtrnHis.setTransactionCategory(TransactionCategory.VTU_DATA_TOPUP);
                creditLegTtrnHis.setTransactionCategory(TransactionCategory.VTU_DATA_TOPUP);
            } else {
                debitLegTtrnHis.setTransactionCategory(TransactionCategory.VTU_AIRTIME_TOPUP);
                creditLegTtrnHis.setTransactionCategory(TransactionCategory.VTU_AIRTIME_TOPUP);
            }
            if (vtuTopUpRequest.getClientChannel().equalsIgnoreCase("ANDROID")) {
                debitLegTtrnHis.setClientTransactionChannelType(ClientTransactionChannelType.ANDROID);
                creditLegTtrnHis.setClientTransactionChannelType(ClientTransactionChannelType.ANDROID);
            } else if (vtuTopUpRequest.getClientChannel().equalsIgnoreCase("WINDOWS")) {
                debitLegTtrnHis.setClientTransactionChannelType(ClientTransactionChannelType.WINDOWS);
                creditLegTtrnHis.setClientTransactionChannelType(ClientTransactionChannelType.WINDOWS);
            } else {
                debitLegTtrnHis.setClientTransactionChannelType(ClientTransactionChannelType.RICA);
                creditLegTtrnHis.setClientTransactionChannelType(ClientTransactionChannelType.RICA);
            }
            KMUser ku = kmUserDao.load(1L);
            if (ku != null) {
                debitLegTtrnHis.setCheckerId(ku);
                debitLegTtrnHis.setMakerId(ku);
                creditLegTtrnHis.setCheckerId(ku);
                creditLegTtrnHis.setMakerId(ku);
            }
            debitLegTtrnHis.setAmount(vtuTopUpRequest.getAmount());
            creditLegTtrnHis.setAmount(vtuTopUpRequest.getAmount());

            debitLegTtrnHis.setMsisdn(vtuTopUpRequest.getMsisdn());
            creditLegTtrnHis.setMsisdn(vtuTopUpRequest.getMsisdn());

            debitLegTtrnHis.setNarration(vtuTopUpRequest.getMsisdn() + "--" + vtuTopUpRequest.getVtuType());
            creditLegTtrnHis.setNarration(vtuTopUpRequest.getMsisdn() + "--" + vtuTopUpRequest.getVtuType());

            debitLegTtrnHis.setPaymentChannel("WALLET");
            creditLegTtrnHis.setPaymentChannel("WALLET");

            debitLegTtrnHis.setResponseCode("00");
            creditLegTtrnHis.setResponseCode("00");
            String ref = Utilities.externalRefNo();
            debitLegTtrnHis.setResponseReference(ref);
            creditLegTtrnHis.setResponseReference(ref);

            debitLegTtrnHis.setResponseReference(Utilities.externalRefNo());
            creditLegTtrnHis.setResponseReference(Utilities.externalRefNo());

            Date now = new Date();

            debitLegTtrnHis.setTransactionDate(new Timestamp(now.getTime()));
            creditLegTtrnHis.setTransactionDate(new Timestamp(now.getTime()));

            debitLegTtrnHis.setTransactionReference(ref);
            creditLegTtrnHis.setTransactionReference(ref);

            debitLegTtrnHis.setTransactionStatus(TransactionStatus.SUCCESSFUL);
            creditLegTtrnHis.setTransactionStatus(TransactionStatus.SUCCESSFUL);

            debitLegTtrnHis.setTransactionType(TransactionType.DEBIT);
            creditLegTtrnHis.setTransactionType(TransactionType.CREDIT);

            debitLegTtrnHis.setVtuWallet(vw);
            creditLegTtrnHis.setVtuWallet(seamfixWallet);

            debitLegTtrnHis.setWalletId(vw.getWalletId());
            creditLegTtrnHis.setWalletId(seamfixWallet.getWalletId());

            debitLegTtrnHis.setWalletType(vw.getWalletType());
            creditLegTtrnHis.setWalletType(seamfixWallet.getWalletType());

            transactionHistoryDao.save(debitLegTtrnHis);
            transactionHistoryDao.save(creditLegTtrnHis);

        } catch (Exception ex) {
            Logger.getLogger(VasService.class.getName()).log(Level.SEVERE, null, ex);
            response.setResponseCode("07");
            response.setResponseDescription("System error");
            return response;
        }
        response.setResponseCode("00");
        response.setResponseDescription("User topup was successfully");
        return response;
    }

}
