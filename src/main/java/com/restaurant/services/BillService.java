package com.restaurant.services;

import com.restaurant.dto.BillDTO;

/**
 * Service for Bill
 * 
 * @author bthuan
 *
 */
public interface BillService extends DefaultService<BillDTO> {

    public void deleteOrderDetails( int billID, int orderDetailsID );

}
