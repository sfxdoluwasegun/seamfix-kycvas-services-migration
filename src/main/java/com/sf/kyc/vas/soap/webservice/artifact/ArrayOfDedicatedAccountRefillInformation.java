
package com.sf.kyc.vas.soap.webservice.artifact;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDedicatedAccountRefillInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDedicatedAccountRefillInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DedicatedAccountRefillInformation" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip}DedicatedAccountRefillInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDedicatedAccountRefillInformation", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", propOrder = {
    "dedicatedAccountRefillInformation"
})
public class ArrayOfDedicatedAccountRefillInformation {

    @XmlElement(name = "DedicatedAccountRefillInformation", nillable = true)
    protected List<DedicatedAccountRefillInformation> dedicatedAccountRefillInformation;

    /**
     * Gets the value of the dedicatedAccountRefillInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dedicatedAccountRefillInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDedicatedAccountRefillInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DedicatedAccountRefillInformation }
     * 
     * 
     */
    public List<DedicatedAccountRefillInformation> getDedicatedAccountRefillInformation() {
        if (dedicatedAccountRefillInformation == null) {
            dedicatedAccountRefillInformation = new ArrayList<DedicatedAccountRefillInformation>();
        }
        return this.dedicatedAccountRefillInformation;
    }

}
