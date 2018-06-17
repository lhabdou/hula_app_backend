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
import com.hula.controllers.CategorieController;
import com.hula.domain.Categorie;
import com.hula.services.ICategoriesService;

@RunWith(SpringJUnit4ClassRunner.class)
public class CategorieControllerTest {

	private MockMvc mockMvc;

	@InjectMocks
	private CategorieController apiRestController;

	@Mock
	private ICategoriesService categorieService;

	private List<Categorie> listeCat;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(apiRestController).build();
		
		listeCat = new ArrayList<>(); 
		
		Categorie categorie = new Categorie();
		categorie.setDescriptif("bonne categorie");
		categorie.setIdCategorie(1L);
		categorie.setNomCategorie("Boissons Bio");
		listeCat.add(categorie );
		
	}

	@Test
	public void testGetAllCategories() throws Exception {
		
		Mockito.when(categorieService.findAllCategories()).thenReturn(listeCat);
		
		mockMvc.perform(get("/hula-app/categories"))
				.andExpect(status().is(200))
				.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
			.andExpect(jsonPath("$[0].idCategorie", is(listeCat.get(0).getIdCategorie().intValue())))
			.andExpect(jsonPath("$[0].descriptif", is(listeCat.get(0).getDescriptif())))
			.andExpect(jsonPath("$[0].nomCategorie", is(listeCat.get(0).getNomCategorie())));
	}

}
