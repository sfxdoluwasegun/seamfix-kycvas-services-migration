/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.ws.config;

import com.sf.kyc.vas.listeners.MessageContextListener;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.core.Ordered;

import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 *
 * @author Nippon
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) throws ServletException {
        final AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WsSpringConfig.class);
        context.setServletContext(container);
        //Add context loader listener   
        container.addListener(new ContextLoaderListener(context));
        //Add request context listener   
        container.addListener(new RequestContextListener());

        final ServletContainer servlet = new ServletContainer();
        //add jersey servlet to the container(i.e. servlet context)   
        final ServletRegistration.Dynamic jerseyServlet = container.addServlet("myJerseyServlet", servlet);
        jerseyServlet.addMapping("/rest/*");
        //jerseyServlet.setAsyncSupported(true);
        //add jersey resources to the jersey servlet   
        jerseyServlet.setInitParameter("javax.ws.rs.Application",
                "com.sf.kyc.vas.ws.config.AppConfigResource");
        //add DelegatingFilterProxy   
        // container.addFilter("myFilterChain", new DelegatingFilterProxy()).addMappingForUrlPatterns(null, false, "/*");  
    /*   The following line is required to avoid having jersey-spring3 registering it's own Spring root context. Otherwise jersey-spring3 creates its own Root web application context which which will be different from what I have created   just here   */
        container.setInitParameter("contextConfigLocation", "");
        container.addListener(new MessageContextListener());
        container.addListener(new SessionListener());
    }

    private class SessionListener implements HttpSessionListener {

        @Override
        public void sessionCreated(HttpSessionEvent event) {
            System.out.println("==== Session is created ====");
            event.getSession().setMaxInactiveInterval(5 * 60);
        }

        @Override
        public void sessionDestroyed(HttpSessionEvent event) {
            System.out.println("==== Session is destroyed ====");
        }
    }
}
