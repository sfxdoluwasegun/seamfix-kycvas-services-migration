
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FafInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FafInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FafIndicator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FafNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FafInfo", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", propOrder = {
    "fafIndicator",
    "fafNumber",
    "owner"
})
public class FafInfo {

    @XmlElement(name = "FafIndicator")
    protected Integer fafIndicator;
    @XmlElementRef(name = "FafNumber", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fafNumber;
    @XmlElementRef(name = "Owner", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> owner;

    /**
     * Gets the value of the fafIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFafIndicator() {
        return fafIndicator;
    }

    /**
     * Sets the value of the fafIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFafIndicator(Integer value) {
        this.fafIndicator = value;
    }

    /**
     * Gets the value of the fafNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFafNumber() {
        return fafNumber;
    }

    /**
     * Sets the value of the fafNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFafNumber(JAXBElement<String> value) {
        this.fafNumber = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwner(JAXBElement<String> value) {
        this.owner = value;
    }

}
