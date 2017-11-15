
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
 *         &lt;element name="FindVisitorsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfPerson" minOccurs="0"/>
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
    "findVisitorsResult"
})
@XmlRootElement(name = "FindVisitorsResponse")
public class FindVisitorsResponse {

    @XmlElement(name = "FindVisitorsResult")
    protected ArrayOfPerson findVisitorsResult;

    /**
     * Gets the value of the findVisitorsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPerson }
     *     
     */
    public ArrayOfPerson getFindVisitorsResult() {
        return findVisitorsResult;
    }

    /**
     * Sets the value of the findVisitorsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPerson }
     *     
     */
    public void setFindVisitorsResult(ArrayOfPerson value) {
        this.findVisitorsResult = value;
    }

}
