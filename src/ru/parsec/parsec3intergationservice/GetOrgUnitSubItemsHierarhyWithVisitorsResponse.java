
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
 *         &lt;element name="GetOrgUnitSubItemsHierarhyWithVisitorsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfBaseObject" minOccurs="0"/>
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
    "getOrgUnitSubItemsHierarhyWithVisitorsResult"
})
@XmlRootElement(name = "GetOrgUnitSubItemsHierarhyWithVisitorsResponse")
public class GetOrgUnitSubItemsHierarhyWithVisitorsResponse {

    @XmlElement(name = "GetOrgUnitSubItemsHierarhyWithVisitorsResult")
    protected ArrayOfBaseObject getOrgUnitSubItemsHierarhyWithVisitorsResult;

    /**
     * Gets the value of the getOrgUnitSubItemsHierarhyWithVisitorsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public ArrayOfBaseObject getGetOrgUnitSubItemsHierarhyWithVisitorsResult() {
        return getOrgUnitSubItemsHierarhyWithVisitorsResult;
    }

    /**
     * Sets the value of the getOrgUnitSubItemsHierarhyWithVisitorsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public void setGetOrgUnitSubItemsHierarhyWithVisitorsResult(ArrayOfBaseObject value) {
        this.getOrgUnitSubItemsHierarhyWithVisitorsResult = value;
    }

}
