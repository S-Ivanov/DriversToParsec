
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
 *         &lt;element name="FindPersonByIdentifierResult" type="{http://parsec.ru/Parsec3IntergationService}Person" minOccurs="0"/>
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
    "findPersonByIdentifierResult"
})
@XmlRootElement(name = "FindPersonByIdentifierResponse")
public class FindPersonByIdentifierResponse {

    @XmlElement(name = "FindPersonByIdentifierResult")
    protected Person findPersonByIdentifierResult;

    /**
     * Gets the value of the findPersonByIdentifierResult property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getFindPersonByIdentifierResult() {
        return findPersonByIdentifierResult;
    }

    /**
     * Sets the value of the findPersonByIdentifierResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setFindPersonByIdentifierResult(Person value) {
        this.findPersonByIdentifierResult = value;
    }

}
