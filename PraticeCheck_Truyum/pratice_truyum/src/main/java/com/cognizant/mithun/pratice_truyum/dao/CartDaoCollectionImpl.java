package com.cognizant.mithun.pratice_truyum.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.mithun.pratice_truyum.model.Cart;
import com.cognizant.mithun.pratice_truyum.model.MenuItem;

@Repository
public class CartDaoCollectionImpl implements CartDao {

	private static HashMap<String, Cart> cartItems = new HashMap<String, Cart>();

	private static ApplicationContext context = new ClassPathXmlApplicationContext("truyum.xml");
	private static ArrayList<MenuItem> ITEM_LIST = context.getBean("menuList", java.util.ArrayList.class);

	private static final Logger LOGGER = LoggerFactory.getLogger(CartDaoCollectionImpl.class);

	@Override
	public void addCartItem(String userId, int menuItemId) {
		LOGGER.debug("STARTS");
		if (cartItems.isEmpty()) {
			Cart cart = new Cart();
			ArrayList<Integer> list = new ArrayList<Integer>();
			LOGGER.debug("BEFORE: " + list.toString());
			list.add(menuItemId);
			cart.setCartItems(list);
			cartItems.put(userId, cart);
			LOGGER.debug("AFTER: " + list.toString());
		} else if (cartItems.containsKey(userId)) {
			Cart cart = cartItems.get(userId);
			ArrayList<Integer> list = cart.getCartItems();
			LOGGER.debug("BEFORE: " + list.toString());
			if (!list.contains(menuItemId))
				list.add(menuItemId);
			cart.setCartItems(list);
			cartItems.put(userId, cart);
			LOGGER.debug("AFTER: " + list.toString());
		} else {
			Cart cart = new Cart();
			ArrayList<Integer> list = new ArrayList<Integer>();
			LOGGER.debug("BEFORE: " + list.toString());
			list.add(menuItemId);
			cart.setCartItems(list);
			cartItems.put(userId, cart);
			LOGGER.debug("AFTER: " + list.toString());
		}

		LOGGER.debug("END");
	}

	@Override
	public ArrayList<MenuItem> getAllCartItems(String userId) {
		LOGGER.debug("STARTS");
		if (cartItems.containsKey(userId)) {
			Cart cart = cartItems.get(userId);
			ArrayList<Integer> list = cart.getCartItems();
			ArrayList<MenuItem> itemlist = new ArrayList<MenuItem>();

			for (int i = 0; i < list.size(); i++) {

				for (int j = 0; j < ITEM_LIST.size(); j++) {
					if (ITEM_LIST.get(j).getId() == list.get(i)) {
						itemlist.add(ITEM_LIST.get(j));
					}
				}
			}

			return itemlist;
		}
		return null;
	}

	@Override
	public void deleteCartItem(String userId, int menuItemId) {
		LOGGER.debug("STARTS");
		if (cartItems.containsKey(userId)) {
			Cart cart = cartItems.get(userId);
			ArrayList<Integer> list = cart.getCartItems();
			LOGGER.debug("BEFORE: " + list.toString());
			if (list.contains(menuItemId)) {
				int index = list.indexOf(menuItemId);
				list.remove(index);
			}
			cart.setCartItems(list);
			cartItems.put(userId, cart);
			LOGGER.debug("AFTER: " + list.toString());
		}
		LOGGER.debug("END");
	}

}
