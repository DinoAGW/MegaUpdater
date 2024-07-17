
package com.exlibris.dps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für ieStatusInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ieStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="committedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="committedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="iePid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lockedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ieStatusInfo", propOrder = {
    "committedBy",
    "committedOn",
    "createdBy",
    "createdOn",
    "iePid",
    "lockedBy",
    "version"
})
public class IeStatusInfo {

    protected String committedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar committedOn;
    protected String createdBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdOn;
    protected String iePid;
    protected String lockedBy;
    protected String version;

    /**
     * Ruft den Wert der committedBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommittedBy() {
        return committedBy;
    }

    /**
     * Legt den Wert der committedBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommittedBy(String value) {
        this.committedBy = value;
    }

    /**
     * Ruft den Wert der committedOn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommittedOn() {
        return committedOn;
    }

    /**
     * Legt den Wert der committedOn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommittedOn(XMLGregorianCalendar value) {
        this.committedOn = value;
    }

    /**
     * Ruft den Wert der createdBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Legt den Wert der createdBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Ruft den Wert der createdOn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedOn() {
        return createdOn;
    }

    /**
     * Legt den Wert der createdOn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedOn(XMLGregorianCalendar value) {
        this.createdOn = value;
    }

    /**
     * Ruft den Wert der iePid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIePid() {
        return iePid;
    }

    /**
     * Legt den Wert der iePid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIePid(String value) {
        this.iePid = value;
    }

    /**
     * Ruft den Wert der lockedBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockedBy() {
        return lockedBy;
    }

    /**
     * Legt den Wert der lockedBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockedBy(String value) {
        this.lockedBy = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
