package com.sf.kyc.vas.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import lombok.extern.log4j.Log4j;

/**
 *
 * @author Temitope
 */
@Log4j
public class MessageContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("starting up threads");
        startCustomAction();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("shutting down threads");

    }

    private void startCustomAction() {

    }

}
