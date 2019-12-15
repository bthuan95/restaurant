package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    /**
     * Create new Bill
     */
    @Override
    @RequestMapping( method = RequestMethod.POST )
    public void create( @RequestBody BillDTO billDTO ) {
	billService.create( billDTO );
    }

    /**
     * Retrieve all bills
     */
    @Override
    @RequestMapping( method = RequestMethod.GET )
    public List<BillDTO> getAll() {
	return billService.getAll();
    }

    /**
     * Retrieve Bill by ID
     */
    @Override
    @RequestMapping( value = AppConstants.ID_URL, method = RequestMethod.GET )
    public BillDTO getById( @PathVariable( AppConstants.ID ) int id ) {
	return billService.getById( id );
    }

    /**
     * Update Bill by ID
     */
    @Override
    @RequestMapping( value = AppConstants.ID_URL, method = RequestMethod.PUT )
    public void updateById( @PathVariable( AppConstants.ID ) int id, @RequestBody BillDTO billDTO ) {
	billService.updateById( id, billDTO );
    }

    /**
     * Delete Bill by ID
     */
    @Override
    @RequestMapping( value = AppConstants.ID_URL, method = RequestMethod.DELETE )
    public void deleteById( @PathVariable( AppConstants.ID ) int id ) {
	billService.deleteById( id );
    }

    /**
     * Delete orderDetails on existing bill
     */
    @RequestMapping( value = AppConstants.DELETE_ORDER_URL, method = RequestMethod.DELETE )
    public void deleteOrderDetails( @PathVariable( AppConstants.BILL_ID ) int billID, @PathVariable( AppConstants.ORDERDETAILS_ID ) int orderDetailsID ) {
	billService.deleteOrderDetails( billID, orderDetailsID );
    }

}
