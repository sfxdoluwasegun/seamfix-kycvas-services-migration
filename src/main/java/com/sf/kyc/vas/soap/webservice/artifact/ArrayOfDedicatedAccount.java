
package com.sf.kyc.vas.soap.webservice.artifact;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDedicatedAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDedicatedAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DedicatedAccount" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models}DedicatedAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDedicatedAccount", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", propOrder = {
    "dedicatedAccount"
})
public class ArrayOfDedicatedAccount {

    @XmlElement(name = "DedicatedAccount", nillable = true)
    protected List<DedicatedAccount> dedicatedAccount;

    /**
     * Gets the value of the dedicatedAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dedicatedAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDedicatedAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DedicatedAccount }
     * 
     * 
     */
    public List<DedicatedAccount> getDedicatedAccount() {
        if (dedicatedAccount == null) {
            dedicatedAccount = new ArrayList<DedicatedAccount>();
        }
        return this.dedicatedAccount;
    }

}
