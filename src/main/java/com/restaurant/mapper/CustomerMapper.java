package com.restaurant.mapper;

import org.modelmapper.ModelMapper;

import com.restaurant.dto.CustomerDTO;
import com.restaurant.entities.Customer;

public class CustomerMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public CustomerDTO toDTO( Customer customer ) {
	return modelMapper.map( customer, CustomerDTO.class );
    }

    public Customer toEntity( CustomerDTO customerDTO ) {
	return modelMapper.map( customerDTO, Customer.class );
    }
}
