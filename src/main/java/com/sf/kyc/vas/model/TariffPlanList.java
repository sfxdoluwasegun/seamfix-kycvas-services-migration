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
@XmlRootElement(name = "TariffPlanList")
@XmlAccessorType(XmlAccessType.FIELD)
public class TariffPlanList implements Serializable {

    @XmlElement(name = "tariffplans")
    private List<TariffPlan> tariffplans;

    public List<TariffPlan> getTariffplans() {
        return tariffplans;
    }

    public void setTariffplans(List<TariffPlan> tariffplans) {
        this.tariffplans = tariffplans;
    }

}
