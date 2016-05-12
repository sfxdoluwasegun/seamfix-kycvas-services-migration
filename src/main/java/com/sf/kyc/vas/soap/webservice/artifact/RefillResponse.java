
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="RefillResult" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}RefillResponse" minOccurs="0"/>
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
    "refillResult"
})
@XmlRootElement(name = "RefillResponse")
public class RefillResponse {

    @XmlElementRef(name = "RefillResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RefillResponse2> refillResult;

    /**
     * Gets the value of the refillResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RefillResponse2 }{@code >}
     *     
     */
    public JAXBElement<RefillResponse2> getRefillResult() {
        return refillResult;
    }

    /**
     * Sets the value of the refillResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RefillResponse2 }{@code >}
     *     
     */
    public void setRefillResult(JAXBElement<RefillResponse2> value) {
        this.refillResult = value;
    }

}
