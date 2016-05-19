/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.util;

import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 *
 * @author UCHECHUKWU
 */
public class SoapServiceLogHandler implements SOAPHandler<SOAPMessageContext> {

    @Override
    public Set<QName> getHeaders() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void close(MessageContext arg0) {
		// TODO Auto-generated method stub

    }

    @Override
    public boolean handleFault(SOAPMessageContext arg0) {
        SOAPMessage message = arg0.getMessage();
        try {
            message.writeTo(System.out);
        } catch (SOAPException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//                 ByteArrayOutputStream baos = new ByteArrayOutputStream();
//                message.writeTo(baos); 
//                result = baos.toString();
        return true;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext arg0) {
        SOAPMessage message = arg0.getMessage();
        boolean isOutboundMessage = (Boolean) arg0.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (isOutboundMessage) {
            System.out.println("OUTBOUND MESSAGE\n");

        } else {
            System.out.println("INBOUND MESSAGE\n");
        }
        try {
            message.writeTo(System.out);
            System.out.println("Check\n");
            System.out.println("Check\n");
            System.out.println(message.toString());
        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
