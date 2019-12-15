package com.restaurant.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dto.BillDTO;
import com.restaurant.dto.OrderDetailsDTO;
import com.restaurant.entities.Bill;
import com.restaurant.entities.OrderDetails;
import com.restaurant.mapper.DefaultMapper;
import com.restaurant.repositories.BillRepository;
import com.restaurant.repositories.OrderDetailsRepository;
import com.restaurant.services.BillService;

/**
 * The service implementation for Bill
 * 
 * @author bthuan
 *
 */
@Service
public class BillServiceImpl extends DefaultMapper implements BillService {

    @Autowired
    private BillRepository billRepository;
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    /**
     * Create new Bill
     */
    @Override
    @Transactional
    public void create( BillDTO billDTO ) {
	// set bill and ordered time for OrderDetailsDTO
	for ( OrderDetailsDTO orderDetailsDTO : billDTO.getOrderDetails() ) {
	    orderDetailsDTO.setBill( convertObject( billDTO, BillDTO.class ) );
	    orderDetailsDTO.setOrderedTime( new Date() );
	}
	billRepository.save( convertObject( billDTO, Bill.class ) );
    }

    /**
     * Retrieve all Bills
     */
    @Override
    public List<BillDTO> getAll() {
	return convertList( billRepository.findAll(), BillDTO[].class );
    }

    /**
     * Retrieve Bill by ID
     */
    @Override
    public BillDTO getById( int id ) {
	return convertObject( billRepository.findById( id ).get(), BillDTO.class );
    }

    /**
     * Update Bill by ID
     */
    @Override
    @Transactional
    public void updateById( int id, BillDTO billDTO ) {
	// only update if the id existed
	if ( billRepository.findById( id ).isPresent() ) {
	    billDTO.setId( id );

	    // create a new one or update on existing orderDetails
	    for ( OrderDetailsDTO orderDetailsDTO : billDTO.getOrderDetails() ) {
		orderDetailsDTO.setBill( convertObject( billDTO, BillDTO.class ) );
		orderDetailsDTO.setOrderedTime( new Date() );
		orderDetailsRepository.save( convertObject( orderDetailsDTO, OrderDetails.class ) );
	    }

	}
    }

    /**
     * Delete Bill by ID
     */
    @Override
    @Transactional
    public void deleteById( int id ) {
	billRepository.deleteById( id );
    }

    /**
     * Delete order for existing bill
     * 
     * @param billID
     * @param orderDetailsID
     */
    @Override
    @Transactional
    public void deleteOrderDetails( int billID, int orderDetailsID ) {
	if ( billRepository.findById( billID ).isPresent() ) {
	    orderDetailsRepository.deleteById( orderDetailsID );
	}
    }

}
