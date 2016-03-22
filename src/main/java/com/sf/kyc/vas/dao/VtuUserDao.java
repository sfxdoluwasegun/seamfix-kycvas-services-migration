/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.dao;

import com.sf.kyc.vas.entity.VtuUser;
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
public class VtuUserDao extends AbstractSpringHibernateBaseDao<VtuUser> {

    @PostConstruct
    public void init() {
        super.setClazz(VtuUser.class);
    }

    @Transactional
    public VtuUser getVtuUserByEmail(String email) {
        String query = "select k from VtuUser k where k.kMUser.emailAddress = :param";
        HashMap<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("param", email);
        return executeQueryUniqueResult(query, paramsMap);
    }

    @Transactional
    public VtuUser getVtuUserByKmUserId(long kmUserId) {
        String query = "select k from VtuUser k where k.kMUser.pk = :param";
        HashMap<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("param", kmUserId);
        return executeQueryUniqueResult(query, paramsMap);
    }

    @Transactional
    public VtuUser getVtuUserByAppId(String appId) {
        String query = "select k from VtuUser k where k.appId = :param";
        HashMap<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("param", appId);
        return executeQueryUniqueResult(query, paramsMap);
    }

    @Transactional
    public VtuUser getVtuUserByAppIdAndEmail(String appId, String email) {
        String query = "select k from VtuUser k where k.appId = :param AND k.kMUser.emailAddress = :param2";
        HashMap<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("param", appId);
        paramsMap.put("param2", email);
        return executeQueryUniqueResult(query, paramsMap);
    }

}
