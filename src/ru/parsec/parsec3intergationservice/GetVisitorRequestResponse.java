
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
 *         &lt;element name="GetVisitorRequestResult" type="{http://parsec.ru/Parsec3IntergationService}VisitorRequest" minOccurs="0"/>
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
    "getVisitorRequestResult"
})
@XmlRootElement(name = "GetVisitorRequestResponse")
public class GetVisitorRequestResponse {

    @XmlElement(name = "GetVisitorRequestResult")
    protected VisitorRequest getVisitorRequestResult;

    /**
     * Gets the value of the getVisitorRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link VisitorRequest }
     *     
     */
    public VisitorRequest getGetVisitorRequestResult() {
        return getVisitorRequestResult;
    }

    /**
     * Sets the value of the getVisitorRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisitorRequest }
     *     
     */
    public void setGetVisitorRequestResult(VisitorRequest value) {
        this.getVisitorRequestResult = value;
    }

}
