
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
 *         &lt;element name="GetAccountDetailsResult" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models}AccountDetails" minOccurs="0"/>
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
    "getAccountDetailsResult"
})
@XmlRootElement(name = "GetAccountDetailsResponse")
public class GetAccountDetailsResponse {

    @XmlElementRef(name = "GetAccountDetailsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountDetails> getAccountDetailsResult;

    /**
     * Gets the value of the getAccountDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountDetails }{@code >}
     *     
     */
    public JAXBElement<AccountDetails> getGetAccountDetailsResult() {
        return getAccountDetailsResult;
    }

    /**
     * Sets the value of the getAccountDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountDetails }{@code >}
     *     
     */
    public void setGetAccountDetailsResult(JAXBElement<AccountDetails> value) {
        this.getAccountDetailsResult = value;
    }

}
