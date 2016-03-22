/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.ws.config;

//import javax.ws.rs.ApplicationPath;
import com.sf.kyc.vas.ws.filter.AuthFilter;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author UCHECHUKWU
 */
@ApplicationPath("resources")
public class AppConfigResource extends ResourceConfig {

    public AppConfigResource() {
        packages("com.sf.kyc.vas.ws.rest");
        packages("com.fasterxml.jackson.jaxrs");
        register(AuthFilter.class);
        // Register an instance of LoggingFilter.
        register(new LoggingFilter());
        register(JacksonFeature.class);
    }
}
