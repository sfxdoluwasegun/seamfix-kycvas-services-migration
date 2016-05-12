
package com.sf.kyc.vas.soap.webservice.artifact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdateSubscriberSegmentation2Result" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateSubscriberSegmentation2Result"
})
@XmlRootElement(name = "UpdateSubscriberSegmentation2Response")
public class UpdateSubscriberSegmentation2Response {

    @XmlElement(name = "UpdateSubscriberSegmentation2Result")
    protected Boolean updateSubscriberSegmentation2Result;

    /**
     * Gets the value of the updateSubscriberSegmentation2Result property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateSubscriberSegmentation2Result() {
        return updateSubscriberSegmentation2Result;
    }

    /**
     * Sets the value of the updateSubscriberSegmentation2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateSubscriberSegmentation2Result(Boolean value) {
        this.updateSubscriberSegmentation2Result = value;
    }

}
