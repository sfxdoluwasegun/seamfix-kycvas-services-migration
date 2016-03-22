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
@XmlRootElement(name = "VtuTopUpRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class VtuTopUpRequest implements Serializable {

    @XmlElement(required = true)
    private String vtuType;
    @XmlElement(required = true)
    private String username;
    @XmlElement(required = true)
    private String walletId;
    @XmlElement(required = true)
    private double amount;
    @XmlElement(required = true)
    private String msisdn;
    @XmlElement(required = true)
    private String clientChannel;
    @XmlElement(required = true)
    private String encryptedPin;

    public String getVtuType() {
        return vtuType;
    }

    public void setVtuType(String vtuType) {
        this.vtuType = vtuType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getClientChannel() {
        return clientChannel;
    }

    public void setClientChannel(String clientChannel) {
        this.clientChannel = clientChannel;
    }

    public String getEncryptedPin() {
        return encryptedPin;
    }

    public void setEncryptedPin(String encryptedPin) {
        this.encryptedPin = encryptedPin;
    }

}
