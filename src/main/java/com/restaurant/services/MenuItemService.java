package com.restaurant.services;

import java.util.List;

import com.restaurant.dto.MenuItemDTO;

public interface MenuItemService {

    public List<MenuItemDTO> getMenuItems();

    public MenuItemDTO getMenuItem( int id );

    public void createMenuItem( MenuItemDTO menuItemDTO );

}