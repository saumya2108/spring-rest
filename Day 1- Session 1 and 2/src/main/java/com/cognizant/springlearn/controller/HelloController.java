package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping(value="")
	public ResponseEntity<String> sayHello() {
		LOGGER.info("Start of sayHello() method!");
		LOGGER.info("End of sayHello() method!");
		return new ResponseEntity<String>("Hello World!!", HttpStatus.OK);
	}
}
