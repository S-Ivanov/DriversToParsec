
package ru.parsec.parsec3intergationservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XmlTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XmlTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Item"/>
 *     &lt;enumeration value="Node"/>
 *     &lt;enumeration value="Document"/>
 *     &lt;enumeration value="Element"/>
 *     &lt;enumeration value="Attribute"/>
 *     &lt;enumeration value="Namespace"/>
 *     &lt;enumeration value="ProcessingInstruction"/>
 *     &lt;enumeration value="Comment"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="AnyAtomicType"/>
 *     &lt;enumeration value="UntypedAtomic"/>
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Boolean"/>
 *     &lt;enumeration value="Decimal"/>
 *     &lt;enumeration value="Float"/>
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="Duration"/>
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="Time"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="GYearMonth"/>
 *     &lt;enumeration value="GYear"/>
 *     &lt;enumeration value="GMonthDay"/>
 *     &lt;enumeration value="GDay"/>
 *     &lt;enumeration value="GMonth"/>
 *     &lt;enumeration value="HexBinary"/>
 *     &lt;enumeration value="Base64Binary"/>
 *     &lt;enumeration value="AnyUri"/>
 *     &lt;enumeration value="QName"/>
 *     &lt;enumeration value="Notation"/>
 *     &lt;enumeration value="NormalizedString"/>
 *     &lt;enumeration value="Token"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="NmToken"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="NCName"/>
 *     &lt;enumeration value="Id"/>
 *     &lt;enumeration value="Idref"/>
 *     &lt;enumeration value="Entity"/>
 *     &lt;enumeration value="Integer"/>
 *     &lt;enumeration value="NonPositiveInteger"/>
 *     &lt;enumeration value="NegativeInteger"/>
 *     &lt;enumeration value="Long"/>
 *     &lt;enumeration value="Int"/>
 *     &lt;enumeration value="Short"/>
 *     &lt;enumeration value="Byte"/>
 *     &lt;enumeration value="NonNegativeInteger"/>
 *     &lt;enumeration value="UnsignedLong"/>
 *     &lt;enumeration value="UnsignedInt"/>
 *     &lt;enumeration value="UnsignedShort"/>
 *     &lt;enumeration value="UnsignedByte"/>
 *     &lt;enumeration value="PositiveInteger"/>
 *     &lt;enumeration value="YearMonthDuration"/>
 *     &lt;enumeration value="DayTimeDuration"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XmlTypeCode")
@XmlEnum
public enum XmlTypeCode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Item")
    ITEM("Item"),
    @XmlEnumValue("Node")
    NODE("Node"),
    @XmlEnumValue("Document")
    DOCUMENT("Document"),
    @XmlEnumValue("Element")
    ELEMENT("Element"),
    @XmlEnumValue("Attribute")
    ATTRIBUTE("Attribute"),
    @XmlEnumValue("Namespace")
    NAMESPACE("Namespace"),
    @XmlEnumValue("ProcessingInstruction")
    PROCESSING_INSTRUCTION("ProcessingInstruction"),
    @XmlEnumValue("Comment")
    COMMENT("Comment"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("AnyAtomicType")
    ANY_ATOMIC_TYPE("AnyAtomicType"),
    @XmlEnumValue("UntypedAtomic")
    UNTYPED_ATOMIC("UntypedAtomic"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("Float")
    FLOAT("Float"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("GYearMonth")
    G_YEAR_MONTH("GYearMonth"),
    @XmlEnumValue("GYear")
    G_YEAR("GYear"),
    @XmlEnumValue("GMonthDay")
    G_MONTH_DAY("GMonthDay"),
    @XmlEnumValue("GDay")
    G_DAY("GDay"),
    @XmlEnumValue("GMonth")
    G_MONTH("GMonth"),
    @XmlEnumValue("HexBinary")
    HEX_BINARY("HexBinary"),
    @XmlEnumValue("Base64Binary")
    BASE_64_BINARY("Base64Binary"),
    @XmlEnumValue("AnyUri")
    ANY_URI("AnyUri"),
    @XmlEnumValue("QName")
    Q_NAME("QName"),
    @XmlEnumValue("Notation")
    NOTATION("Notation"),
    @XmlEnumValue("NormalizedString")
    NORMALIZED_STRING("NormalizedString"),
    @XmlEnumValue("Token")
    TOKEN("Token"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("NmToken")
    NM_TOKEN("NmToken"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("NCName")
    NC_NAME("NCName"),
    @XmlEnumValue("Id")
    ID("Id"),
    @XmlEnumValue("Idref")
    IDREF("Idref"),
    @XmlEnumValue("Entity")
    ENTITY("Entity"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("NonPositiveInteger")
    NON_POSITIVE_INTEGER("NonPositiveInteger"),
    @XmlEnumValue("NegativeInteger")
    NEGATIVE_INTEGER("NegativeInteger"),
    @XmlEnumValue("Long")
    LONG("Long"),
    @XmlEnumValue("Int")
    INT("Int"),
    @XmlEnumValue("Short")
    SHORT("Short"),
    @XmlEnumValue("Byte")
    BYTE("Byte"),
    @XmlEnumValue("NonNegativeInteger")
    NON_NEGATIVE_INTEGER("NonNegativeInteger"),
    @XmlEnumValue("UnsignedLong")
    UNSIGNED_LONG("UnsignedLong"),
    @XmlEnumValue("UnsignedInt")
    UNSIGNED_INT("UnsignedInt"),
    @XmlEnumValue("UnsignedShort")
    UNSIGNED_SHORT("UnsignedShort"),
    @XmlEnumValue("UnsignedByte")
    UNSIGNED_BYTE("UnsignedByte"),
    @XmlEnumValue("PositiveInteger")
    POSITIVE_INTEGER("PositiveInteger"),
    @XmlEnumValue("YearMonthDuration")
    YEAR_MONTH_DURATION("YearMonthDuration"),
    @XmlEnumValue("DayTimeDuration")
    DAY_TIME_DURATION("DayTimeDuration");
    private final String value;

    XmlTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XmlTypeCode fromValue(String v) {
        for (XmlTypeCode c: XmlTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
