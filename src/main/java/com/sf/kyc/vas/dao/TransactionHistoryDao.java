/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.dao;

import com.sf.kyc.vas.entity.TransactionHistory;
import javax.annotation.PostConstruct;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Repository;

/**
 *
 * @author UCHECHUKWU
 */
@Log4j
@Repository
public class TransactionHistoryDao extends AbstractSpringHibernateBaseDao<TransactionHistory> {

    @PostConstruct
    public void init() {
        super.setClazz(TransactionHistory.class);
    }

}
