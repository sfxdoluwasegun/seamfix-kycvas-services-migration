/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.dao;

import com.sf.kyc.vas.entity.VtuUser;
import com.sf.kyc.vas.entity.VtuWallet;
import com.sf.kyc.vas.enums.WalletType;
import java.util.HashMap;
import javax.annotation.PostConstruct;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author UCHECHUKWU
 */
@Log4j
@Repository
public class VtuWalletDao extends AbstractSpringHibernateBaseDao<VtuWallet> {

    @PostConstruct
    public void init() {
        super.setClazz(VtuWallet.class);
    }

    @Transactional
    public VtuWallet getVtuWalletByVtuUserId(long vtuUserId) {
        String query = "select k from VtuWallet k where k.vtuUser.pk = :param";
        HashMap<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("param", vtuUserId);
        return executeQueryUniqueResult(query, paramsMap);
    }

    @Transactional
    public VtuWallet getVtuWalletByWalletId(String walletId) {
        String query = "select k from VtuWallet k where k.walletId = :param";
        HashMap<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("param", walletId);
        return executeQueryUniqueResult(query, paramsMap);
    }

    @Transactional
    public VtuWallet getVtuWalletByWalletType(WalletType walletType) {
        String query = "select k from VtuWallet k where k.walletType = :param";
        HashMap<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("param", walletType);
        return executeQueryUniqueResult(query, paramsMap);
    }
}
