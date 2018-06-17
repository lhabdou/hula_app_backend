package com.chahoula.controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.chahoula.util.TestUtil;
import com.hula.controllers.CodeCouleurController;
import com.hula.domain.CodeCouleur;
import com.hula.services.ICodeCouleurService;

@RunWith(SpringJUnit4ClassRunner.class)
public class CodeCouleurControllerTest {

	private MockMvc mockMvc;

	@InjectMocks
	private CodeCouleurController apiRestController;

	@Mock
	private ICodeCouleurService codeCouleurService;

	private List<CodeCouleur> liste;

	private CodeCouleur codeCouleur;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(apiRestController).build();
		
		liste = new ArrayList<>(); 
		
		codeCouleur = new CodeCouleur();
		codeCouleur.setCode("VER");
		codeCouleur.setLibelle("Vert");;
		liste.add(codeCouleur );
		
	}

	@Test
	public void testGetCodeCouleur() throws Exception {
		
		Mockito.when(codeCouleurService.getCodeCouleur("VER")).thenReturn(codeCouleur);
		
		mockMvc.perform(get("/hula-app/codeCouleur/VER"))
				.andExpect(status().is(200))
				.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
			.andExpect(jsonPath("$.code", is(codeCouleur.getCode())))
			.andExpect(jsonPath("$.libelle", is(codeCouleur.getLibelle())));
	}
	
	@Test
	public void testGetAllCodesCouleurs() throws Exception {
		
		Mockito.when(codeCouleurService.getAllCodesCouleurs()).thenReturn(liste);
		
		mockMvc.perform(get("/hula-app/codesCouleurs"))
				.andExpect(status().is(200))
				.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
			.andExpect(jsonPath("$[0].code", is(codeCouleur.getCode())))
			.andExpect(jsonPath("$[0].libelle", is(codeCouleur.getLibelle())));
	}

}
