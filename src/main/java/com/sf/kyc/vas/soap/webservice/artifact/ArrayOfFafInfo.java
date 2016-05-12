
package com.sf.kyc.vas.soap.webservice.artifact;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFafInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFafInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FafInfo" type="{http://schemas.datacontract.org/2004/07/Provisioning.Models}FafInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFafInfo", namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", propOrder = {
    "fafInfo"
})
public class ArrayOfFafInfo {

    @XmlElement(name = "FafInfo", nillable = true)
    protected List<FafInfo> fafInfo;

    /**
     * Gets the value of the fafInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fafInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFafInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FafInfo }
     * 
     * 
     */
    public List<FafInfo> getFafInfo() {
        if (fafInfo == null) {
            fafInfo = new ArrayList<FafInfo>();
        }
        return this.fafInfo;
    }

}
