package com.restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.entities.Customer;

@Repository( "customerRepository" )
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}