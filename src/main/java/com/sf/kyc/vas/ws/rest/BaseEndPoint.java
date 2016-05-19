/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.ws.rest;

import com.sf.kyc.vas.model.DataBundleList;
import com.sf.kyc.vas.model.GenericResponse;
import com.sf.kyc.vas.model.SmsShortServiceCodeList;
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
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import lombok.extern.log4j.Log4j;
import org.glassfish.jersey.server.ManagedAsync;

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
    @ManagedAsync
    @Produces(MediaType.APPLICATION_JSON)
    public void getTariffPlans(@Context HttpServletRequest request, final @Suspended AsyncResponse response) {
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        TariffPlanList plans = new TariffPlanList();
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        log.info("User IP Address" + ipAddress);
        try {
            plans = vasService.getTariffPlans();
            response.resume(plans);
        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
        }

    }

    @GET
    @Path("/shortcodes")
    @ManagedAsync
    @Produces(MediaType.APPLICATION_JSON)
    public SmsShortServiceCodeList getShortcodes(@Context HttpServletRequest request, final @Suspended AsyncResponse response) {
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        SmsShortServiceCodeList shortCodes = new SmsShortServiceCodeList();
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        log.info("User IP Address" + ipAddress);
        try {
            shortCodes = vasService.getSmsShortServiceCodes();
            response.resume(shortCodes);
        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
        }
        return shortCodes;
    }

    @GET
    @Path("/databundles")
    @ManagedAsync
    @Produces(MediaType.APPLICATION_JSON)
    public DataBundleList getDataBundles(@Context HttpServletRequest request, final @Suspended AsyncResponse response) {
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        DataBundleList bundles = new DataBundleList();
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        log.info("User IP Address" + ipAddress);
        try {
            bundles = vasService.getDataBundles();
            response.resume(bundles);
        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
        }
        return bundles;
    }

    @GET
    @Path("/voicebundles")
    @ManagedAsync
    @Produces(MediaType.APPLICATION_JSON)
    public void getVoiceBundleList(@Context HttpServletRequest request, final @Suspended AsyncResponse response) {
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        VoiceBundleList bundles = new VoiceBundleList();
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        log.info("User IP Address" + ipAddress);
        try {
            bundles = vasService.getVoiceBundles();
            response.resume(bundles);
        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
        }

    }

    @POST
    @Path("/tariffswap")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public GenericResponse tariffSwap(TariffPlanChangeRequest tariffPlanChangeRequest, @Context HttpServletRequest request) {
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
    public GenericResponse logVasRequest(VasLogRequest vasLogRequest, @Context HttpServletRequest request) {
        GenericResponse resp = new GenericResponse();
        boolean logged = false;
        log.info("Logging user's vas request");
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        logged = vasService.logVasrequest(vasLogRequest);
        if (logged) {
            resp.setResponseCode("00");
            resp.setResponseDescription("Transaction log was successful");
        } else {
            resp.setResponseCode("06");
            resp.setResponseDescription("Error processing request");
        }
        log.info("User IP Address" + ipAddress);
        return resp;

    }

}
