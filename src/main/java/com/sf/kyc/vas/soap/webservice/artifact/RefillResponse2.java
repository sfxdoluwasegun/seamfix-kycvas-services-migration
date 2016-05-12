
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefillResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefillResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}ResponseBase">
 *       &lt;sequence>
 *         &lt;element name="accountAfterRefill" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}AccountRefill" minOccurs="0"/>
 *         &lt;element name="accountBeforeRefill" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}AccountRefill" minOccurs="0"/>
 *         &lt;element name="currency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masterAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionAnnouncementCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="refillFraudCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="refillInformation" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}RefillInformation" minOccurs="0"/>
 *         &lt;element name="selectedOption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionAmountConverted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voucherAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voucherGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voucherSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefillResponse", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", propOrder = {
    "accountAfterRefill",
    "accountBeforeRefill",
    "currency1",
    "currency2",
    "masterAccountNumber",
    "promotionAnnouncementCode",
    "refillFraudCount",
    "refillInformation",
    "selectedOption",
    "transactionAmount",
    "transactionAmountConverted",
    "transactionCurrency",
    "voucherAgent",
    "voucherGroup",
    "voucherSerialNumber"
})
public class RefillResponse2
    extends ResponseBase
{

    @XmlElementRef(name = "accountAfterRefill", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountRefill> accountAfterRefill;
    @XmlElementRef(name = "accountBeforeRefill", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountRefill> accountBeforeRefill;
    @XmlElementRef(name = "currency1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency1;
    @XmlElementRef(name = "currency2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency2;
    @XmlElementRef(name = "masterAccountNumber", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> masterAccountNumber;
    @XmlElementRef(name = "promotionAnnouncementCode", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> promotionAnnouncementCode;
    @XmlElementRef(name = "refillFraudCount", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> refillFraudCount;
    @XmlElementRef(name = "refillInformation", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<RefillInformation> refillInformation;
    @XmlElementRef(name = "selectedOption", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> selectedOption;
    @XmlElementRef(name = "transactionAmount", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionAmount;
    @XmlElementRef(name = "transactionAmountConverted", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionAmountConverted;
    @XmlElementRef(name = "transactionCurrency", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionCurrency;
    @XmlElementRef(name = "voucherAgent", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voucherAgent;
    @XmlElementRef(name = "voucherGroup", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voucherGroup;
    @XmlElementRef(name = "voucherSerialNumber", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voucherSerialNumber;

    /**
     * Gets the value of the accountAfterRefill property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountRefill }{@code >}
     *     
     */
    public JAXBElement<AccountRefill> getAccountAfterRefill() {
        return accountAfterRefill;
    }

    /**
     * Sets the value of the accountAfterRefill property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountRefill }{@code >}
     *     
     */
    public void setAccountAfterRefill(JAXBElement<AccountRefill> value) {
        this.accountAfterRefill = value;
    }

    /**
     * Gets the value of the accountBeforeRefill property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountRefill }{@code >}
     *     
     */
    public JAXBElement<AccountRefill> getAccountBeforeRefill() {
        return accountBeforeRefill;
    }

    /**
     * Sets the value of the accountBeforeRefill property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountRefill }{@code >}
     *     
     */
    public void setAccountBeforeRefill(JAXBElement<AccountRefill> value) {
        this.accountBeforeRefill = value;
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
     * Gets the value of the masterAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMasterAccountNumber() {
        return masterAccountNumber;
    }

    /**
     * Sets the value of the masterAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMasterAccountNumber(JAXBElement<String> value) {
        this.masterAccountNumber = value;
    }

    /**
     * Gets the value of the promotionAnnouncementCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPromotionAnnouncementCode() {
        return promotionAnnouncementCode;
    }

    /**
     * Sets the value of the promotionAnnouncementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPromotionAnnouncementCode(JAXBElement<Integer> value) {
        this.promotionAnnouncementCode = value;
    }

    /**
     * Gets the value of the refillFraudCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRefillFraudCount() {
        return refillFraudCount;
    }

    /**
     * Sets the value of the refillFraudCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRefillFraudCount(JAXBElement<Integer> value) {
        this.refillFraudCount = value;
    }

    /**
     * Gets the value of the refillInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RefillInformation }{@code >}
     *     
     */
    public JAXBElement<RefillInformation> getRefillInformation() {
        return refillInformation;
    }

    /**
     * Sets the value of the refillInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RefillInformation }{@code >}
     *     
     */
    public void setRefillInformation(JAXBElement<RefillInformation> value) {
        this.refillInformation = value;
    }

    /**
     * Gets the value of the selectedOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSelectedOption() {
        return selectedOption;
    }

    /**
     * Sets the value of the selectedOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSelectedOption(JAXBElement<Integer> value) {
        this.selectedOption = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionAmount(JAXBElement<String> value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the transactionAmountConverted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionAmountConverted() {
        return transactionAmountConverted;
    }

    /**
     * Sets the value of the transactionAmountConverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionAmountConverted(JAXBElement<String> value) {
        this.transactionAmountConverted = value;
    }

    /**
     * Gets the value of the transactionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionCurrency() {
        return transactionCurrency;
    }

    /**
     * Sets the value of the transactionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionCurrency(JAXBElement<String> value) {
        this.transactionCurrency = value;
    }

    /**
     * Gets the value of the voucherAgent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoucherAgent() {
        return voucherAgent;
    }

    /**
     * Sets the value of the voucherAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoucherAgent(JAXBElement<String> value) {
        this.voucherAgent = value;
    }

    /**
     * Gets the value of the voucherGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoucherGroup() {
        return voucherGroup;
    }

    /**
     * Sets the value of the voucherGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoucherGroup(JAXBElement<String> value) {
        this.voucherGroup = value;
    }

    /**
     * Gets the value of the voucherSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoucherSerialNumber() {
        return voucherSerialNumber;
    }

    /**
     * Sets the value of the voucherSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoucherSerialNumber(JAXBElement<String> value) {
        this.voucherSerialNumber = value;
    }

}
