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
@XmlRootElement(name = "VoiceBundle")
@XmlAccessorType(XmlAccessType.FIELD)
public class VoiceBundle implements Serializable {

    @XmlElement()
    private String pretupsValue;

    @XmlElement()
    private String ercProductCategory;

    @XmlElement()
    private String productName;

    @XmlElement()
    private String productValue;

    @XmlElement()
    private int versionCount;

    public String getPretupsValue() {
        return pretupsValue;
    }

    public void setPretupsValue(String pretupsValue) {
        this.pretupsValue = pretupsValue;
    }

    public String getErcProductCategory() {
        return ercProductCategory;
    }

    public void setErcProductCategory(String ercProductCategory) {
        this.ercProductCategory = ercProductCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductValue() {
        return productValue;
    }

    public void setProductValue(String productValue) {
        this.productValue = productValue;
    }

    public int getVersionCount() {
        return versionCount;
    }

    public void setVersionCount(int versionCount) {
        this.versionCount = versionCount;
    }

}
