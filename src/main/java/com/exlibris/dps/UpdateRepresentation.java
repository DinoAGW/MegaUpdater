
package com.exlibris.dps;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für updateRepresentation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="updateRepresentation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="iePid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metadata" type="{http://dps.exlibris.com/}metaData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pdsHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repPid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representationContent" type="{http://dps.exlibris.com/}representationContent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="submissionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRepresentation", propOrder = {
    "commit",
    "iePid",
    "metadata",
    "pdsHandle",
    "repPid",
    "representationContent",
    "submissionReason"
})
public class UpdateRepresentation {

    protected Boolean commit;
    protected String iePid;
    @XmlElement(nillable = true)
    protected List<MetaData> metadata;
    protected String pdsHandle;
    protected String repPid;
    @XmlElement(nillable = true)
    protected List<RepresentationContent> representationContent;
    protected String submissionReason;

    /**
     * Ruft den Wert der commit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommit() {
        return commit;
    }

    /**
     * Legt den Wert der commit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommit(Boolean value) {
        this.commit = value;
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
     * Ruft den Wert der pdsHandle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdsHandle() {
        return pdsHandle;
    }

    /**
     * Legt den Wert der pdsHandle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdsHandle(String value) {
        this.pdsHandle = value;
    }

    /**
     * Ruft den Wert der repPid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepPid() {
        return repPid;
    }

    /**
     * Legt den Wert der repPid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepPid(String value) {
        this.repPid = value;
    }

    /**
     * Gets the value of the representationContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the representationContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepresentationContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepresentationContent }
     * 
     * 
     */
    public List<RepresentationContent> getRepresentationContent() {
        if (representationContent == null) {
            representationContent = new ArrayList<RepresentationContent>();
        }
        return this.representationContent;
    }

    /**
     * Ruft den Wert der submissionReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionReason() {
        return submissionReason;
    }

    /**
     * Legt den Wert der submissionReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionReason(String value) {
        this.submissionReason = value;
    }

}
