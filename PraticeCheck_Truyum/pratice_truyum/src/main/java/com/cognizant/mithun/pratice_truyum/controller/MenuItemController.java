package com.cognizant.mithun.pratice_truyum.controller;

import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.mithun.pratice_truyum.model.MenuItem;
import com.cognizant.mithun.pratice_truyum.service.MenuItemService;

@RestController
@RequestMapping("/menu-items")
public class MenuItemController {

	@Autowired
	MenuItemService menuItemSrevice;
	
	@GetMapping
	public ArrayList<MenuItem> getAllMenuItems() {
		return menuItemSrevice.getMenuItemListCustomer();
	}
	
	@GetMapping("/{id}")
	public MenuItem getMenuItem(@PathVariable("id") int id) {
		return menuItemSrevice.getMenuItem(id);
	}
	
	@PutMapping
	public void modifyMenuItem(@RequestBody MenuItem menuItem) {
		menuItemSrevice.modifyMenuItem(menuItem);
	}
}
