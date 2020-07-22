package com.cognizant.mithun.pratice_truyum.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.mithun.pratice_truyum.PraticeTruyumApplication;
import com.cognizant.mithun.pratice_truyum.dao.MenuItemDao;
import com.cognizant.mithun.pratice_truyum.model.MenuItem;


@Service
public class MenuItemService {
	
	@Autowired
	private  MenuItemDao menuItemDao; 
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PraticeTruyumApplication.class);
	
	public ArrayList<MenuItem> getMenuItemListCustomer() {
		LOGGER.debug("MenuItemService.getMenuItemListCustomer() START");
		LOGGER.debug("MenuItemService.getMenuItemListCustomer() ENDS");
		
		return menuItemDao.getMenuItemListCustomer();
	}

	public MenuItem getMenuItem(int id) {
		return menuItemDao.getmenuItem(id);
	}
	
	public void modifyMenuItem(MenuItem menuItem) {
		menuItemDao.modifyMenuItem(menuItem);
	}
}
