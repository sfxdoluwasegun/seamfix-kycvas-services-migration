/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.dao;

import com.sf.kyc.vas.entity.TariffPlan;
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
public class TariffPlanDao extends AbstractSpringHibernateBaseDao<TariffPlan> {

    @PostConstruct
    public void init() {
        super.setClazz(TariffPlan.class);
    }

    @Transactional
    public TariffPlan findTariffPlanByServiceClass(String ref) {
        String query = "select u from TariffPlan u where u.serviceClass = :param";
        HashMap<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("param", ref);
        return executeQueryUniqueResult(query, paramsMap);
    }

}
