package com.restaurant.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dto.MenuItemDTO;
import com.restaurant.mapper.MenuItemMapper;
import com.restaurant.repositories.MenuItemRepository;
import com.restaurant.services.MenuItemService;

@Service
public class MenuItemServiceImpl implements MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    private MenuItemMapper menuItemMapper = new MenuItemMapper();

    @Override
    @Transactional
    public List<MenuItemDTO> getMenuItems() {
	return menuItemMapper.toDTOList( menuItemRepository.findAll() );
    }
}
