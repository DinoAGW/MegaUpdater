
package com.exlibris.dps;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für representationContent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="representationContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileOriginalPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fixity" type="{http://dps.exlibris.com/}fixity" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metadata" type="{http://dps.exlibris.com/}metaData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="newFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldFilePid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operation" type="{http://dps.exlibris.com/}operation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "representationContent", propOrder = {
    "fileOriginalPath",
    "fixity",
    "label",
    "metadata",
    "newFile",
    "oldFilePid",
    "operation"
})
public class RepresentationContent {

    protected String fileOriginalPath;
    protected Fixity fixity;
    protected String label;
    @XmlElement(nillable = true)
    protected List<MetaData> metadata;
    protected String newFile;
    protected String oldFilePid;
    @XmlSchemaType(name = "string")
    protected Operation operation;

    /**
     * Ruft den Wert der fileOriginalPath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileOriginalPath() {
        return fileOriginalPath;
    }

    /**
     * Legt den Wert der fileOriginalPath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileOriginalPath(String value) {
        this.fileOriginalPath = value;
    }

    /**
     * Ruft den Wert der fixity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Fixity }
     *     
     */
    public Fixity getFixity() {
        return fixity;
    }

    /**
     * Legt den Wert der fixity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Fixity }
     *     
     */
    public void setFixity(Fixity value) {
        this.fixity = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaData }
     * 
     * 
     */
    public List<MetaData> getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<MetaData>();
        }
        return this.metadata;
    }

    /**
     * Ruft den Wert der newFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFile() {
        return newFile;
    }

    /**
     * Legt den Wert der newFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFile(String value) {
        this.newFile = value;
    }

    /**
     * Ruft den Wert der oldFilePid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldFilePid() {
        return oldFilePid;
    }

    /**
     * Legt den Wert der oldFilePid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldFilePid(String value) {
        this.oldFilePid = value;
    }

    /**
     * Ruft den Wert der operation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Operation }
     *     
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * Legt den Wert der operation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation }
     *     
     */
    public void setOperation(Operation value) {
        this.operation = value;
    }

}
