package com.cognizant.mithun.pratice_truyum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraticeTruyumApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(PraticeTruyumApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PraticeTruyumApplication.class, args);
		LOGGER.info("main application statrted");
	}

}
