package com.cognizant.mithun.pratice_truyum.model;

import java.util.ArrayList;

public class Cart {
	private String id;
	private ArrayList<Integer> cartItems;
	
	@Override
	public String toString() {
		return "Cart [id=" + id + ", cartItems=" + cartItems + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Integer> getCartItems() {
		return cartItems;
	}

	public void setCartItems(ArrayList<Integer> cartItems) {
		this.cartItems = cartItems;
	} 
}
