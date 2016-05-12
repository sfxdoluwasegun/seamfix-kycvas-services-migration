
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceClass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ServiceOfferings" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintboolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetails", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", propOrder = {
    "serviceClass",
    "serviceOfferings"
})
public class AccountDetails {

    @XmlElement(name = "ServiceClass")
    protected Integer serviceClass;
    @XmlElementRef(name = "ServiceOfferings", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfintboolean> serviceOfferings;

    /**
     * Gets the value of the serviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceClass() {
        return serviceClass;
    }

    /**
     * Sets the value of the serviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceClass(Integer value) {
        this.serviceClass = value;
    }

    /**
     * Gets the value of the serviceOfferings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintboolean }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfintboolean> getServiceOfferings() {
        return serviceOfferings;
    }

    /**
     * Sets the value of the serviceOfferings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintboolean }{@code >}
     *     
     */
    public void setServiceOfferings(JAXBElement<ArrayOfKeyValueOfintboolean> value) {
        this.serviceOfferings = value;
    }

}
