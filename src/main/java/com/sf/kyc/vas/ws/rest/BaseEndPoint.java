/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.ws.rest;

import com.sf.kyc.vas.model.GenericResponse;
import com.sf.kyc.vas.model.VasIdRequest;
import com.sf.kyc.vas.model.VtuTopUpRequest;
import com.sf.kyc.vas.model.WalletBalanceResponse;
import com.sf.kyc.vas.service.VasService;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
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

    @POST
    @Path("/balance")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public WalletBalanceResponse getWalletBalance(VasIdRequest vasIdRequest, @Context ContainerRequestContext containerRequestContext, @Context HttpServletRequest request) {
        WalletBalanceResponse resp = new WalletBalanceResponse();
        log.info("User vas client id  request");
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        String encryptedVasClientId = (String) containerRequestContext.getProperty("encryptedVasClientId");
        log.info("User IP Address" + ipAddress);
        resp = vasService.getWalletBalance(vasIdRequest, encryptedVasClientId, ipAddress);
        return resp;
    }

    @POST
    @Path("/topup")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public GenericResponse customerTopUp(VtuTopUpRequest vtuTopUpRequest, @Context ContainerRequestContext containerRequestContext, @Context HttpServletRequest request) {
        GenericResponse resp = new GenericResponse();
        log.info("User vas client id  request");
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        String encryptedVasClientId = (String) containerRequestContext.getProperty("encryptedVasClientId");
        log.info("User IP Address" + ipAddress);
        resp = vasService.customerTopUp(vtuTopUpRequest, encryptedVasClientId, ipAddress);
        return resp;
    }

}
