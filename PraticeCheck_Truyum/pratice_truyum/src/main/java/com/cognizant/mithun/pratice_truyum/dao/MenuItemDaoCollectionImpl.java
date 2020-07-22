package com.cognizant.mithun.pratice_truyum.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.mithun.pratice_truyum.PraticeTruyumApplication;
import com.cognizant.mithun.pratice_truyum.model.MenuItem;

@Repository
public class MenuItemDaoCollectionImpl implements MenuItemDao{

	private static final Logger LOGGER = LoggerFactory.getLogger(PraticeTruyumApplication.class);
	
	public ArrayList<MenuItem> getMenuItemListCustomer(){
		LOGGER.debug("MenuItemDaoCollectionImpl.getMenuItemListCustomer() START");
		ApplicationContext context = new ClassPathXmlApplicationContext("truyum.xml");
		ArrayList<MenuItem> MENU_ITEMS = context.getBean("menuList", java.util.ArrayList.class);
		LOGGER.debug("MenuItemDaoCollectionImpl.getMenuItemListCustomer() ENDS");
		return MENU_ITEMS;
	}

	@Override
	public MenuItem getmenuItem(int id) {
		LOGGER.debug("MenuItemDaoCollectionImpl.getMenuItem() START");
		ApplicationContext context = new ClassPathXmlApplicationContext("truyum.xml");
		ArrayList<MenuItem> MENU_ITEMS = context.getBean("menuList", java.util.ArrayList.class);
		MenuItem menuItem = MENU_ITEMS.stream().filter(menu -> menu.getId() == id).findFirst().orElse(null);
		
		LOGGER.debug("MenuItemDaoCollectionImpl.getMenuItem() ENDS");
		return menuItem;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		LOGGER.debug("MenuItemDaoCollectionImpl.modifyMenuItem() START");
		ApplicationContext context = new ClassPathXmlApplicationContext("truyum.xml");
		ArrayList<MenuItem> MENU_ITEMS = context.getBean("menuList", java.util.ArrayList.class);
		MenuItem menuItemOld = MENU_ITEMS.stream().filter(menu -> menu.getId() == menuItem.getId()).findFirst().orElse(null);
		LOGGER.info("Old MenuItem:" + menuItemOld.toString());
		LOGGER.info("updated MenuItem:" + menuItem.toString());
		LOGGER.debug("MenuItemDaoCollectionImpl.modifyMenuItem ENDS");
		
	};
}
