package com.restaurant.dto;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

/**
 * The DTO for Bill
 * 
 * @author bthuan
 *
 */
@Getter
@Setter
public class BillDTO {

    private int id;
    private Set<OrderDetailsDTO> orderDetails = new HashSet<>();

}
