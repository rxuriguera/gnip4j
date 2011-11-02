package com.zaubersoftware.gnip4j.api.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "coordinates" })
public class Geo implements Serializable {

	private static final long serialVersionUID = 1L;
	@XmlAttribute(required = true)
    private double []coordinates;
    @XmlAttribute(required = true)
    private String type;

    public final double []getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(final double []coordinates) {
        this.coordinates = coordinates;
    }

    public final String getType() {
        return type;
    }

    public final void setType(final String value) {
        type = value;
    }

}
