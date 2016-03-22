/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.dao;

import com.sf.kyc.vas.entity.VtuUser;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author UCHECHUKWU
 */
public class CustomDao extends AbstractSpringJdbcTemplateBaseDao {

    private static final Logger log = Logger.getLogger(CustomDao.class.getName());

    @Autowired
    @Override
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
    }

    public VtuUser findVtuUserKmUserId(long kmUserId) {
        String sql = "SELECT * FROM VTU_USER v WHERE v.kmUserId = " + kmUserId;
        VtuUser vtuUser = jdbcTemplate.queryForObject(sql, new RowMapper<VtuUser>() {
            @Override
            public VtuUser mapRow(ResultSet rs, int rowNum) throws SQLException {
                VtuUser f = new VtuUser();
                return f;
            }

        });

        return vtuUser;
    }

}
