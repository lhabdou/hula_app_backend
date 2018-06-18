package com.hula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hula.services.IHomeService;

@RestController
@RequestMapping(value="/hula-app", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@CrossOrigin("*")
public class HomeController {
	
	@Autowired
	private IHomeService homeService; 
	
	
	@RequestMapping("/home")
	public String getHome() {
		
		return homeService.getHome();
	}

}
