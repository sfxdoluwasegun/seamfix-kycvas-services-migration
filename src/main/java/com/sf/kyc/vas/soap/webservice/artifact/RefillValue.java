
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefillValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefillValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dedicatedAccountRefillInformation" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}ArrayOfDedicatedAccountRefillInformation" minOccurs="0"/>
 *         &lt;element name="refillAmount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refillAmount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceFeeDaysExtended" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="supervisionDaysExtended" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefillValue", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", propOrder = {
    "dedicatedAccountRefillInformation",
    "refillAmount1",
    "refillAmount2",
    "serviceFeeDaysExtended",
    "supervisionDaysExtended"
})
public class RefillValue {

    @XmlElementRef(name = "dedicatedAccountRefillInformation", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDedicatedAccountRefillInformation> dedicatedAccountRefillInformation;
    @XmlElementRef(name = "refillAmount1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refillAmount1;
    @XmlElementRef(name = "refillAmount2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refillAmount2;
    @XmlElementRef(name = "serviceFeeDaysExtended", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serviceFeeDaysExtended;
    @XmlElementRef(name = "supervisionDaysExtended", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> supervisionDaysExtended;

    /**
     * Gets the value of the dedicatedAccountRefillInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDedicatedAccountRefillInformation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDedicatedAccountRefillInformation> getDedicatedAccountRefillInformation() {
        return dedicatedAccountRefillInformation;
    }

    /**
     * Sets the value of the dedicatedAccountRefillInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDedicatedAccountRefillInformation }{@code >}
     *     
     */
    public void setDedicatedAccountRefillInformation(JAXBElement<ArrayOfDedicatedAccountRefillInformation> value) {
        this.dedicatedAccountRefillInformation = value;
    }

    /**
     * Gets the value of the refillAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefillAmount1() {
        return refillAmount1;
    }

    /**
     * Sets the value of the refillAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefillAmount1(JAXBElement<String> value) {
        this.refillAmount1 = value;
    }

    /**
     * Gets the value of the refillAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefillAmount2() {
        return refillAmount2;
    }

    /**
     * Sets the value of the refillAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefillAmount2(JAXBElement<String> value) {
        this.refillAmount2 = value;
    }

    /**
     * Gets the value of the serviceFeeDaysExtended property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServiceFeeDaysExtended() {
        return serviceFeeDaysExtended;
    }

    /**
     * Sets the value of the serviceFeeDaysExtended property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServiceFeeDaysExtended(JAXBElement<Integer> value) {
        this.serviceFeeDaysExtended = value;
    }

    /**
     * Gets the value of the supervisionDaysExtended property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSupervisionDaysExtended() {
        return supervisionDaysExtended;
    }

    /**
     * Sets the value of the supervisionDaysExtended property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSupervisionDaysExtended(JAXBElement<Integer> value) {
        this.supervisionDaysExtended = value;
    }

}
