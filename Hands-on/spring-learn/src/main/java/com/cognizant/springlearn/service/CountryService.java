package com.cognizant.springlearn.service;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	public Country getCountry(String Code) throws CountryNotFoundException   {

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> countires = context.getBean("countryList", java.util.ArrayList.class);

		for (Country country : countires) {
			if (country.getCode().equalsIgnoreCase(Code))
				return country;
			throw new CountryNotFoundException();
		};
		return null;

	}
}