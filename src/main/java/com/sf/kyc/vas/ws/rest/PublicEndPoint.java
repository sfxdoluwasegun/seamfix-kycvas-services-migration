/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.ws.rest;

import com.sf.kyc.vas.model.GenericResponse;
import com.sf.kyc.vas.model.VasIdRequest;
import com.sf.kyc.vas.service.VasService;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import lombok.extern.log4j.Log4j;

/**
 *
 * @author UCHECHUKWU
 */
@Log4j
@Path("public/api/v1")
public class PublicEndPoint {

    @Inject
    VasService vasService;

    @POST
    @Path("/getid")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public GenericResponse vtuUserVasClientId(VasIdRequest vasIdRequest, @Context HttpServletRequest request) {
        GenericResponse resp = new GenericResponse();
        log.info("User vas client id  request");
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        log.info("User IP Address" + ipAddress);
        resp = vasService.getVasClientId(vasIdRequest, ipAddress);
        return resp;
    }
    
     @POST
    @Path("/echo")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public GenericResponse vtuUserVasClientId(@Context HttpServletRequest request) {
        GenericResponse resp = new GenericResponse();
        log.info("User vas client id  request");
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
      resp.setResponseCode("00");
      resp.setResponseDescription("Welcome");
        return resp;
    }

}
