package com.cognizant.springlearn.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
	
	private String code;
	private String name;
	
	public String getCode() {
		LOGGER.debug("Inside Country getter of code.");
		return code;
	}
	public void setCode(String code) {
		LOGGER.debug("Inside Country setter of code.");
		this.code = code;
	}
	public String getName() {
		LOGGER.debug("Inside Country getter of name.");
		return name;
	}
	
	public void setName(String name) {
		LOGGER.debug("Inside Country setter of name.");
		this.name = name;
	}
	
	@Override
	public String toString() {
		LOGGER.debug("Inside Country Constructor");
		return "Country [code=" + code + ", name=" + name + "]";
	}
}
