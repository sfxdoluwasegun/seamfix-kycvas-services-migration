/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.error.handler;

import javax.ws.rs.core.Response;
import lombok.extern.log4j.Log4j;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author UCHECHUKWU
 */
@Log4j
public abstract class AbstractExceptionMapper {

    protected Response errorResponse(int status, ResponseEntity responseEntity) {
        return customizeResponse(status, responseEntity);
    }

    protected Response errorResponse(int status, ResponseEntity responseEntity, Throwable t) {
        log.info(t);// logging stack trace.

        return customizeResponse(status, responseEntity);
    }

    private Response customizeResponse(int status, ResponseEntity responseEntity) {
        return Response.status(status).entity(responseEntity).build();
    }
}
