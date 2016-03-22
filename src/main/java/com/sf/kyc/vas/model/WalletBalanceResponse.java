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
@XmlRootElement(name = "WalletBalanceResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class WalletBalanceResponse implements Serializable {

    @XmlElement()
    private String responseCode;
    @XmlElement()
    private String responseDescription;
    @XmlElement()
    private String availableBalance;
    @XmlElement()
    private String bookBalance;
    @XmlElement()
    private String walletId;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getBookBalance() {
        return bookBalance;
    }

    public void setBookBalance(String bookBalance) {
        this.bookBalance = bookBalance;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

}
