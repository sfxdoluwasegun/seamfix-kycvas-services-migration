/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author UCHECHUKWU
 */
@XmlRootElement(name = "VasLogRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class VasLogRequest implements Serializable {

    @XmlElement(required = true)
    @JsonProperty(required = true)
    private double amount;
    @XmlElement(required = true)
    @JsonProperty(required = true)
    private String narration;
    @XmlElement(required = true)
    @JsonProperty(required = true)
    private String deviceMacAddress;
    @JsonProperty(required = true)
    @XmlElement(required = true)
    private String deviceTag;
    @XmlElement(required = true)
    @JsonProperty(required = true)
    private String senderId;
    @XmlElement(required = true)
    @JsonProperty(required = true)
    private String productCode;

    @XmlElement(required = true)
    @JsonProperty(required = true)
    private String productName;
    @XmlElement(required = true)
    @JsonProperty(required = true)
    private Date requestDate;
    @XmlElement(required = true)
    @JsonProperty(required = true)
    private String vasRequestStatus;

    @XmlElement(required = true)
    @JsonProperty(required = true)
    private String vasRequestCategory;

    @XmlElement(required = true)
    @JsonProperty(required = true)
    private String clientVasRequestChannelType;

    @XmlElement(required = true)
    @JsonProperty(required = true)
    private String requestInterface;

    @XmlElement(required = true)
    @JsonProperty(required = true)
    private String vasRequestReference;

    @JsonProperty(required = true)
    private String responseReference;

    @XmlElement(required = false)
    private String requestXml;

    @XmlElement(required = true)
    @JsonProperty(required = true)
    private String customerMsisdn;

    @XmlElement(required = false)
    private String responseXml;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getVasRequestStatus() {
        return vasRequestStatus;
    }

    public void setVasRequestStatus(String vasRequestStatus) {
        this.vasRequestStatus = vasRequestStatus;
    }

    public String getVasRequestCategory() {
        return vasRequestCategory;
    }

    public void setVasRequestCategory(String vasRequestCategory) {
        this.vasRequestCategory = vasRequestCategory;
    }

    public String getClientVasRequestChannelType() {
        return clientVasRequestChannelType;
    }

    public void setClientVasRequestChannelType(String clientVasRequestChannelType) {
        this.clientVasRequestChannelType = clientVasRequestChannelType;
    }

    public String getRequestInterface() {
        return requestInterface;
    }

    public void setRequestInterface(String requestInterface) {
        this.requestInterface = requestInterface;
    }

    public String getVasRequestReference() {
        return vasRequestReference;
    }

    public void setVasRequestReference(String vasRequestReference) {
        this.vasRequestReference = vasRequestReference;
    }

    public String getResponseReference() {
        return responseReference;
    }

    public void setResponseReference(String responseReference) {
        this.responseReference = responseReference;
    }

    public String getRequestXml() {
        return requestXml;
    }

    public void setRequestXml(String requestXml) {
        this.requestXml = requestXml;
    }

    public String getCustomerMsisdn() {
        return customerMsisdn;
    }

    public void setCustomerMsisdn(String customerMsisdn) {
        this.customerMsisdn = customerMsisdn;
    }

    public String getResponseXml() {
        return responseXml;
    }

    public void setResponseXml(String responseXml) {
        this.responseXml = responseXml;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

}
