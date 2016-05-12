
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DedicatedAccountRefillInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DedicatedAccountRefillInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clearedValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearedValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dedicatedAccountID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expiryDateExtended" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="refillAmount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refillAmount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DedicatedAccountRefillInformation", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", propOrder = {
    "clearedValue1",
    "clearedValue2",
    "dedicatedAccountID",
    "expiryDateExtended",
    "refillAmount1",
    "refillAmount2"
})
public class DedicatedAccountRefillInformation {

    @XmlElementRef(name = "clearedValue1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clearedValue1;
    @XmlElementRef(name = "clearedValue2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clearedValue2;
    protected Integer dedicatedAccountID;
    protected Integer expiryDateExtended;
    @XmlElementRef(name = "refillAmount1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refillAmount1;
    @XmlElementRef(name = "refillAmount2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refillAmount2;

    /**
     * Gets the value of the clearedValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClearedValue1() {
        return clearedValue1;
    }

    /**
     * Sets the value of the clearedValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClearedValue1(JAXBElement<String> value) {
        this.clearedValue1 = value;
    }

    /**
     * Gets the value of the clearedValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClearedValue2() {
        return clearedValue2;
    }

    /**
     * Sets the value of the clearedValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClearedValue2(JAXBElement<String> value) {
        this.clearedValue2 = value;
    }

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
     * Gets the value of the expiryDateExtended property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiryDateExtended() {
        return expiryDateExtended;
    }

    /**
     * Sets the value of the expiryDateExtended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiryDateExtended(Integer value) {
        this.expiryDateExtended = value;
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

}
