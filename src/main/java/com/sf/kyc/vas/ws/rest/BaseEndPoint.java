/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.ws.rest;

import com.sf.kyc.vas.model.DataBundleList;
import com.sf.kyc.vas.model.GenericResponse;
import com.sf.kyc.vas.model.TariffPlanChangeRequest;
import com.sf.kyc.vas.model.TariffPlanList;
import com.sf.kyc.vas.model.VasLogRequest;
import com.sf.kyc.vas.model.VoiceBundleList;

import com.sf.kyc.vas.service.VasService;
import com.sf.kyc.vas.util.Utilities;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import lombok.extern.log4j.Log4j;

/**
 *
 * @author UCHECHUKWU
 */
@Log4j
@Path("services/api/v1")
public class BaseEndPoint {

    @Inject
    VasService vasService;

    @GET
    @Path("/tariffplans")
    @Produces(MediaType.APPLICATION_JSON)
    public TariffPlanList getTariffPlans(@Context HttpServletRequest request) {
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        TariffPlanList plans = new TariffPlanList();
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        log.info("User IP Address" + ipAddress);
        try {
            plans = vasService.getTariffPlans();
        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
        }
        return plans;
    }

    @GET
    @Path("/databundles")
    @Produces(MediaType.APPLICATION_JSON)
    public DataBundleList getDataBundles(@Context HttpServletRequest request) {
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        DataBundleList bundles = new DataBundleList();
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        log.info("User IP Address" + ipAddress);
        try {
            bundles = vasService.getDataBundles();
        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
        }
        return bundles;
    }

    @GET
    @Path("/voicebundles")
    @Produces(MediaType.APPLICATION_JSON)
    public VoiceBundleList getVoiceBundleList(@Context HttpServletRequest request) {
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        VoiceBundleList bundles = new VoiceBundleList();
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        log.info("User IP Address" + ipAddress);
        try {
            bundles = vasService.getVoiceBundles();
        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
        }
        return bundles;
    }

    @POST
    @Path("/tariffswap")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public GenericResponse tariffSwap(TariffPlanChangeRequest tariffPlanChangeRequest, @Context ContainerRequestContext containerRequestContext, @Context HttpServletRequest request) {
        GenericResponse resp = new GenericResponse();
        log.info("User Tariff plan change request");
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        log.info("User IP Address" + ipAddress);
        resp = vasService.changeTariffPlan(tariffPlanChangeRequest);
        return resp;
    }

    @POST
    @Path("/logvasrequest")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public GenericResponse logVasRequest(VasLogRequest vasLogRequest, @Context ContainerRequestContext containerRequestContext, @Context HttpServletRequest request) {
        GenericResponse resp = new GenericResponse();
        log.info("Logging user's vas request");
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        resp = vasService.logVasrequest(vasLogRequest);
        log.info("User IP Address" + ipAddress);

        return resp;
    }

}
