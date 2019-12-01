package com.restaurant.mapper;

import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;

import com.restaurant.dto.MenuItemDTO;
import com.restaurant.entities.MenuItem;

public class MenuItemMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public MenuItemDTO toDTO( MenuItem menuItem ) {
	return modelMapper.map( menuItem, MenuItemDTO.class );
    }

    public MenuItem toEntity( MenuItemDTO menuItemDTO ) {
	return modelMapper.map( menuItemDTO, MenuItem.class );
    }

    public List<MenuItemDTO> toDTOList( List<MenuItem> menuItems ) {
	return Arrays.asList( modelMapper.map( menuItems, MenuItemDTO[].class ) );
    }
}
