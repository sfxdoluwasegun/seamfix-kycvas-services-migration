
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
 *         &lt;element name="FixDedicatedAccountAAPCNResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "fixDedicatedAccountAAPCNResult"
})
@XmlRootElement(name = "FixDedicatedAccountAAPCNResponse")
public class FixDedicatedAccountAAPCNResponse {

    @XmlElement(name = "FixDedicatedAccountAAPCNResult")
    protected Boolean fixDedicatedAccountAAPCNResult;

    /**
     * Gets the value of the fixDedicatedAccountAAPCNResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixDedicatedAccountAAPCNResult() {
        return fixDedicatedAccountAAPCNResult;
    }

    /**
     * Sets the value of the fixDedicatedAccountAAPCNResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixDedicatedAccountAAPCNResult(Boolean value) {
        this.fixDedicatedAccountAAPCNResult = value;
    }

}
