
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Identifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseIdentifier">
 *       &lt;sequence>
 *         &lt;element name="ACCGROUP_ID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="PRIVILEGE_MASK" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifier", propOrder = {
    "accgroupid",
    "privilegemask"
})
@XmlSeeAlso({
    IdentifierTemp.class
})
public class Identifier
    extends BaseIdentifier
{

    @XmlElement(name = "ACCGROUP_ID", required = true)
    protected String accgroupid;
    @XmlElement(name = "PRIVILEGE_MASK")
    protected long privilegemask;

    /**
     * Gets the value of the accgroupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCGROUPID() {
        return accgroupid;
    }

    /**
     * Sets the value of the accgroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCGROUPID(String value) {
        this.accgroupid = value;
    }

    /**
     * Gets the value of the privilegemask property.
     * 
     */
    public long getPRIVILEGEMASK() {
        return privilegemask;
    }

    /**
     * Sets the value of the privilegemask property.
     * 
     */
    public void setPRIVILEGEMASK(long value) {
        this.privilegemask = value;
    }

}
