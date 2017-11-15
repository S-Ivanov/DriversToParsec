
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
 *         &lt;element name="GetVisitorRequestsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfVisitorRequest" minOccurs="0"/>
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
    "getVisitorRequestsResult"
})
@XmlRootElement(name = "GetVisitorRequestsResponse")
public class GetVisitorRequestsResponse {

    @XmlElement(name = "GetVisitorRequestsResult")
    protected ArrayOfVisitorRequest getVisitorRequestsResult;

    /**
     * Gets the value of the getVisitorRequestsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVisitorRequest }
     *     
     */
    public ArrayOfVisitorRequest getGetVisitorRequestsResult() {
        return getVisitorRequestsResult;
    }

    /**
     * Sets the value of the getVisitorRequestsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVisitorRequest }
     *     
     */
    public void setGetVisitorRequestsResult(ArrayOfVisitorRequest value) {
        this.getVisitorRequestsResult = value;
    }

}
