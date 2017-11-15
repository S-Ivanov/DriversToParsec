
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
 *         &lt;element name="GetTerritoryResult" type="{http://parsec.ru/Parsec3IntergationService}Territory" minOccurs="0"/>
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
    "getTerritoryResult"
})
@XmlRootElement(name = "GetTerritoryResponse")
public class GetTerritoryResponse {

    @XmlElement(name = "GetTerritoryResult")
    protected Territory getTerritoryResult;

    /**
     * Gets the value of the getTerritoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link Territory }
     *     
     */
    public Territory getGetTerritoryResult() {
        return getTerritoryResult;
    }

    /**
     * Sets the value of the getTerritoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Territory }
     *     
     */
    public void setGetTerritoryResult(Territory value) {
        this.getTerritoryResult = value;
    }

}
