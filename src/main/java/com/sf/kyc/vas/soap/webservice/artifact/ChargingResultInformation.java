
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingResultInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargingResultInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargingResultCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="chargingResultInformationService" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}ChargingResultInformationService" minOccurs="0"/>
 *         &lt;element name="cost1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cost2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reservationCorrelationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargingResultInformation", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", propOrder = {
    "chargingResultCode",
    "chargingResultInformationService",
    "cost1",
    "cost2",
    "currency1",
    "currency2",
    "reservationCorrelationID"
})
public class ChargingResultInformation {

    @XmlElementRef(name = "chargingResultCode", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> chargingResultCode;
    @XmlElementRef(name = "chargingResultInformationService", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<ChargingResultInformationService> chargingResultInformationService;
    @XmlElementRef(name = "cost1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cost1;
    @XmlElementRef(name = "cost2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cost2;
    @XmlElementRef(name = "currency1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency1;
    @XmlElementRef(name = "currency2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency2;
    @XmlElementRef(name = "reservationCorrelationID", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reservationCorrelationID;

    /**
     * Gets the value of the chargingResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getChargingResultCode() {
        return chargingResultCode;
    }

    /**
     * Sets the value of the chargingResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setChargingResultCode(JAXBElement<Integer> value) {
        this.chargingResultCode = value;
    }

    /**
     * Gets the value of the chargingResultInformationService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChargingResultInformationService }{@code >}
     *     
     */
    public JAXBElement<ChargingResultInformationService> getChargingResultInformationService() {
        return chargingResultInformationService;
    }

    /**
     * Sets the value of the chargingResultInformationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChargingResultInformationService }{@code >}
     *     
     */
    public void setChargingResultInformationService(JAXBElement<ChargingResultInformationService> value) {
        this.chargingResultInformationService = value;
    }

    /**
     * Gets the value of the cost1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCost1() {
        return cost1;
    }

    /**
     * Sets the value of the cost1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCost1(JAXBElement<String> value) {
        this.cost1 = value;
    }

    /**
     * Gets the value of the cost2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCost2() {
        return cost2;
    }

    /**
     * Sets the value of the cost2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCost2(JAXBElement<String> value) {
        this.cost2 = value;
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
     * Gets the value of the reservationCorrelationID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReservationCorrelationID() {
        return reservationCorrelationID;
    }

    /**
     * Sets the value of the reservationCorrelationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReservationCorrelationID(JAXBElement<Integer> value) {
        this.reservationCorrelationID = value;
    }

}
