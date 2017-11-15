
package ru.parsec.parsec3intergationservice;

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
 *         &lt;element name="GetVisitorExtraFieldTemplatesResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfPersonExtraFieldTemplate" minOccurs="0"/>
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
    "getVisitorExtraFieldTemplatesResult"
})
@XmlRootElement(name = "GetVisitorExtraFieldTemplatesResponse")
public class GetVisitorExtraFieldTemplatesResponse {

    @XmlElement(name = "GetVisitorExtraFieldTemplatesResult")
    protected ArrayOfPersonExtraFieldTemplate getVisitorExtraFieldTemplatesResult;

    /**
     * Gets the value of the getVisitorExtraFieldTemplatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonExtraFieldTemplate }
     *     
     */
    public ArrayOfPersonExtraFieldTemplate getGetVisitorExtraFieldTemplatesResult() {
        return getVisitorExtraFieldTemplatesResult;
    }

    /**
     * Sets the value of the getVisitorExtraFieldTemplatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonExtraFieldTemplate }
     *     
     */
    public void setGetVisitorExtraFieldTemplatesResult(ArrayOfPersonExtraFieldTemplate value) {
        this.getVisitorExtraFieldTemplatesResult = value;
    }

}
