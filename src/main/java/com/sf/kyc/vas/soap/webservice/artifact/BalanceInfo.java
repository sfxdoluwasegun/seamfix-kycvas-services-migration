
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountValue1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AccountValue2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Currency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DedicatedAccountInformation" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models}ArrayOfDedicatedAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceInfo", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", propOrder = {
    "accountValue1",
    "accountValue2",
    "currency1",
    "currency2",
    "dedicatedAccountInformation"
})
public class BalanceInfo {

    @XmlElement(name = "AccountValue1")
    protected Integer accountValue1;
    @XmlElement(name = "AccountValue2")
    protected Integer accountValue2;
    @XmlElementRef(name = "Currency1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency1;
    @XmlElementRef(name = "Currency2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency2;
    @XmlElementRef(name = "DedicatedAccountInformation", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDedicatedAccount> dedicatedAccountInformation;

    /**
     * Gets the value of the accountValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountValue1() {
        return accountValue1;
    }

    /**
     * Sets the value of the accountValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountValue1(Integer value) {
        this.accountValue1 = value;
    }

    /**
     * Gets the value of the accountValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountValue2() {
        return accountValue2;
    }

    /**
     * Sets the value of the accountValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountValue2(Integer value) {
        this.accountValue2 = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfDedicatedAccount }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDedicatedAccount> getDedicatedAccountInformation() {
        return dedicatedAccountInformation;
    }

    /**
     * Sets the value of the dedicatedAccountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDedicatedAccount }{@code >}
     *     
     */
    public void setDedicatedAccountInformation(JAXBElement<ArrayOfDedicatedAccount> value) {
        this.dedicatedAccountInformation = value;
    }

}
