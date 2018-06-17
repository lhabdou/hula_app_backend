package com.hula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hula.domain.CodeCouleur;
import com.hula.services.ICodeCouleurService;

@RestController
@RequestMapping("/hula-app")
public class CodeCouleurController {
	
	@Autowired
	private ICodeCouleurService codeCouleurService; 
	
	
	/**
	 * @param code
	 * @return ResponseEntity<CodeCouleur>
	 */
	@RequestMapping("/codeCouleur/{code}")
	public ResponseEntity<CodeCouleur> getCodeCouleur(@PathVariable("code") String code) {
		
		return new ResponseEntity<CodeCouleur>(codeCouleurService.getCodeCouleur(code), HttpStatus.OK);
	}
	
	/**
	 * @return ResponseEntity<List<CodeCouleur>>
	 */
	@RequestMapping("/codesCouleurs")
	public ResponseEntity<List<CodeCouleur>> getAllCodesCouleurs() {
		
		return new ResponseEntity<List<CodeCouleur>>(codeCouleurService.getAllCodesCouleurs(), HttpStatus.OK);
	}

}
