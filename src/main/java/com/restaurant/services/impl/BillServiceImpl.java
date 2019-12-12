package com.restaurant.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dto.BillDTO;
import com.restaurant.mapper.DefaultMapper;
import com.restaurant.repositories.BillRepository;
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

    /**
     * Create new Bill
     */
    @Override
    public void create( BillDTO object ) {
	// TODO Auto-generated method stub

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
	// TODO Auto-generated method stub
	return null;
    }

    /**
     * Update Bill by ID
     */
    @Override
    public void updateById( int id, BillDTO object ) {
	// TODO Auto-generated method stub

    }

    /**
     * Delete Bill by ID
     */
    @Override
    public void deleteById( int id ) {
	// TODO Auto-generated method stub

    }

}
