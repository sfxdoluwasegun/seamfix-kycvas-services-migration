
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
 *         &lt;element name="FixDedicatedAccountResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "fixDedicatedAccountResult"
})
@XmlRootElement(name = "FixDedicatedAccountResponse")
public class FixDedicatedAccountResponse {

    @XmlElement(name = "FixDedicatedAccountResult")
    protected Boolean fixDedicatedAccountResult;

    /**
     * Gets the value of the fixDedicatedAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixDedicatedAccountResult() {
        return fixDedicatedAccountResult;
    }

    /**
     * Sets the value of the fixDedicatedAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixDedicatedAccountResult(Boolean value) {
        this.fixDedicatedAccountResult = value;
    }

}
