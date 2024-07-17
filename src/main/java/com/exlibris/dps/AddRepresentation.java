
package com.exlibris.dps;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für addRepresentation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="addRepresentation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arPolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="iePid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metadata" type="{http://dps.exlibris.com/}metaData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pdsHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preservationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representationContent" type="{http://dps.exlibris.com/}representationContent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="representationEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "addRepresentation", propOrder = {
    "arPolicyID",
    "commit",
    "iePid",
    "label",
    "metadata",
    "pdsHandle",
    "preservationType",
    "representationCode",
    "representationContent",
    "representationEntityType",
    "submissionReason"
})
public class AddRepresentation {

    protected String arPolicyID;
    protected Boolean commit;
    protected String iePid;
    protected String label;
    @XmlElement(nillable = true)
    protected List<MetaData> metadata;
    protected String pdsHandle;
    protected String preservationType;
    protected String representationCode;
    @XmlElement(nillable = true)
    protected List<RepresentationContent> representationContent;
    protected String representationEntityType;
    protected String submissionReason;

    /**
     * Ruft den Wert der arPolicyID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArPolicyID() {
        return arPolicyID;
    }

    /**
     * Legt den Wert der arPolicyID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArPolicyID(String value) {
        this.arPolicyID = value;
    }

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
     * Ruft den Wert der preservationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreservationType() {
        return preservationType;
    }

    /**
     * Legt den Wert der preservationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreservationType(String value) {
        this.preservationType = value;
    }

    /**
     * Ruft den Wert der representationCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentationCode() {
        return representationCode;
    }

    /**
     * Legt den Wert der representationCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentationCode(String value) {
        this.representationCode = value;
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
     * Ruft den Wert der representationEntityType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentationEntityType() {
        return representationEntityType;
    }

    /**
     * Legt den Wert der representationEntityType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentationEntityType(String value) {
        this.representationEntityType = value;
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
