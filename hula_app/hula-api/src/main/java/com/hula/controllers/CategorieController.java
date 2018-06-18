package com.hula.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hula.domain.Categorie;
import com.hula.services.ICategoriesService;

@RestController
@RequestMapping(value="/hula-app", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@CrossOrigin("*")
public class CategorieController {
	
	@Autowired
	private ICategoriesService categorieService; 
	
	
	/**
	 * @return ResponseEntity<List<Categorie>> 
	 */
	@RequestMapping(value="/categories")
	public ResponseEntity<List<Categorie>> getAllCategories() {
		
		return new ResponseEntity<List<Categorie>>(categorieService.findAllCategories(), HttpStatus.OK);
	}
	
	/**
	 * @return ResponseEntity<List<Categorie>> 
	 */
	@RequestMapping("/categorie/{id}")
	public ResponseEntity<Categorie> getCategorie(@PathVariable("id") Long id) {
		
		return new ResponseEntity<Categorie>(categorieService.getCategorieWithId(id), HttpStatus.OK);
	}

}
