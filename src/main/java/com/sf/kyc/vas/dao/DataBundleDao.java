/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.dao;

import com.sf.kyc.vas.entity.DataBundle;
import javax.annotation.PostConstruct;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Repository;

/**
 *
 * @author UCHECHUKWU
 */
@Log4j
@Repository
public class DataBundleDao extends AbstractSpringHibernateBaseDao<DataBundle> {

    @PostConstruct
    public void init() {
        super.setClazz(DataBundle.class);
    }

}
