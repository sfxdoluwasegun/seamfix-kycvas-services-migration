/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.webservice.template;

import com.sf.kyc.vas.soap.webservice.artifact.AirService;
import com.sf.kyc.vas.soap.webservice.artifact.IAirService;
import com.sf.kyc.vas.util.SoapServiceLogHandler;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import lombok.extern.log4j.Log4j;

/**
 *
 * @author UCHECHUKWU
 */
@SuppressWarnings("unchecked")
@Log4j
public class BaseSoapTemplate {

    public BaseSoapTemplate() {
    }

    public IAirService getAirtelServiceViaWsdlUrl(String wsdlUrl) {
        IAirService iAirService = null;
        URL url = null;
        try {
            url = new URL(wsdlUrl);
        } catch (MalformedURLException ex) {
            log.error(ex.getMessage());
        }
        AirService service = new AirService(url);
        iAirService = service.getBasicHttpBindingIAirService();
        BindingProvider bp = (BindingProvider) iAirService;
        java.util.List<Handler> handlers = bp.getBinding().getHandlerChain();
        handlers.add(new SoapServiceLogHandler());
        bp.getBinding().setHandlerChain(handlers);
        return iAirService;

    }

}
