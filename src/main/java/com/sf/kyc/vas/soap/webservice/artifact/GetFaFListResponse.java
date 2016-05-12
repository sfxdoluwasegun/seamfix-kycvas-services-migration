
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
 *         &lt;element name="GetFaFListResult" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models}ArrayOfFafInfo" minOccurs="0"/>
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
    "getFaFListResult"
})
@XmlRootElement(name = "GetFaFListResponse")
public class GetFaFListResponse {

    @XmlElementRef(name = "GetFaFListResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFafInfo> getFaFListResult;

    /**
     * Gets the value of the getFaFListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFafInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFafInfo> getGetFaFListResult() {
        return getFaFListResult;
    }

    /**
     * Sets the value of the getFaFListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFafInfo }{@code >}
     *     
     */
    public void setGetFaFListResult(JAXBElement<ArrayOfFafInfo> value) {
        this.getFaFListResult = value;
    }

}
