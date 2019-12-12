package com.restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.config.AppConstants;
import com.restaurant.entities.OrderDetails;

/**
 * Repository for Order Details
 * 
 * @author bthuan
 *
 */
@Repository( AppConstants.ORDERDETAILS_REPOSITORY )
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

}
