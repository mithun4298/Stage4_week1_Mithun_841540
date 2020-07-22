package com.cognizant.mithun.pratice_truyum.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.mithun.pratice_truyum.model.MenuItem;
import com.cognizant.mithun.pratice_truyum.service.CartService;
@RestController
@RequestMapping("/carts")
public class CartController {

	@Autowired
	private CartService cartService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(com.cognizant.mithun.pratice_truyum.PraticeTruyumApplication.class);
	
	@PostMapping("/{userId}/{menuItemId}")
	public void addCartItem(@PathVariable("userId") String userId, @PathVariable("menuItemId") int menuItemId) {
		LOGGER.info("addCart controller Start");
		cartService.addCartItem(userId, menuItemId);
		LOGGER.info("addCart controller Ends");
	}
	
	@GetMapping("/{userId}")
	public ArrayList<MenuItem> getAllCartItems(@PathVariable("userID") String userId) {
		LOGGER.info("addCart controller Start");
		return cartService.getAllCartItems(userId);
	}
	
	@DeleteMapping("/{userId}/{menuItemId}")
	public void deleteCartItems(@PathVariable("userId") String userId, @PathVariable("menuItemId") int menuItemId) {
		cartService.deleteCartItem(userId, menuItemId);
	}
}
