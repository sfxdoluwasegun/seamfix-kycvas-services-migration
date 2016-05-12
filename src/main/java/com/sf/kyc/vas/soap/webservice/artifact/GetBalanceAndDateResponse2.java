
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetBalanceAndDateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBalanceAndDateResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}ResponseBase">
 *       &lt;sequence>
 *         &lt;element name="accountValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditClearanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="currency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dedicatedAccountInformation" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}ArrayOfDedicatedAccountInformation" minOccurs="0"/>
 *         &lt;element name="serviceClassCurrent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serviceFeeExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="serviceRemovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="supervisionExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="temporaryBlockedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBalanceAndDateResponse", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", propOrder = {
    "accountValue1",
    "accountValue2",
    "creditClearanceDate",
    "currency1",
    "currency2",
    "dedicatedAccountInformation",
    "serviceClassCurrent",
    "serviceFeeExpiryDate",
    "serviceRemovalDate",
    "supervisionExpiryDate",
    "temporaryBlockedFlag"
})
public class GetBalanceAndDateResponse2
    extends ResponseBase
{

    @XmlElementRef(name = "accountValue1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountValue1;
    @XmlElementRef(name = "accountValue2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountValue2;
    @XmlElementRef(name = "creditClearanceDate", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> creditClearanceDate;
    @XmlElementRef(name = "currency1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency1;
    @XmlElementRef(name = "currency2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency2;
    @XmlElementRef(name = "dedicatedAccountInformation", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDedicatedAccountInformation> dedicatedAccountInformation;
    protected Integer serviceClassCurrent;
    @XmlElementRef(name = "serviceFeeExpiryDate", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> serviceFeeExpiryDate;
    @XmlElementRef(name = "serviceRemovalDate", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> serviceRemovalDate;
    @XmlElementRef(name = "supervisionExpiryDate", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> supervisionExpiryDate;
    @XmlElementRef(name = "temporaryBlockedFlag", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> temporaryBlockedFlag;

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
     * Gets the value of the currency1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency1() {
        return currency1;
    }

    /**
     * Sets the value of the currency1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency1(JAXBElement<String> value) {
        this.currency1 = value;
    }

    /**
     * Gets the value of the currency2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency2() {
        return currency2;
    }

    /**
     * Sets the value of the currency2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency2(JAXBElement<String> value) {
        this.currency2 = value;
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

    /**
     * Gets the value of the temporaryBlockedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTemporaryBlockedFlag() {
        return temporaryBlockedFlag;
    }

    /**
     * Sets the value of the temporaryBlockedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTemporaryBlockedFlag(JAXBElement<Boolean> value) {
        this.temporaryBlockedFlag = value;
    }

}
