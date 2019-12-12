package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.config.AppConstants;
import com.restaurant.dto.MenuItemDTO;
import com.restaurant.services.MenuItemService;

/**
 * Controller for Menu Item
 * 
 * @author bthuan
 *
 */
@RestController
@RequestMapping( AppConstants.MENUITEM_URL )
public class MenuItemController implements DefaultController<MenuItemDTO> {

    @Autowired
    MenuItemService menuItemService;

    /**
     * Create new MenuItem
     */
    @Override
    @RequestMapping( method = RequestMethod.POST )
    public void create( @RequestBody MenuItemDTO menuItemDTO ) {
	menuItemService.create( menuItemDTO );
    }

    /**
     * Retrieve all MenuItems
     */
    @Override
    @RequestMapping( method = RequestMethod.GET )
    public List<MenuItemDTO> getAll() {
	return menuItemService.getAll();
    }

    /**
     * Retrieve MenuItem by ID
     */
    @Override
    @RequestMapping( value = AppConstants.ID_URL, method = RequestMethod.GET )
    public MenuItemDTO getById( @PathVariable( AppConstants.ID ) int id ) {
	return menuItemService.getById( id );
    }

    /**
     * Update MenuItem by ID
     */
    @Override
    @RequestMapping( value = AppConstants.ID_URL, method = RequestMethod.PUT )
    public void updateById( @PathVariable( AppConstants.ID ) int id, @RequestBody MenuItemDTO menuItemDTO ) {
	menuItemService.updateById( id, menuItemDTO );
    }

    /**
     * Delete MenuItem by ID
     */
    @Override
    @RequestMapping( value = AppConstants.ID_URL, method = RequestMethod.DELETE )
    public void deleteById( @PathVariable( AppConstants.ID ) int id ) {
	menuItemService.deleteById( id );
    }

}