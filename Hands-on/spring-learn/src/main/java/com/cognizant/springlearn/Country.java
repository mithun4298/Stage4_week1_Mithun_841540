package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	String code;
	String name;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	
	

	public Country() {
		super();
		LOGGER.info("Inside Country class Constructor");
		// TODO Auto-generated constructor stub
	}
	public String getCode() {
		LOGGER.info("Inside getCode of Country class");
		return code;
	}
	public void setCode(String code) {
		LOGGER.info("Inside setCode of Country class");
		this.code = code;
	}
	public String getName() {
		LOGGER.info("Inside getName of Country class");
		return name;
	}
	public void setName(String name) {
		LOGGER.info("Inside setName of Country class");
		this.name = name;
	}
	public static Logger getLogger() {
		return LOGGER;
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
	

}
