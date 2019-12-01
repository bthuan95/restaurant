package com.restaurant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dto.CustomerDTO;
import com.restaurant.entities.Customer;
import com.restaurant.mapper.CustomerMapper;
import com.restaurant.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    private CustomerMapper customerMapper = new CustomerMapper();

    @Override
    @Transactional
    public Page<CustomerDTO> getCustomers( Pageable pageable ) {
	return customerRepository.findAll( pageable ).map( customerMapper::toDTO );
    }

    @Override
    @Transactional
    public void saveCustomer( Customer theCustomer ) {
	customerRepository.save( theCustomer );
    }

    @Override
    @Transactional
    public Customer getCustomer( int id ) throws ResourceNotFoundException {
	return customerRepository.findById( id ).orElseThrow( () -> new ResourceNotFoundException( id ) );
    }

    @Override
    @Transactional
    public void deleteCustomer( int theId ) {
	customerRepository.deleteById( theId );
    }
}