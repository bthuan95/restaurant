package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.dto.MenuItemDTO;
import com.restaurant.services.MenuItemService;

@RestController
public class MenuItemController {

    @Autowired
    MenuItemService menuItemService;

    @RequestMapping( value = "/api/v1/menuitem", method = RequestMethod.GET )
    public List<MenuItemDTO> getAll() {
	return menuItemService.getMenuItems();
    }

    @RequestMapping( value = "/api/v1/menuitem/abc", method = RequestMethod.GET )
    public MenuItemDTO getById( @PathVariable( "id" ) int id ) {
	return menuItemService.getMenuItem( id );
    }
}