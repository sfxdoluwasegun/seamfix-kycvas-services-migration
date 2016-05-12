
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetServiceClassResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getServiceClassResult"
})
@XmlRootElement(name = "GetServiceClassResponse")
public class GetServiceClassResponse {

    @XmlElement(name = "GetServiceClassResult")
    protected Integer getServiceClassResult;

    /**
     * Gets the value of the getServiceClassResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetServiceClassResult() {
        return getServiceClassResult;
    }

    /**
     * Sets the value of the getServiceClassResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetServiceClassResult(Integer value) {
        this.getServiceClassResult = value;
    }

}
