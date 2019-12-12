package com.restaurant.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

/**
 * The DTO for MenuItem
 * 
 * @author bthuan
 *
 */
@Getter
@Setter
public class MenuItemDTO {

    private int id;
    private String name;
    private String description;
    private String imageURL;
    private BigDecimal price;
    private String details;

}
