package com.restaurant.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "menuitem" )
public class MenuItem {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private int id;

    @Column( name = "name" )
    private String name;

    @Column( name = "description" )
    private String description;

    @Column( name = "imageURL" )
    private String imageURL;

    @Column( name = "price" )
    private BigDecimal price;

    @Column( name = "details" )
    private String details;

    public int getId() {
	return id;
    }

    public void setId( int id ) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName( String name ) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription( String description ) {
	this.description = description;
    }

    public String getImageURL() {
	return imageURL;
    }

    public void setImageURL( String imageURL ) {
	this.imageURL = imageURL;
    }

    public BigDecimal getPrice() {
	return price;
    }

    public void setPrice( BigDecimal price ) {
	this.price = price;
    }

    public String getDetails() {
	return details;
    }

    public void setDetails( String details ) {
	this.details = details;
    }

    @Override
    public String toString() {
	return "MenuItem [id=" + id + ", name=" + name + ", description=" + description + ", imageURL=" + imageURL + ", price=" + price + ", details=" + details + "]";
    }

}
