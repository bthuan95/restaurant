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
import lombok.ToString;

@Entity
@Table( name = "menuitem" )
@Getter
@Setter
@ToString
public class MenuItem {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private int id;

    @Column( name = "name", nullable = false )
    private String name;

    @Column( name = "description" )
    private String description;

    @Column( name = "imageURL", nullable = false )
    private String imageURL;

    @Column( name = "price", nullable = false )
    private BigDecimal price;

    @Column( name = "details" )
    private String details;

}
