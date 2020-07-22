package com.cognizant.mithun.pratice_truyum.dao;

import java.util.ArrayList;

import com.cognizant.mithun.pratice_truyum.model.MenuItem;

public interface MenuItemDao {
	
	public ArrayList<MenuItem> getMenuItemListCustomer();

	public MenuItem getmenuItem(int id);
	
	public void modifyMenuItem(MenuItem menuItem);
}
