/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.dao;

import javax.sql.DataSource;
import lombok.extern.log4j.Log4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 *
 * @author UCHECHUKWU
 */
@SuppressWarnings("unchecked")
@Log4j
@Repository
public abstract class AbstractSpringJdbcTemplateBaseDao {
  protected JdbcTemplate jdbcTemplate;
    public abstract void setDataSource(DataSource datasource);
}
