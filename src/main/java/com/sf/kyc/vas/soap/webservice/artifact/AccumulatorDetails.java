
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccumulatorDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccumulatorDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accumulators" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models}ArrayOfAccumulator" minOccurs="0"/>
 *         &lt;element name="ServiceClass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccumulatorDetails", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", propOrder = {
    "accumulators",
    "serviceClass"
})
public class AccumulatorDetails {

    @XmlElementRef(name = "Accumulators", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAccumulator> accumulators;
    @XmlElement(name = "ServiceClass")
    protected Integer serviceClass;

    /**
     * Gets the value of the accumulators property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAccumulator }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAccumulator> getAccumulators() {
        return accumulators;
    }

    /**
     * Sets the value of the accumulators property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAccumulator }{@code >}
     *     
     */
    public void setAccumulators(JAXBElement<ArrayOfAccumulator> value) {
        this.accumulators = value;
    }

    /**
     * Gets the value of the serviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceClass() {
        return serviceClass;
    }

    /**
     * Sets the value of the serviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceClass(Integer value) {
        this.serviceClass = value;
    }

}
