/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author UCHECHUKWU
 */
@XmlRootElement(name = "DataBundleList")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataBundleList implements Serializable {

    @XmlElement(name = "databundles")
    private List<DataBundle> databundles;

    public List<DataBundle> getDatabundles() {
        return databundles;
    }

    public void setDatabundles(List<DataBundle> databundles) {
        this.databundles = databundles;
    }

}
