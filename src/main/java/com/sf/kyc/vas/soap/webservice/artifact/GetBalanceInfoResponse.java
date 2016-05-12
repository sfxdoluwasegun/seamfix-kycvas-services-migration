
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
 *         &lt;element name="GetBalanceInfoResult" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models}BalanceInfo" minOccurs="0"/>
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
    "getBalanceInfoResult"
})
@XmlRootElement(name = "GetBalanceInfoResponse")
public class GetBalanceInfoResponse {

    @XmlElementRef(name = "GetBalanceInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<BalanceInfo> getBalanceInfoResult;

    /**
     * Gets the value of the getBalanceInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BalanceInfo }{@code >}
     *     
     */
    public JAXBElement<BalanceInfo> getGetBalanceInfoResult() {
        return getBalanceInfoResult;
    }

    /**
     * Sets the value of the getBalanceInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BalanceInfo }{@code >}
     *     
     */
    public void setGetBalanceInfoResult(JAXBElement<BalanceInfo> value) {
        this.getBalanceInfoResult = value;
    }

}
