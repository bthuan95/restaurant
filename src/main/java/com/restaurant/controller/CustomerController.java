package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.dto.CustomerDTO;
import com.restaurant.services.CustomerService;

@RestController
public class CustomerController {

    @Autowired
    CustomerService personService;

    @RequestMapping( value = "/person", method = RequestMethod.GET )
    public Page<CustomerDTO> getAll( @RequestParam( "page" ) int pageIndex, @RequestParam( "size" ) int pageSize ) {
	return personService.getCustomers( PageRequest.of( pageIndex, pageSize ) );
    }
}