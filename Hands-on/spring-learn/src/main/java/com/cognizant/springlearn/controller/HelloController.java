package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.SpringLearnApplication;
@RestController
public class HelloController {
	private static final Logger LOGGER=LoggerFactory.getLogger(SpringLearnApplication.class);
	@GetMapping("/")
	public String sayHello() {
		LOGGER.info("Start of get hello world");
		return "Hello World!!";
		//LOGGER.info("End of get hello world");
		
	}
	

}
