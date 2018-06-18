package com.hula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hula.domain.Produit;
import com.hula.services.IProduitService;

@RestController
@RequestMapping(value="/hula-app", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@CrossOrigin("*")
public class ProduitController {
	
	@Autowired
	private IProduitService produitService; 
	
	@RequestMapping(value = "/produit/{codeEan}", method = RequestMethod.GET)
	public ResponseEntity<Produit> getProduit(@PathVariable("codeEan")String codeEan) {
		
		return new ResponseEntity<Produit>(produitService.getProduit(codeEan), HttpStatus.OK);
	}


}
