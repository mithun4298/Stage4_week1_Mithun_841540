package com.cognizant.mithun.pratice_truyum.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.mithun.pratice_truyum.PraticeTruyumApplication;
import com.cognizant.mithun.pratice_truyum.dao.CartDao;
import com.cognizant.mithun.pratice_truyum.model.MenuItem;
@Service
public class CartService {

	@Autowired
	CartDao cartDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PraticeTruyumApplication.class);
	
	public void addCartItem(String userId, int menuItemId) {
		LOGGER.debug("addCartService Starts");
		cartDao.addCartItem(userId, menuItemId);
		LOGGER.debug("addCartService Ends");
	}

	public ArrayList<MenuItem> getAllCartItems(String userId) {
		LOGGER.debug("getAllCartItemsService Starts");
		return cartDao.getAllCartItems(userId);		
	}

	public void deleteCartItem(String userId, int menuItemId) {
		LOGGER.debug("deleteCartItemService Starts");
		cartDao.deleteCartItem(userId, menuItemId);
		LOGGER.debug("deleteCartItemService Ends");
	}

}
