/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.webservice.template;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sf.kyc.vas.model.TariffPlanChangeResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import lombok.extern.log4j.Log4j;

/**
 *
 * @author UCHECHUKWU
 */
@SuppressWarnings("unchecked")
@Log4j
public class BaseRestTemplate {

    public Client client = null;

    public TariffPlanChangeResponse getMethod(String baseUrl, MultivaluedMap<String, Object> headers) throws Exception {
        try {
            client = ClientBuilder.newClient();
            ObjectMapper mapper = new ObjectMapper();
            WebTarget target = client.target(baseUrl);
            Response rs = target.request().headers(headers).get();
            rs.bufferEntity();
            log.info("status" + rs.getStatus());
            String re = rs.readEntity(String.class);
            log.info("Response  " + re);
            TariffPlanChangeResponse resp = mapper.readValue(re, TariffPlanChangeResponse.class);
            return resp;
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return null;
        } finally {
            client.close();
        }
    }

}
