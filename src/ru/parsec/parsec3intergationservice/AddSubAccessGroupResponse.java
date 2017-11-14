
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
 *         &lt;element name="AddSubAccessGroupResult" type="{http://parsec.ru/Parsec3IntergationService}GuidResult" minOccurs="0"/>
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
    "addSubAccessGroupResult"
})
@XmlRootElement(name = "AddSubAccessGroupResponse")
public class AddSubAccessGroupResponse {

    @XmlElement(name = "AddSubAccessGroupResult")
    protected GuidResult addSubAccessGroupResult;

    /**
     * Gets the value of the addSubAccessGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link GuidResult }
     *     
     */
    public GuidResult getAddSubAccessGroupResult() {
        return addSubAccessGroupResult;
    }

    /**
     * Sets the value of the addSubAccessGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuidResult }
     *     
     */
    public void setAddSubAccessGroupResult(GuidResult value) {
        this.addSubAccessGroupResult = value;
    }

}
