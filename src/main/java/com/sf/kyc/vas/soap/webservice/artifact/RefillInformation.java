
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RefillInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefillInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="progressionRefillCounter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="progressionRefillValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="progressionRefillValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionPlanProgressed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="promotionRefillAccumulatedValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionRefillAccumulatedValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionRefillCounter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="refillValuePromotion" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}RefillValue" minOccurs="0"/>
 *         &lt;element name="refillValueTotal" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}RefillValue" minOccurs="0"/>
 *         &lt;element name="serviceClassCurrent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serviceClassTemporaryExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="serviceFeeDaysSurplus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="supervisionDaysSurplus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefillInformation", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", propOrder = {
    "progressionRefillCounter",
    "progressionRefillValue1",
    "progressionRefillValue2",
    "promotionPlanProgressed",
    "promotionRefillAccumulatedValue1",
    "promotionRefillAccumulatedValue2",
    "promotionRefillCounter",
    "refillValuePromotion",
    "refillValueTotal",
    "serviceClassCurrent",
    "serviceClassTemporaryExpiryDate",
    "serviceFeeDaysSurplus",
    "supervisionDaysSurplus"
})
public class RefillInformation {

    @XmlElementRef(name = "progressionRefillCounter", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> progressionRefillCounter;
    @XmlElementRef(name = "progressionRefillValue1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> progressionRefillValue1;
    @XmlElementRef(name = "progressionRefillValue2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> progressionRefillValue2;
    @XmlElementRef(name = "promotionPlanProgressed", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> promotionPlanProgressed;
    @XmlElementRef(name = "promotionRefillAccumulatedValue1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionRefillAccumulatedValue1;
    @XmlElementRef(name = "promotionRefillAccumulatedValue2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionRefillAccumulatedValue2;
    @XmlElementRef(name = "promotionRefillCounter", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> promotionRefillCounter;
    @XmlElementRef(name = "refillValuePromotion", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<RefillValue> refillValuePromotion;
    @XmlElementRef(name = "refillValueTotal", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<RefillValue> refillValueTotal;
    @XmlElementRef(name = "serviceClassCurrent", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serviceClassCurrent;
    @XmlElementRef(name = "serviceClassTemporaryExpiryDate", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> serviceClassTemporaryExpiryDate;
    @XmlElementRef(name = "serviceFeeDaysSurplus", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serviceFeeDaysSurplus;
    @XmlElementRef(name = "supervisionDaysSurplus", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> supervisionDaysSurplus;

    /**
     * Gets the value of the progressionRefillCounter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getProgressionRefillCounter() {
        return progressionRefillCounter;
    }

    /**
     * Sets the value of the progressionRefillCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setProgressionRefillCounter(JAXBElement<Integer> value) {
        this.progressionRefillCounter = value;
    }

    /**
     * Gets the value of the progressionRefillValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgressionRefillValue1() {
        return progressionRefillValue1;
    }

    /**
     * Sets the value of the progressionRefillValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgressionRefillValue1(JAXBElement<String> value) {
        this.progressionRefillValue1 = value;
    }

    /**
     * Gets the value of the progressionRefillValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgressionRefillValue2() {
        return progressionRefillValue2;
    }

    /**
     * Sets the value of the progressionRefillValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgressionRefillValue2(JAXBElement<String> value) {
        this.progressionRefillValue2 = value;
    }

    /**
     * Gets the value of the promotionPlanProgressed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPromotionPlanProgressed() {
        return promotionPlanProgressed;
    }

    /**
     * Sets the value of the promotionPlanProgressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPromotionPlanProgressed(JAXBElement<Boolean> value) {
        this.promotionPlanProgressed = value;
    }

    /**
     * Gets the value of the promotionRefillAccumulatedValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionRefillAccumulatedValue1() {
        return promotionRefillAccumulatedValue1;
    }

    /**
     * Sets the value of the promotionRefillAccumulatedValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionRefillAccumulatedValue1(JAXBElement<String> value) {
        this.promotionRefillAccumulatedValue1 = value;
    }

    /**
     * Gets the value of the promotionRefillAccumulatedValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionRefillAccumulatedValue2() {
        return promotionRefillAccumulatedValue2;
    }

    /**
     * Sets the value of the promotionRefillAccumulatedValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionRefillAccumulatedValue2(JAXBElement<String> value) {
        this.promotionRefillAccumulatedValue2 = value;
    }

    /**
     * Gets the value of the promotionRefillCounter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPromotionRefillCounter() {
        return promotionRefillCounter;
    }

    /**
     * Sets the value of the promotionRefillCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPromotionRefillCounter(JAXBElement<Integer> value) {
        this.promotionRefillCounter = value;
    }

    /**
     * Gets the value of the refillValuePromotion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RefillValue }{@code >}
     *     
     */
    public JAXBElement<RefillValue> getRefillValuePromotion() {
        return refillValuePromotion;
    }

    /**
     * Sets the value of the refillValuePromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RefillValue }{@code >}
     *     
     */
    public void setRefillValuePromotion(JAXBElement<RefillValue> value) {
        this.refillValuePromotion = value;
    }

    /**
     * Gets the value of the refillValueTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RefillValue }{@code >}
     *     
     */
    public JAXBElement<RefillValue> getRefillValueTotal() {
        return refillValueTotal;
    }

    /**
     * Sets the value of the refillValueTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RefillValue }{@code >}
     *     
     */
    public void setRefillValueTotal(JAXBElement<RefillValue> value) {
        this.refillValueTotal = value;
    }

    /**
     * Gets the value of the serviceClassCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServiceClassCurrent() {
        return serviceClassCurrent;
    }

    /**
     * Sets the value of the serviceClassCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServiceClassCurrent(JAXBElement<Integer> value) {
        this.serviceClassCurrent = value;
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
     * Gets the value of the serviceFeeDaysSurplus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServiceFeeDaysSurplus() {
        return serviceFeeDaysSurplus;
    }

    /**
     * Sets the value of the serviceFeeDaysSurplus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServiceFeeDaysSurplus(JAXBElement<Integer> value) {
        this.serviceFeeDaysSurplus = value;
    }

    /**
     * Gets the value of the supervisionDaysSurplus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSupervisionDaysSurplus() {
        return supervisionDaysSurplus;
    }

    /**
     * Sets the value of the supervisionDaysSurplus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSupervisionDaysSurplus(JAXBElement<Integer> value) {
        this.supervisionDaysSurplus = value;
    }

}
