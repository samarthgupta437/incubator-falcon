//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.08 at 05:19:45 PM GMT+05:30 
//


package org.apache.airavat.oozie.coordinator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SYNCDATASET complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SYNCDATASET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uri-template" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="done-flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{uri:oozie:coordinator:0.3}IDENTIFIER" />
 *       &lt;attribute name="frequency" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initial-instance" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timezone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SYNCDATASET", propOrder = {
    "uriTemplate",
    "doneFlag"
})
public class SYNCDATASET {

    @XmlElement(name = "uri-template", required = true)
    protected String uriTemplate;
    @XmlElement(name = "done-flag")
    protected String doneFlag;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(required = true)
    protected String frequency;
    @XmlAttribute(name = "initial-instance", required = true)
    protected String initialInstance;
    @XmlAttribute(required = true)
    protected String timezone;

    /**
     * Gets the value of the uriTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUriTemplate() {
        return uriTemplate;
    }

    /**
     * Sets the value of the uriTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUriTemplate(String value) {
        this.uriTemplate = value;
    }

    /**
     * Gets the value of the doneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoneFlag() {
        return doneFlag;
    }

    /**
     * Sets the value of the doneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoneFlag(String value) {
        this.doneFlag = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the initialInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialInstance() {
        return initialInstance;
    }

    /**
     * Sets the value of the initialInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialInstance(String value) {
        this.initialInstance = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

}
