//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.21 at 07:00:05 PM CLT 
//


package cl.moit.ws.bcentral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fameNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fameNode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://web.service.sdmx.sdms.sungard.com/}abstractBaseObject">
 *       &lt;sequence>
 *         &lt;element name="nodeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupDimension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="root" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fameNode", namespace = "http://web.service.sdmx.sdms.sungard.com/", propOrder = {
    "nodeLevel",
    "groupDimension",
    "header",
    "root"
})
@XmlSeeAlso({
    FameSeries.class
})
public class FameNode
    extends AbstractBaseObject
{

    protected String nodeLevel;
    protected String groupDimension;
    protected String header;
    protected String root;

    /**
     * Gets the value of the nodeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeLevel() {
        return nodeLevel;
    }

    /**
     * Sets the value of the nodeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeLevel(String value) {
        this.nodeLevel = value;
    }

    /**
     * Gets the value of the groupDimension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupDimension() {
        return groupDimension;
    }

    /**
     * Sets the value of the groupDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupDimension(String value) {
        this.groupDimension = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the root property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoot() {
        return root;
    }

    /**
     * Sets the value of the root property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoot(String value) {
        this.root = value;
    }

}
