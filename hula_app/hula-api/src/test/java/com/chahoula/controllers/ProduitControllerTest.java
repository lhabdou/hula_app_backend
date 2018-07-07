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
import com.hula.controllers.ProduitController;
import com.hula.domain.Produit;
import com.hula.services.IProduitService;

@RunWith(SpringJUnit4ClassRunner.class)
public class ProduitControllerTest {

	private MockMvc mockMvc;

	@InjectMocks
	private ProduitController apiRestController;

	@Mock
	private IProduitService produitService;

	private List<Produit> listeCat;

	private Produit produit;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(apiRestController).build();
		
		listeCat = new ArrayList<>(); 
		
		produit = new Produit();
		produit.setDescriptif("Oasis Tropical");
		produit.setCodeEan("4568565");;
		produit.setNomProduit("Boisson sucré");
		listeCat.add(produit );
		
	}

	@Test
	public void testGetProduit() throws Exception {
		
		Mockito.when(produitService.getProduit(Mockito.anyString())).thenReturn(produit);
		
		mockMvc.perform(get("/hula-app/produit/4568565"))
				.andExpect(status().is(200))
				.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
			.andExpect(jsonPath("$.codeEan", is(produit.getCodeEan())))
			.andExpect(jsonPath("$.nomProduit", is(produit.getNomProduit())))
			.andExpect(jsonPath("$.descriptifProduit", is(produit.getDescriptif())));
	}

}
