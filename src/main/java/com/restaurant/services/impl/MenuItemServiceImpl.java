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

@Service
public class MenuItemServiceImpl extends DefaultMapper implements MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    @Override
    @Transactional
    public void create( MenuItemDTO menuItemDTO ) {
	menuItemRepository.save( convertObject( menuItemDTO, MenuItem.class ) );
    }

    @Override
    public List<MenuItemDTO> getAll() {
	return convertList( menuItemRepository.findAll(), MenuItemDTO[].class );
    }

    @Override
    public MenuItemDTO getById( int id ) {
	return convertObject( menuItemRepository.findById( id ).get(), MenuItemDTO.class );
    }

    @Override
    @Transactional
    public void updateById( int id, MenuItemDTO menuItemDTO ) {
	if ( menuItemRepository.findById( id ).isPresent() ) {
	    menuItemDTO.setId( id );
	    menuItemRepository.save( convertObject( menuItemDTO, MenuItem.class ) );
	}
    }

    @Override
    public void deleteById( int id ) {
	menuItemRepository.deleteById( id );
    }

}
