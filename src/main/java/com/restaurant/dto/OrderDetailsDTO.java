package com.restaurant.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * The DTO for Order Details
 * 
 * @author bthuan
 *
 */
@Getter
@Setter
public class OrderDetailsDTO {

    private int id;
    private int quantity;
    private Date orderedTime;
    private MenuItemDTO menuItem;

}
