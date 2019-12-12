package com.restaurant.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dto.OrderDetailsDTO;
import com.restaurant.mapper.DefaultMapper;
import com.restaurant.repositories.OrderDetailsRepository;
import com.restaurant.services.OrderDetailsService;

/**
 * The service implementation for Order Details
 * 
 * @author bthuan
 *
 */
@Service
public class OrderDetailsServiceImpl extends DefaultMapper implements OrderDetailsService {

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    /**
     * Create new Order Details
     */
    @Override
    public void create( OrderDetailsDTO object ) {
	// TODO Auto-generated method stub

    }

    /**
     * Retrieve all Order Details
     */
    @Override
    public List<OrderDetailsDTO> getAll() {
	return convertList( orderDetailsRepository.findAll(), OrderDetailsDTO[].class );
    }

    /**
     * Retrieve Order Details by ID
     */
    @Override
    public OrderDetailsDTO getById( int id ) {
	// TODO Auto-generated method stub
	return null;
    }

    /**
     * Update Order Details by ID
     */
    @Override
    public void updateById( int id, OrderDetailsDTO object ) {
	// TODO Auto-generated method stub

    }

    /**
     * Delete Order Details by ID
     */
    @Override
    public void deleteById( int id ) {
	// TODO Auto-generated method stub

    }

}
