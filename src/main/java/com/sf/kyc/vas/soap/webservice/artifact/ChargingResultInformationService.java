
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingResultInformationService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargingResultInformationService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cost1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cost2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargingResultInformationService", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", propOrder = {
    "cost1",
    "cost2"
})
public class ChargingResultInformationService {

    @XmlElementRef(name = "cost1", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cost1;
    @XmlElementRef(name = "cost2", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cost2;

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

}
