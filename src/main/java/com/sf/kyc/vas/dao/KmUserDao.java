/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.dao;

import com.sf.biocapture.entity.security.KMUser;
import java.util.HashMap;
import java.util.List;
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
public class KmUserDao extends AbstractSpringHibernateBaseDao<KMUser> {

    @PostConstruct
    public void init() {
        super.setClazz(KMUser.class);
    }

    @Transactional
    public KMUser getKMUserByEmail(String email) {
        String query = "select k from KMUser k where k.emailAddress = :param";
        HashMap<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("param", email);
        return executeQueryUniqueResult(query, paramsMap);
    }
}
