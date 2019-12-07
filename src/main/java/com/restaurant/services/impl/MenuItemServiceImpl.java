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
    public List<MenuItemDTO> getMenuItems() {
	return convertList( menuItemRepository.findAll(), MenuItemDTO[].class );
    }

    @Override
    public MenuItemDTO getMenuItem( int id ) {
	return convertObject( menuItemRepository.findById( id ), MenuItemDTO.class );
    }

    @Override
    public void createMenuItem( MenuItemDTO menuItemDTO ) {
	menuItemRepository.save( convertObject( menuItemDTO, MenuItem.class ) );
    }

}
