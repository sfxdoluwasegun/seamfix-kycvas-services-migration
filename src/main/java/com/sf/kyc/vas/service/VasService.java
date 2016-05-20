/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.service;

import com.sf.kyc.vas.dao.VasTransactionLogDao;
import com.sf.kyc.vas.dao.DataBundleDao;
import com.sf.kyc.vas.dao.SmsShortServiceCodeDao;
import com.sf.kyc.vas.dao.TariffPlanDao;
import com.sf.kyc.vas.dao.VoiceBundleDao;
import com.sf.kyc.vas.entity.DataBundle;
import com.sf.kyc.vas.entity.SmsShortServiceCode;
import com.sf.kyc.vas.entity.TariffPlan;
import com.sf.kyc.vas.entity.VasTransactionLog;
import com.sf.kyc.vas.entity.VoiceBundle;
import com.sf.kyc.vas.enums.ClientRequestChannelType;
import com.sf.kyc.vas.enums.RequestCategory;
import com.sf.kyc.vas.enums.RequestInterface;
import com.sf.kyc.vas.enums.RequestStatus;
import com.sf.kyc.vas.model.DataBundleList;
import com.sf.kyc.vas.model.GenericResponse;
import com.sf.kyc.vas.model.SmsShortServiceCodeList;
import com.sf.kyc.vas.model.TariffPlanChangeRequest;
import com.sf.kyc.vas.model.TariffPlanList;
import com.sf.kyc.vas.model.VasLogRequest;
import com.sf.kyc.vas.model.VoiceBundleList;
import com.sf.kyc.vas.soap.webservice.artifact.IAirService;
import com.sf.kyc.vas.util.Utilities;
import com.sf.kyc.vas.webservice.template.BaseSoapTemplate;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author UCHECHUKWU
 */
@Log4j
@Service
public class VasService {

    @Value("${airtel.vas.url}")
    private String airtelWsdlUrl;

    @Value("${kyc.client.identifier}")
    private String kycClientIdentifier;

    @Inject
    DataBundleDao dataBundleDao;

    @Inject
    SmsShortServiceCodeDao smsShortServiceCodeDao;
    @Inject
    TariffPlanDao tariffPlanDao;
    @Inject
    VasTransactionLogDao vasTransactionLogDao;
    @Inject
    VoiceBundleDao voiceBundleDao;

    @Transactional
    public GenericResponse changeTariffPlan(TariffPlanChangeRequest tariffPlanChangeRequest) {
        GenericResponse resp = new GenericResponse();
        boolean done = false;
        BaseSoapTemplate soapTemplate = new BaseSoapTemplate();
        try {
            IAirService service = soapTemplate.getAirtelServiceViaWsdlUrl(airtelWsdlUrl);
            done = service.changeServiceClass(tariffPlanChangeRequest.getCustomerMsisdn(), tariffPlanChangeRequest.getServiceClass(), kycClientIdentifier);
            if (done) {
                logVasrequest(tariffPlanChangeRequest);
                resp.setResponseCode("00");
                resp.setResponseDescription("Customer tariff plan change successful");
            } else {
                resp.setResponseCode("06");
                resp.setResponseDescription("A Gateway service error occurred.");
            }

        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
            log.error(ex.getMessage());
            resp.setResponseCode("02");
            resp.setResponseDescription("A KYC service error occurred");
        }
        return resp;
    }

    @Transactional
    public boolean logVasrequest(VasLogRequest vasLogRequest) {
        boolean resp = false;
        try {

            VasTransactionLog vasLog = new VasTransactionLog();
            VasTransactionLog dbVasLog = vasTransactionLogDao.findByClientRef(vasLogRequest.getVasRequestReference());
            if (dbVasLog != null) {
                vasLog = dbVasLog;
            }
            vasLog.setAmount(new BigDecimal(vasLogRequest.getAmount()));
            vasLog.setClientVasRequestChannelType(ClientRequestChannelType.ANDROID);
            if (vasLogRequest.getClientVasRequestChannelType().equalsIgnoreCase("WINDOWS")) {
                vasLog.setClientVasRequestChannelType(ClientRequestChannelType.WINDOWS);
            }
            vasLog.setCustomerMsisdn(vasLogRequest.getCustomerMsisdn());
            vasLog.setDeviceMacAddress(vasLogRequest.getDeviceMacAddress());
            vasLog.setDeviceTag(vasLogRequest.getDeviceTag());
            vasLog.setNarration(vasLogRequest.getNarration());
            vasLog.setProductCode(vasLogRequest.getProductCode());
            vasLog.setProductName(vasLogRequest.getProductName());
            vasLog.setRequestDate(new Timestamp(vasLogRequest.getRequestDate().getTime()));
            vasLog.setRequestInterface(RequestInterface.API);
            if (vasLogRequest.getRequestInterface().equalsIgnoreCase("SMS")) {
                vasLog.setRequestInterface(RequestInterface.SMS);
            }
            vasLog.setRequestXml("");
            vasLog.setResponseCode("");
            vasLog.setResponseReference("");
            vasLog.setResponseXml("");
            vasLog.setSenderId(vasLogRequest.getSenderId());
            vasLog.setVasRequestReference(vasLogRequest.getVasRequestReference());
            vasLog.setVasRequestStatus(RequestStatus.IN_PROGRESS);
            if (vasLogRequest.getVasRequestStatus().equalsIgnoreCase("NOT_SENT")) {
                vasLog.setVasRequestStatus(RequestStatus.NOT_SENT);
            } else if (vasLogRequest.getVasRequestStatus().equalsIgnoreCase("SENT")) {
                vasLog.setVasRequestStatus(RequestStatus.SENT);
            }
            vasLog.setVasRequestCategory(RequestCategory.TARIFF_PLAN_CHANGE);
            if (vasLogRequest.getVasRequestCategory().equalsIgnoreCase("AIR_TIME_TOPUP")) {
                vasLog.setVasRequestCategory(RequestCategory.AIR_TIME_TOPUP);
            } else if (vasLogRequest.getVasRequestCategory().equalsIgnoreCase("DATA_BUNDLE_TOPUP")) {
                vasLog.setVasRequestCategory(RequestCategory.DATA_BUNDLE_TOPUP);
            } else if (vasLogRequest.getVasRequestCategory().equalsIgnoreCase("VOICE_BUNDLE_SWITCH")) {
                vasLog.setVasRequestCategory(RequestCategory.VOICE_BUNDLE_SWITCH);
            }
            vasTransactionLogDao.save(vasLog);
            resp = true;
        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
            log.error(ex.getMessage());
            resp = false;
        }
        return resp;
    }

    @Transactional
    public boolean logVasrequest(TariffPlanChangeRequest tariffPlanChangeRequest) {
        boolean resp = false;
        try {
            VasTransactionLog vasLog = new VasTransactionLog();
            VasTransactionLog dbVasLog = vasTransactionLogDao.findByClientRef(tariffPlanChangeRequest.getReference());
            if (dbVasLog != null) {
                vasLog = dbVasLog;
            }
            vasLog.setAmount(BigDecimal.ZERO);
            vasLog.setClientVasRequestChannelType(ClientRequestChannelType.ANDROID);
            if (tariffPlanChangeRequest.getClientVasRequestChannelType().equalsIgnoreCase("WINDOWS")) {
                vasLog.setClientVasRequestChannelType(ClientRequestChannelType.WINDOWS);
            }
            vasLog.setCustomerMsisdn(tariffPlanChangeRequest.getCustomerMsisdn());
            vasLog.setDeviceMacAddress(tariffPlanChangeRequest.getDeviceMacAddress());
            vasLog.setDeviceTag(tariffPlanChangeRequest.getDeviceTag());
            vasLog.setProductCode(String.valueOf(tariffPlanChangeRequest.getServiceClass()));
            TariffPlan tp = tariffPlanDao.findTariffPlanByServiceClass(String.valueOf(tariffPlanChangeRequest.getServiceClass()));
            if (tp != null) {
                  vasLog.setProductName(tp.getPlanName());
            } else {
                 vasLog.setProductName("Others");
            }

          
            vasLog.setRequestDate(new Timestamp(new Date().getTime()));
            vasLog.setRequestInterface(RequestInterface.API);
            vasLog.setRequestXml("");
            vasLog.setNarration("Tariff Plan change for " + tariffPlanChangeRequest.getCustomerMsisdn());
            vasLog.setResponseCode("");
            vasLog.setResponseReference("");
            vasLog.setResponseXml("");
            vasLog.setSenderId(tariffPlanChangeRequest.getSenderId());
            vasLog.setVasRequestReference(tariffPlanChangeRequest.getReference());
            vasLog.setVasRequestStatus(RequestStatus.IN_PROGRESS);
            vasLog.setVasRequestCategory(RequestCategory.TARIFF_PLAN_CHANGE);
            vasLog.setDeviceMacAddress(tariffPlanChangeRequest.getDeviceMacAddress());
            vasTransactionLogDao.save(vasLog);
            resp = true;

        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
            log.error(ex.getMessage());
            resp = false;

        }
        return resp;
    }

    @Transactional
    public TariffPlanList getTariffPlans() {
        TariffPlanList tariffPlanList = new TariffPlanList();
        List<com.sf.kyc.vas.model.TariffPlan> tariffPlans = new ArrayList<>();
        try {
            for (TariffPlan tariffPlan : tariffPlanDao.findAll()) {
                com.sf.kyc.vas.model.TariffPlan tp = new com.sf.kyc.vas.model.TariffPlan();
                tp.setPlanName(tariffPlan.getPlanName());
                tp.setServiceClass(tariffPlan.getServiceClass());
                tp.setVersionCount(tariffPlan.getVersionCount());
                tariffPlans.add(tp);
            }
        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
            log.error(ex.getMessage());
        }
        tariffPlanList.setTariffplans(tariffPlans);
        return tariffPlanList;
    }

    @Transactional
    public SmsShortServiceCodeList getSmsShortServiceCodes() {
        SmsShortServiceCodeList smsShortServiceCodeList = new SmsShortServiceCodeList();
        List<com.sf.kyc.vas.model.SmsShortServiceCode> smsShortServiceCodes = new ArrayList<>();
        try {
            for (SmsShortServiceCode smsShortServiceCode : smsShortServiceCodeDao.findAll()) {
                com.sf.kyc.vas.model.SmsShortServiceCode shsc = new com.sf.kyc.vas.model.SmsShortServiceCode();
                shsc.setName(smsShortServiceCode.getName());
                shsc.setCode(smsShortServiceCode.getCode());
                shsc.setVersionCount(smsShortServiceCode.getVersionCount());
                smsShortServiceCodes.add(shsc);
            }
        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
            log.error(ex.getMessage());
        }
        smsShortServiceCodeList.setSmsShortServiceCodes(smsShortServiceCodes);
        return smsShortServiceCodeList;
    }

    @Transactional
    public DataBundleList getDataBundles() {
        DataBundleList dataBundleList = new DataBundleList();
        List<com.sf.kyc.vas.model.DataBundle> dataBundles = new ArrayList<>();
        try {
            for (DataBundle dataBundle : dataBundleDao.findAll()) {
                com.sf.kyc.vas.model.DataBundle db = new com.sf.kyc.vas.model.DataBundle();
                db.setErcProductCategory(dataBundle.getErcProductCategory());
                db.setPretupsValue(dataBundle.getPretupsValue());
                db.setProductName(dataBundle.getProductName());
                db.setProductValue(dataBundle.getProductValue());
                db.setVersionCount(dataBundle.getVersionCount());
                dataBundles.add(db);
            }
        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
            log.error(ex.getMessage());
        }
        dataBundleList.setDatabundles(dataBundles);
        return dataBundleList;
    }

    @Transactional
    public VoiceBundleList getVoiceBundles() {
        VoiceBundleList voiceBundleList = new VoiceBundleList();
        List<com.sf.kyc.vas.model.VoiceBundle> voiceBundles = new ArrayList<>();
        try {
            for (VoiceBundle voiceBundle : voiceBundleDao.findAll()) {
                com.sf.kyc.vas.model.VoiceBundle vb = new com.sf.kyc.vas.model.VoiceBundle();
                vb.setErcProductCategory(voiceBundle.getErcProductCategory());
                vb.setPretupsValue(voiceBundle.getPretupsValue());
                vb.setProductName(voiceBundle.getProductName());
                vb.setProductValue(voiceBundle.getProductValue());
                vb.setVersionCount(voiceBundle.getVersionCount());
                voiceBundles.add(vb);
            }
        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
            log.error(ex.getMessage());
        }
        voiceBundleList.setVoicebundles(voiceBundles);
        return voiceBundleList;
    }

}
