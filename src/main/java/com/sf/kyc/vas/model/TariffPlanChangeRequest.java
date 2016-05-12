/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author UCHECHUKWU
 */
@XmlRootElement(name = "TariffPlanChangeRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class TariffPlanChangeRequest implements Serializable {

    @XmlElement(required = true)
    private int serviceClass;
    @XmlElement(required = true)
    private String customerMsisdn;
    @XmlElement(required = true)
    private String deviceMacAddress;
    @XmlElement(required = true)
    private String senderId;
    @XmlElement(required = true)
    private String reference;
    @XmlElement(required = true)
    private String clientVasRequestChannelType;

    public int getServiceClass() {
        return serviceClass;
    }

    public void setServiceClass(int serviceClass) {
        this.serviceClass = serviceClass;
    }

    public String getCustomerMsisdn() {
        return customerMsisdn;
    }

    public void setCustomerMsisdn(String customerMsisdn) {
        this.customerMsisdn = customerMsisdn;
    }

    public String getDeviceMacAddress() {
        return deviceMacAddress;
    }

    public void setDeviceMacAddress(String deviceMacAddress) {
        this.deviceMacAddress = deviceMacAddress;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getClientVasRequestChannelType() {
        return clientVasRequestChannelType;
    }

    public void setClientVasRequestChannelType(String clientVasRequestChannelType) {
        this.clientVasRequestChannelType = clientVasRequestChannelType;
    }

}
