
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountFlag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountFlag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activationStatusFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="negativeBarringStatusFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="serviceFeePeriodExpiryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="serviceFeePeriodWarningActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supervisionPeriodExpiryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supervisionPeriodWarningActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountFlag", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", propOrder = {
    "activationStatusFlag",
    "negativeBarringStatusFlag",
    "serviceFeePeriodExpiryFlag",
    "serviceFeePeriodWarningActiveFlag",
    "supervisionPeriodExpiryFlag",
    "supervisionPeriodWarningActiveFlag"
})
public class AccountFlag {

    @XmlElementRef(name = "activationStatusFlag", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> activationStatusFlag;
    @XmlElementRef(name = "negativeBarringStatusFlag", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> negativeBarringStatusFlag;
    @XmlElementRef(name = "serviceFeePeriodExpiryFlag", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> serviceFeePeriodExpiryFlag;
    @XmlElementRef(name = "serviceFeePeriodWarningActiveFlag", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> serviceFeePeriodWarningActiveFlag;
    @XmlElementRef(name = "supervisionPeriodExpiryFlag", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> supervisionPeriodExpiryFlag;
    @XmlElementRef(name = "supervisionPeriodWarningActiveFlag", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> supervisionPeriodWarningActiveFlag;

    /**
     * Gets the value of the activationStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getActivationStatusFlag() {
        return activationStatusFlag;
    }

    /**
     * Sets the value of the activationStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setActivationStatusFlag(JAXBElement<Boolean> value) {
        this.activationStatusFlag = value;
    }

    /**
     * Gets the value of the negativeBarringStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNegativeBarringStatusFlag() {
        return negativeBarringStatusFlag;
    }

    /**
     * Sets the value of the negativeBarringStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNegativeBarringStatusFlag(JAXBElement<Boolean> value) {
        this.negativeBarringStatusFlag = value;
    }

    /**
     * Gets the value of the serviceFeePeriodExpiryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getServiceFeePeriodExpiryFlag() {
        return serviceFeePeriodExpiryFlag;
    }

    /**
     * Sets the value of the serviceFeePeriodExpiryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setServiceFeePeriodExpiryFlag(JAXBElement<Boolean> value) {
        this.serviceFeePeriodExpiryFlag = value;
    }

    /**
     * Gets the value of the serviceFeePeriodWarningActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getServiceFeePeriodWarningActiveFlag() {
        return serviceFeePeriodWarningActiveFlag;
    }

    /**
     * Sets the value of the serviceFeePeriodWarningActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setServiceFeePeriodWarningActiveFlag(JAXBElement<Boolean> value) {
        this.serviceFeePeriodWarningActiveFlag = value;
    }

    /**
     * Gets the value of the supervisionPeriodExpiryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSupervisionPeriodExpiryFlag() {
        return supervisionPeriodExpiryFlag;
    }

    /**
     * Sets the value of the supervisionPeriodExpiryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSupervisionPeriodExpiryFlag(JAXBElement<Boolean> value) {
        this.supervisionPeriodExpiryFlag = value;
    }

    /**
     * Gets the value of the supervisionPeriodWarningActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSupervisionPeriodWarningActiveFlag() {
        return supervisionPeriodWarningActiveFlag;
    }

    /**
     * Sets the value of the supervisionPeriodWarningActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSupervisionPeriodWarningActiveFlag(JAXBElement<Boolean> value) {
        this.supervisionPeriodWarningActiveFlag = value;
    }

}
