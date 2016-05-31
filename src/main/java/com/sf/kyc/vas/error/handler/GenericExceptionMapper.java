/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.error.handler;

import com.sf.kyc.vas.util.Utilities;
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
/**
 *
 * @author UCHECHUKWU
 */
@Log4j
@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable ex) {
        log.debug(Utilities.getStackTrace(ex));
        ErrorMessage errorMessage = new ErrorMessage();
        setHttpStatus(ex, errorMessage);
        errorMessage.setCode(500);
        errorMessage.setMessage("{'ResponseCode':'02','ResponseDescription':'Unexpected exception::Hint:" + ex.getMessage() + ".Please contact the Administrator'");
        errorMessage.setDeveloperMessage(ex.getStackTrace().toString());
        errorMessage.setLink("");
        log.debug(ex.getMessage());
        return Response.status(errorMessage.getStatus())
                .entity(errorMessage.message)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }

    private void setHttpStatus(Throwable ex, ErrorMessage errorMessage) {
        if (ex instanceof WebApplicationException) { //NICE way to combine both of methods, say it in the blog 
            errorMessage.setStatus(((WebApplicationException) ex).getResponse().getStatus());
        } else {
            errorMessage.setStatus(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()); //defaults to internal server error 500
        }
    }
}
