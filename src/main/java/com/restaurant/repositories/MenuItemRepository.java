package com.restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.config.AppConstants;
import com.restaurant.entities.MenuItem;

/**
 * Reprository for MenuItem
 * 
 * @author bthuan
 *
 */
@Repository( AppConstants.MENUITEM_REPOSITORY )
public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {

}
