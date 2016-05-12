
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
 *         &lt;element name="GetAccumulatorDetailsResult" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models}AccumulatorDetails" minOccurs="0"/>
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
    "getAccumulatorDetailsResult"
})
@XmlRootElement(name = "GetAccumulatorDetailsResponse")
public class GetAccumulatorDetailsResponse {

    @XmlElementRef(name = "GetAccumulatorDetailsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AccumulatorDetails> getAccumulatorDetailsResult;

    /**
     * Gets the value of the getAccumulatorDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccumulatorDetails }{@code >}
     *     
     */
    public JAXBElement<AccumulatorDetails> getGetAccumulatorDetailsResult() {
        return getAccumulatorDetailsResult;
    }

    /**
     * Sets the value of the getAccumulatorDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccumulatorDetails }{@code >}
     *     
     */
    public void setGetAccumulatorDetailsResult(JAXBElement<AccumulatorDetails> value) {
        this.getAccumulatorDetailsResult = value;
    }

}
