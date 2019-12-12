package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.config.AppConstants;
import com.restaurant.dto.BillDTO;
import com.restaurant.services.BillService;

/**
 * Controller for Bill
 * 
 * @author bthuan
 *
 */
@RestController
@RequestMapping( AppConstants.BILL_URL )
public class BillController implements DefaultController<BillDTO> {

    @Autowired
    private BillService billService;

    @Override
    public void create( BillDTO object ) {
	// TODO Auto-generated method stub

    }

    /**
     * Retrieve all bills
     */
    @Override
    @RequestMapping( method = RequestMethod.GET )
    public List<BillDTO> getAll() {
	return billService.getAll();
    }

    @Override
    public BillDTO getById( int id ) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void updateById( int id, BillDTO object ) {
	// TODO Auto-generated method stub

    }

    @Override
    public void deleteById( int id ) {
	// TODO Auto-generated method stub

    }

}
