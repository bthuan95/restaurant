package com.restaurant.dto;

import java.math.BigDecimal;

public class MenuItemDTO {

    private String name;
    private String description;
    private String imageURL;
    private BigDecimal price;
    private String details;

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

}
