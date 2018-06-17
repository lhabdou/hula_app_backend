package com.hula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hula.services.IHomeService;

@RestController
@RequestMapping("/hula-app")
public class HomeController {
	
	@Autowired
	private IHomeService homeService; 
	
	
	@RequestMapping("/home")
	public String getHome() {
		
		return homeService.getHome();
	}

}
