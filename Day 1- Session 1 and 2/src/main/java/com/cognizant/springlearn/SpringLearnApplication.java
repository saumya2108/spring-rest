package com.cognizant.springlearn;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.model.Country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	public static void main(String[] args) {
		displayCountry();
		SpringApplication.run(SpringLearnApplication.class, args);
	}
	
	public static void displayDate() {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext();
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		try {  
			String strDate = "31/12/2018";
	        Date date = (Date) format.parse(strDate);
	        System.out.println(date);
	        LOGGER.debug(strDate);
	    } catch (ParseException e) {e.printStackTrace();}  
		LOGGER.info("END");
	}
	
	public static void displayCountry() {
		LOGGER.info("START of displayCountry()");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

//for first 5 hands-on		
//		Country country = (Country) context.getBean("country", Country.class);
//		Country anotherCountry = context.getBean("country", Country.class);
//		
//		LOGGER.debug("Country : {}", country.toString());
		
		List<Country> countries = (List<Country>) context.getBean("countryList");
		
		
		for(Country country: countries)
		{	
			LOGGER.debug("{} as with short name {}.",country.getName(),country.getName());
		}
		LOGGER.info("END of displayCountry()");
	}
}
