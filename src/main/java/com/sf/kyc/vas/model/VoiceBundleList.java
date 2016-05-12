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
@XmlRootElement(name = "VoiceBundleList")
@XmlAccessorType(XmlAccessType.FIELD)
public class VoiceBundleList implements Serializable {

    @XmlElement(name = "voicebundles")
    private List<VoiceBundle> voicebundles;

    public List<VoiceBundle> getVoicebundles() {
        return voicebundles;
    }

    public void setVoicebundles(List<VoiceBundle> voicebundles) {
        this.voicebundles = voicebundles;
    }

}
