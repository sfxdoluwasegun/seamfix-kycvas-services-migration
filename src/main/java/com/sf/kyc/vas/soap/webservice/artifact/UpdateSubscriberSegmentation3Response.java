
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
 *         &lt;element name="UpdateSubscriberSegmentation3Result" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "updateSubscriberSegmentation3Result"
})
@XmlRootElement(name = "UpdateSubscriberSegmentation3Response")
public class UpdateSubscriberSegmentation3Response {

    @XmlElement(name = "UpdateSubscriberSegmentation3Result")
    protected Boolean updateSubscriberSegmentation3Result;

    /**
     * Gets the value of the updateSubscriberSegmentation3Result property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateSubscriberSegmentation3Result() {
        return updateSubscriberSegmentation3Result;
    }

    /**
     * Sets the value of the updateSubscriberSegmentation3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateSubscriberSegmentation3Result(Boolean value) {
        this.updateSubscriberSegmentation3Result = value;
    }

}
