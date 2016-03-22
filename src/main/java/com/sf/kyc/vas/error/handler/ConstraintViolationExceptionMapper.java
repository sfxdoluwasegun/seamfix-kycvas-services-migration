/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.error.handler;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import lombok.extern.log4j.Log4j;

/**
 *
 * @author UCHECHUKWU
 */
@Log4j
//@Provider
public class ConstraintViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(ConstraintViolationException ex) {
        ErrorMessage errorMessage = new ErrorMessage();
        setHttpStatus(ex, errorMessage);
        errorMessage.setCode(500);
        errorMessage.setMessage("<Response><ResponseCode>02</ResponseCode><ResponseDescription>Service/System Error</ResponseDescription></Response>");
        errorMessage.setDeveloperMessage(ex.getStackTrace().toString());
        log.error(ex.getMessage());
        log.error(ex.getStackTrace().toString());
        errorMessage.setLink("");
        return Response.status(errorMessage.getStatus())
                .entity(errorMessage.message)
                .type(MediaType.APPLICATION_XML)
                .build();
    }

    private void setHttpStatus(Throwable ex, ErrorMessage errorMessage) {
        if (ex instanceof WebApplicationException) { //NICE way to combine both of methods, say it in the blog 
            errorMessage.setStatus(((WebApplicationException) ex).getResponse().getStatus());
        } else if (ex instanceof Exception) { //NICE way to combine both of methods, say it in the blog 
            errorMessage.setStatus(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
        } else {
            errorMessage.setStatus(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()); //defaults to internal server error 500
        }
    }
}
