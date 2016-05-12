
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
 *         &lt;element name="GetBalanceAndDateResult" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}GetBalanceAndDateResponse" minOccurs="0"/>
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
    "getBalanceAndDateResult"
})
@XmlRootElement(name = "GetBalanceAndDateResponse")
public class GetBalanceAndDateResponse {

    @XmlElementRef(name = "GetBalanceAndDateResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetBalanceAndDateResponse2> getBalanceAndDateResult;

    /**
     * Gets the value of the getBalanceAndDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetBalanceAndDateResponse2 }{@code >}
     *     
     */
    public JAXBElement<GetBalanceAndDateResponse2> getGetBalanceAndDateResult() {
        return getBalanceAndDateResult;
    }

    /**
     * Sets the value of the getBalanceAndDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetBalanceAndDateResponse2 }{@code >}
     *     
     */
    public void setGetBalanceAndDateResult(JAXBElement<GetBalanceAndDateResponse2> value) {
        this.getBalanceAndDateResult = value;
    }

}
