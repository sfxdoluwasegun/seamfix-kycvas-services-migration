/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.util;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author UCHECHUKWU
 */
public class GenericMarshallerUnmarhsaller<T> {

    public String convertObjectToXML(T object) {
        try {
            StringWriter stringWriter = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(object, stringWriter);
            return stringWriter.toString();
        } catch (JAXBException e) {
            System.err.println(String.format("Exception while marshalling: %s", e.getMessage()));
        }
        return null;
    }

    public JAXBContext jAXBContext(T object) {
        try {
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            return context;
        } catch (JAXBException e) {
            System.err.println(String.format("Exception while marshalling: %s", e.getMessage()));
        }
        return null;
    }

    public T convertXMLToObject(Class clazz, String xml) {
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller um = context.createUnmarshaller();
            return (T) um.unmarshal(new StringReader(xml));
        } catch (JAXBException je) {
            throw new RuntimeException("Error interpreting XML response", je);
        }
    }

}
