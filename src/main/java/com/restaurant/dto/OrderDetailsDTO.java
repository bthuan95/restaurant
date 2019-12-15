package com.restaurant.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    // Json parser ignored to avoid Infinite recursion
    @JsonIgnore
    private BillDTO bill;

}
