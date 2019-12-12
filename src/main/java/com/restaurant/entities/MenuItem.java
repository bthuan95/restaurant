package com.restaurant.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import com.restaurant.config.AppConstants;

/**
 * The entity for MenuItem table
 * 
 * @author bthuan
 *
 */
@Entity
@Table( name = AppConstants.MENU_ITEM )
@Getter
@Setter
public class MenuItem {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = AppConstants.ID )
    private int id;

    @Column( name = AppConstants.NAME, nullable = false )
    private String name;

    @Column( name = AppConstants.DESCRIPTION )
    private String description;

    @Column( name = AppConstants.IMAGE_URL, nullable = false )
    private String imageURL;

    @Column( name = AppConstants.PRICE, nullable = false )
    private BigDecimal price;

    @Column( name = AppConstants.DETAILS )
    private String details;

}
