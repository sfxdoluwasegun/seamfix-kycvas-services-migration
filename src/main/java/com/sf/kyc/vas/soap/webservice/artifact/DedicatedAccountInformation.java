
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DedicatedAccountInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DedicatedAccountInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dedicatedAccountID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dedicatedAccountValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dedicatedAccountValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DedicatedAccountInformation", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", propOrder = {
    "dedicatedAccountID",
    "dedicatedAccountValue1",
    "dedicatedAccountValue2",
    "expiryDate"
})
public class DedicatedAccountInformation {

    protected Integer dedicatedAccountID;
    @XmlElementRef(name = "dedicatedAccountValue1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dedicatedAccountValue1;
    @XmlElementRef(name = "dedicatedAccountValue2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dedicatedAccountValue2;
    @XmlElementRef(name = "expiryDate", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expiryDate;

    /**
     * Gets the value of the dedicatedAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDedicatedAccountID() {
        return dedicatedAccountID;
    }

    /**
     * Sets the value of the dedicatedAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDedicatedAccountID(Integer value) {
        this.dedicatedAccountID = value;
    }

    /**
     * Gets the value of the dedicatedAccountValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDedicatedAccountValue1() {
        return dedicatedAccountValue1;
    }

    /**
     * Sets the value of the dedicatedAccountValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDedicatedAccountValue1(JAXBElement<String> value) {
        this.dedicatedAccountValue1 = value;
    }

    /**
     * Gets the value of the dedicatedAccountValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDedicatedAccountValue2() {
        return dedicatedAccountValue2;
    }

    /**
     * Sets the value of the dedicatedAccountValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDedicatedAccountValue2(JAXBElement<String> value) {
        this.dedicatedAccountValue2 = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expiryDate = value;
    }

}
