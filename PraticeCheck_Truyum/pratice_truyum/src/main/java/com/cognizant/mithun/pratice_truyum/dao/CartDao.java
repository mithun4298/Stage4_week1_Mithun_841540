package com.cognizant.mithun.pratice_truyum.dao;

import java.util.ArrayList;

import com.cognizant.mithun.pratice_truyum.model.MenuItem;

public interface CartDao {

	void addCartItem(String userId, int menuItemId);

	ArrayList<MenuItem> getAllCartItems(String userId);

	void deleteCartItem(String userId, int menuItemId);

}
