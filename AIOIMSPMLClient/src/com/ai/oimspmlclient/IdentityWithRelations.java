
package com.ai.oimspmlclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that represents an identity entity and its relationships
 *                 to other identities and roles.  This representation is used
 *                 internally by IDx, but is not exposed in SPMLv2.
 * 
 * <p>Java class for identityWithRelations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identityWithRelations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identity" type="{http://xmlns.oracle.com/idm/identity/PSO}identity"/>
 *         &lt;element name="managerGUID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="roleGUID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identityWithRelations", namespace = "http://xmlns.oracle.com/idm/identity/PSO", propOrder = {
    "identity",
    "managerGUID",
    "roleGUID"
})
public class IdentityWithRelations {

    @XmlElement(required = true)
    protected Identity identity;
    protected List<String> managerGUID;
    protected List<String> roleGUID;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link Identity }
     *     
     */
    public Identity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identity }
     *     
     */
    public void setIdentity(Identity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the managerGUID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managerGUID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagerGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getManagerGUID() {
        if (managerGUID == null) {
            managerGUID = new ArrayList<String>();
        }
        return this.managerGUID;
    }

    /**
     * Gets the value of the roleGUID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleGUID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoleGUID() {
        if (roleGUID == null) {
            roleGUID = new ArrayList<String>();
        }
        return this.roleGUID;
    }

}
