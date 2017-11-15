
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
 *         &lt;element name="GetTerritoriesHierarhyResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfTerritory" minOccurs="0"/>
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
    "getTerritoriesHierarhyResult"
})
@XmlRootElement(name = "GetTerritoriesHierarhyResponse")
public class GetTerritoriesHierarhyResponse {

    @XmlElement(name = "GetTerritoriesHierarhyResult")
    protected ArrayOfTerritory getTerritoriesHierarhyResult;

    /**
     * Gets the value of the getTerritoriesHierarhyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTerritory }
     *     
     */
    public ArrayOfTerritory getGetTerritoriesHierarhyResult() {
        return getTerritoriesHierarhyResult;
    }

    /**
     * Sets the value of the getTerritoriesHierarhyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTerritory }
     *     
     */
    public void setGetTerritoriesHierarhyResult(ArrayOfTerritory value) {
        this.getTerritoriesHierarhyResult = value;
    }

}
