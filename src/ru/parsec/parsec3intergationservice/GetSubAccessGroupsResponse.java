
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
 *         &lt;element name="GetSubAccessGroupsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfSubAccessGroup" minOccurs="0"/>
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
    "getSubAccessGroupsResult"
})
@XmlRootElement(name = "GetSubAccessGroupsResponse")
public class GetSubAccessGroupsResponse {

    @XmlElement(name = "GetSubAccessGroupsResult")
    protected ArrayOfSubAccessGroup getSubAccessGroupsResult;

    /**
     * Gets the value of the getSubAccessGroupsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubAccessGroup }
     *     
     */
    public ArrayOfSubAccessGroup getGetSubAccessGroupsResult() {
        return getSubAccessGroupsResult;
    }

    /**
     * Sets the value of the getSubAccessGroupsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubAccessGroup }
     *     
     */
    public void setGetSubAccessGroupsResult(ArrayOfSubAccessGroup value) {
        this.getSubAccessGroupsResult = value;
    }

}
