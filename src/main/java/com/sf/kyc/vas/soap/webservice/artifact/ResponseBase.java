
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargingResultInformation" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}ChargingResultInformation" minOccurs="0"/>
 *         &lt;element name="languageIDCurrent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="originOperatorID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="originTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBase", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", propOrder = {
    "chargingResultInformation",
    "languageIDCurrent",
    "originOperatorID",
    "originTransactionID",
    "responseCode"
})
@XmlSeeAlso({
    RefillResponse2 .class,
    GetBalanceAndDateResponse2 .class
})
public class ResponseBase {

    @XmlElementRef(name = "chargingResultInformation", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<ChargingResultInformation> chargingResultInformation;
    @XmlElementRef(name = "languageIDCurrent", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> languageIDCurrent;
    @XmlElementRef(name = "originOperatorID", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> originOperatorID;
    @XmlElementRef(name = "originTransactionID", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originTransactionID;
    protected Integer responseCode;

    /**
     * Gets the value of the chargingResultInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChargingResultInformation }{@code >}
     *     
     */
    public JAXBElement<ChargingResultInformation> getChargingResultInformation() {
        return chargingResultInformation;
    }

    /**
     * Sets the value of the chargingResultInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChargingResultInformation }{@code >}
     *     
     */
    public void setChargingResultInformation(JAXBElement<ChargingResultInformation> value) {
        this.chargingResultInformation = value;
    }

    /**
     * Gets the value of the languageIDCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLanguageIDCurrent() {
        return languageIDCurrent;
    }

    /**
     * Sets the value of the languageIDCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLanguageIDCurrent(JAXBElement<Integer> value) {
        this.languageIDCurrent = value;
    }

    /**
     * Gets the value of the originOperatorID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOriginOperatorID() {
        return originOperatorID;
    }

    /**
     * Sets the value of the originOperatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOriginOperatorID(JAXBElement<Integer> value) {
        this.originOperatorID = value;
    }

    /**
     * Gets the value of the originTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginTransactionID() {
        return originTransactionID;
    }

    /**
     * Sets the value of the originTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginTransactionID(JAXBElement<String> value) {
        this.originTransactionID = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseCode(Integer value) {
        this.responseCode = value;
    }

}
