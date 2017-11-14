
package ru.parsec.parsec3intergationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVisitorRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVisitorRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisitorRequest" type="{http://parsec.ru/Parsec3IntergationService}VisitorRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVisitorRequest", propOrder = {
    "visitorRequest"
})
public class ArrayOfVisitorRequest {

    @XmlElement(name = "VisitorRequest", nillable = true)
    protected List<VisitorRequest> visitorRequest;

    /**
     * Gets the value of the visitorRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visitorRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisitorRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisitorRequest }
     * 
     * 
     */
    public List<VisitorRequest> getVisitorRequest() {
        if (visitorRequest == null) {
            visitorRequest = new ArrayList<VisitorRequest>();
        }
        return this.visitorRequest;
    }

}
