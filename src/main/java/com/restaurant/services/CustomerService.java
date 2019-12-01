package com.restaurant.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.restaurant.dto.CustomerDTO;
import com.restaurant.entities.Customer;

public interface CustomerService {

    public Page<CustomerDTO> getCustomers( Pageable pageable );

    public void saveCustomer( Customer theCustomer );

    public Customer getCustomer( int theId ) throws ResourceNotFoundException;

    public void deleteCustomer( int theId ) throws ResourceNotFoundException;
}
