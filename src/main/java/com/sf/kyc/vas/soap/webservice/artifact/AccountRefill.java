
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountRefill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountRefill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountFlags" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}AccountFlag" minOccurs="0"/>
 *         &lt;element name="accountValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditClearanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dedicatedAccountInformation" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}ArrayOfDedicatedAccountInformation" minOccurs="0"/>
 *         &lt;element name="promotionPlanID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceClassCurrent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serviceClassOriginal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serviceClassTemporaryExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="serviceFeeExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="serviceRemovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="supervisionExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountRefill", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", propOrder = {
    "accountFlags",
    "accountValue1",
    "accountValue2",
    "creditClearanceDate",
    "dedicatedAccountInformation",
    "promotionPlanID",
    "serviceClassCurrent",
    "serviceClassOriginal",
    "serviceClassTemporaryExpiryDate",
    "serviceFeeExpiryDate",
    "serviceRemovalDate",
    "supervisionExpiryDate"
})
public class AccountRefill {

    @XmlElementRef(name = "accountFlags", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountFlag> accountFlags;
    @XmlElementRef(name = "accountValue1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountValue1;
    @XmlElementRef(name = "accountValue2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountValue2;
    @XmlElementRef(name = "creditClearanceDate", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> creditClearanceDate;
    @XmlElementRef(name = "dedicatedAccountInformation", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDedicatedAccountInformation> dedicatedAccountInformation;
    @XmlElementRef(name = "promotionPlanID", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionPlanID;
    protected Integer serviceClassCurrent;
    @XmlElementRef(name = "serviceClassOriginal", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serviceClassOriginal;
    @XmlElementRef(name = "serviceClassTemporaryExpiryDate", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> serviceClassTemporaryExpiryDate;
    @XmlElementRef(name = "serviceFeeExpiryDate", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> serviceFeeExpiryDate;
    @XmlElementRef(name = "serviceRemovalDate", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> serviceRemovalDate;
    @XmlElementRef(name = "supervisionExpiryDate", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> supervisionExpiryDate;

    /**
     * Gets the value of the accountFlags property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountFlag }{@code >}
     *     
     */
    public JAXBElement<AccountFlag> getAccountFlags() {
        return accountFlags;
    }

    /**
     * Sets the value of the accountFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountFlag }{@code >}
     *     
     */
    public void setAccountFlags(JAXBElement<AccountFlag> value) {
        this.accountFlags = value;
    }

    /**
     * Gets the value of the accountValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountValue1() {
        return accountValue1;
    }

    /**
     * Sets the value of the accountValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountValue1(JAXBElement<String> value) {
        this.accountValue1 = value;
    }

    /**
     * Gets the value of the accountValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountValue2() {
        return accountValue2;
    }

    /**
     * Sets the value of the accountValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountValue2(JAXBElement<String> value) {
        this.accountValue2 = value;
    }

    /**
     * Gets the value of the creditClearanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreditClearanceDate() {
        return creditClearanceDate;
    }

    /**
     * Sets the value of the creditClearanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreditClearanceDate(JAXBElement<XMLGregorianCalendar> value) {
        this.creditClearanceDate = value;
    }

    /**
     * Gets the value of the dedicatedAccountInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDedicatedAccountInformation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDedicatedAccountInformation> getDedicatedAccountInformation() {
        return dedicatedAccountInformation;
    }

    /**
     * Sets the value of the dedicatedAccountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDedicatedAccountInformation }{@code >}
     *     
     */
    public void setDedicatedAccountInformation(JAXBElement<ArrayOfDedicatedAccountInformation> value) {
        this.dedicatedAccountInformation = value;
    }

    /**
     * Gets the value of the promotionPlanID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionPlanID() {
        return promotionPlanID;
    }

    /**
     * Sets the value of the promotionPlanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionPlanID(JAXBElement<String> value) {
        this.promotionPlanID = value;
    }

    /**
     * Gets the value of the serviceClassCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceClassCurrent() {
        return serviceClassCurrent;
    }

    /**
     * Sets the value of the serviceClassCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceClassCurrent(Integer value) {
        this.serviceClassCurrent = value;
    }

    /**
     * Gets the value of the serviceClassOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServiceClassOriginal() {
        return serviceClassOriginal;
    }

    /**
     * Sets the value of the serviceClassOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServiceClassOriginal(JAXBElement<Integer> value) {
        this.serviceClassOriginal = value;
    }

    /**
     * Gets the value of the serviceClassTemporaryExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getServiceClassTemporaryExpiryDate() {
        return serviceClassTemporaryExpiryDate;
    }

    /**
     * Sets the value of the serviceClassTemporaryExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setServiceClassTemporaryExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.serviceClassTemporaryExpiryDate = value;
    }

    /**
     * Gets the value of the serviceFeeExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getServiceFeeExpiryDate() {
        return serviceFeeExpiryDate;
    }

    /**
     * Sets the value of the serviceFeeExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setServiceFeeExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.serviceFeeExpiryDate = value;
    }

    /**
     * Gets the value of the serviceRemovalDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getServiceRemovalDate() {
        return serviceRemovalDate;
    }

    /**
     * Sets the value of the serviceRemovalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setServiceRemovalDate(JAXBElement<XMLGregorianCalendar> value) {
        this.serviceRemovalDate = value;
    }

    /**
     * Gets the value of the supervisionExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSupervisionExpiryDate() {
        return supervisionExpiryDate;
    }

    /**
     * Sets the value of the supervisionExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSupervisionExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.supervisionExpiryDate = value;
    }

}
