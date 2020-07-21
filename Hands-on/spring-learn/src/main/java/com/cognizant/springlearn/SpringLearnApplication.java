package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER=LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		//LOGGER.info("Simple log statement with inputs {}, {} and {}", 1,2,3);
		LOGGER.info("Simple log for main application" );
		displayDate();
		displayCountry();
		displayCountries();
	}
public static void displayDate() {
	LOGGER.info("Date parsing Start");
	ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
	SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
	Date date = null;
	try {
		date=format.parse("31/12/2018");
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("Date parsing object value: "+date);
	LOGGER.debug(date.toString());
	LOGGER.info("Date parsing End");
}


public static void displayCountry() {
	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	Country country = (Country) context.getBean("country", Country.class);
	Country anotherCountry = context.getBean("country", Country.class);
	LOGGER.debug("Country : {}", country.toString());
	LOGGER.debug("Country : {}", anotherCountry.toString());

	
}

public static void displayCountries() {
	LOGGER.info("inside starting of display countries method ");
	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	//Country country = (Country) context.getBean("country", Country.class);
	ArrayList<Country> array =  context.getBean("countryList", java.util.ArrayList.class);
	for (Country country : array) {
		LOGGER.debug("Country: {}", country.toString());
	}
	LOGGER.info("Ending of  display countries method: ");
}




}
