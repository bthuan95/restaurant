package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.dto.MenuItemDTO;
import com.restaurant.services.MenuItemService;

@RestController
public class MenuItemController {

    @Autowired
    MenuItemService menuItemService;

    @RequestMapping( value = "/menuitem", method = RequestMethod.GET )
    public List<MenuItemDTO> getAll() {
	return menuItemService.getMenuItems();
    }
}