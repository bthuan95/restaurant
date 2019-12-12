package com.restaurant.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dto.MenuItemDTO;
import com.restaurant.entities.MenuItem;
import com.restaurant.mapper.DefaultMapper;
import com.restaurant.repositories.MenuItemRepository;
import com.restaurant.services.MenuItemService;

/**
 * The service implementation for MenuItem
 * 
 * @author bthuan
 *
 */
@Service
public class MenuItemServiceImpl extends DefaultMapper implements MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    /**
     * Create new MenuItem
     */
    @Override
    @Transactional
    public void create( MenuItemDTO menuItemDTO ) {
	menuItemRepository.save( convertObject( menuItemDTO, MenuItem.class ) );
    }

    /**
     * Retrieve all MenuItems
     */
    @Override
    public List<MenuItemDTO> getAll() {
	return convertList( menuItemRepository.findAll(), MenuItemDTO[].class );
    }

    /**
     * Retrieve MenuItem by ID
     */
    @Override
    public MenuItemDTO getById( int id ) {
	return convertObject( menuItemRepository.findById( id ).get(), MenuItemDTO.class );
    }

    /**
     * Update MenuItem by ID
     */
    @Override
    @Transactional
    public void updateById( int id, MenuItemDTO menuItemDTO ) {
	if ( menuItemRepository.findById( id ).isPresent() ) {
	    menuItemDTO.setId( id );
	    menuItemRepository.save( convertObject( menuItemDTO, MenuItem.class ) );
	}
    }

    /**
     * Delete MenuItem by ID
     */
    @Override
    @Transactional
    public void deleteById( int id ) {
	menuItemRepository.deleteById( id );
    }

}
