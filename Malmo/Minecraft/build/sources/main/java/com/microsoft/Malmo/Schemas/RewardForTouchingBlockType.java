//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.04 at 10:45:56 PM PDT 
//


package com.microsoft.Malmo.Schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Block" type="{http://ProjectMalmo.microsoft.com}BlockSpecWithRewardAndBehaviour"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://ProjectMalmo.microsoft.com}RewardProducerAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "block"
})
@XmlRootElement(name = "RewardForTouchingBlockType")
public class RewardForTouchingBlockType {

    @XmlElement(name = "Block")
    protected List<BlockSpecWithRewardAndBehaviour> block;
    @XmlAttribute(name = "dimension")
    protected Integer dimension;

    /**
     * Gets the value of the block property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the block property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlockSpecWithRewardAndBehaviour }
     * 
     * 
     */
    public List<BlockSpecWithRewardAndBehaviour> getBlock() {
        if (block == null) {
            block = new ArrayList<BlockSpecWithRewardAndBehaviour>();
        }
        return this.block;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDimension() {
        if (dimension == null) {
            return  0;
        } else {
            return dimension;
        }
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDimension(Integer value) {
        this.dimension = value;
    }

}
