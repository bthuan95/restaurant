package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.dto.MenuItemDTO;
import com.restaurant.services.MenuItemService;

@RestController
@RequestMapping( MenuItemController.MENUITEM_URL )
public class MenuItemController implements DefaultController<MenuItemDTO> {

    @Autowired
    MenuItemService menuItemService;

    public static final String MENUITEM_URL = "/api/v1/menuitem";

    @Override
    @RequestMapping( method = RequestMethod.POST )
    public void create( @RequestBody MenuItemDTO menuItemDTO ) {
	menuItemService.create( menuItemDTO );
    }

    @Override
    @RequestMapping( method = RequestMethod.GET )
    public List<MenuItemDTO> getAll() {
	return menuItemService.getAll();
    }

    @Override
    @RequestMapping( value = "/{id}", method = RequestMethod.GET )
    public MenuItemDTO getById( @PathVariable( "id" ) int id ) {
	return menuItemService.getById( id );
    }

    @Override
    @RequestMapping( value = "/{id}", method = RequestMethod.PUT )
    public void updateById( @PathVariable( "id" ) int id, @RequestBody MenuItemDTO menuItemDTO ) {
	menuItemService.updateById( id, menuItemDTO );
    }

    @Override
    @RequestMapping( value = "/{id}", method = RequestMethod.DELETE )
    public void deleteById( @PathVariable( "id" ) int id ) {
	menuItemService.deleteById( id );
    }

}