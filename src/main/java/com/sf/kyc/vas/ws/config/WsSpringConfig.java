/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.ws.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author UCHECHUKWU
 */
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:server.properties")
@ImportResource({"classpath*:config/*.xml"})
@ComponentScan("com.sf.kyc.vas")
public class WsSpringConfig {

    @Autowired
    Environment env;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(appDataSource());
        sessionFactory.setPackagesToScan(new String[]{"com.sf.kyc.vas.entity"});
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }

    @Bean(destroyMethod = "close")
    public DataSource appDataSource() {
        try {
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass(env.getRequiredProperty("jdbc.driver"));
            ds.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
            ds.setUser(env.getRequiredProperty("jdbc.username"));
            ds.setPassword(env.getRequiredProperty("jdbc.password"));
            ds.setMaxPoolSize(Integer.parseInt(env.getProperty("c3p0.maxPoolSize")));
            ds.setMinPoolSize(Integer.parseInt(env.getProperty("c3p0.minPoolSize")));
            ds.setAcquireIncrement(Integer.parseInt(env.getProperty("c3p0.acquireIncrement")));
            ds.setAcquireRetryAttempts(Integer.parseInt(env.getProperty("c3p0.acquireRetryAttempts")));
            ds.setAcquireRetryDelay(Integer.parseInt(env.getProperty("c3p0.acquireRetryDelay")));
            ds.setBreakAfterAcquireFailure(false);
            ds.setMaxConnectionAge(Integer.parseInt(env.getProperty("c3p0.maxConnectionAge")));
            ds.setMaxIdleTime(Integer.parseInt(env.getProperty("c3p0.maxIdleTime")));
            ds.setMaxIdleTimeExcessConnections(Integer.parseInt(env.getProperty("c3p0.maxIdleTimeExcessConnections")));
            ds.setIdleConnectionTestPeriod(Integer.parseInt(env.getProperty("c3p0.idleConnectionTestPeriod")));
            ds.setTestConnectionOnCheckout(true);
            ds.setPreferredTestQuery(env.getProperty("c3p0.preferredTestQuery"));
            ds.setDebugUnreturnedConnectionStackTraces(true);
            ds.setAutoCommitOnClose(true);
            return ds;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sessionFactory);

        return txManager;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    Properties hibernateProperties() {
        return new Properties() {
            {
                setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
                setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
                setProperty("hibernate.auto_close_session", env.getProperty("hibernate.auto_close_session"));
                setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
               // setProperty("hibernate.default_schema", env.getProperty("hibernate.default_schema"));
                setProperty("org.hibernate.envers.do_not_audit_optimistic_locking_field", env.getProperty("org.hibernate.envers.do_not_audit_optimistic_locking_field"));
                setProperty("org.hibernate.envers.store_data_at_delete", env.getProperty("org.hibernate.envers.store_data_at_delete"));
                setProperty("org.hibernate.envers.audit_table_prefix", env.getProperty("org.hibernate.envers.audit_table_prefix"));
                setProperty("org.hibernate.envers.audit_table_suffix", env.getProperty("org.hibernate.envers.audit_table_suffix"));

            }
        };
    }

}
