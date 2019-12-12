package com.restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.config.AppConstants;
import com.restaurant.entities.Bill;

/**
 * Repository for Bill
 * 
 * @author bthuan
 *
 */
@Repository( AppConstants.BILL_REPOSITORY )
public interface BillRepository extends JpaRepository<Bill, Integer> {

}
