package com.hula.services.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.hula.domain.Categorie;
import com.hula.entities.CategorieEntite;
import com.hula.mapper.CategorieMapper;
import com.hula.repository.CategorieRepository;

@PrepareForTest({ CategorieMapper.class })
@RunWith(PowerMockRunner.class)
public class CategorieServiceTest {
	
	@Mock
	private CategorieRepository categorieRepository;	
	
	private CategorieService categorieService;

	private List<Categorie> listeResult;

	private List<CategorieEntite> listeCat;

	private CategorieEntite categorieEntite1;

	private CategorieEntite categorieEntite2;

	private Categorie cat1;

	private Categorie cat2;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	
		categorieService = new CategorieService();
		
		categorieService.setCategorieRepository(categorieRepository);
		listeCat = new ArrayList<>();
		listeResult = new ArrayList<>(); 
		
		listeCat = new ArrayList<>(); 
		categorieEntite1 = new CategorieEntite(); 
		categorieEntite1.setIdCategorie(1L);
		categorieEntite1.setNom("Chips");
		categorieEntite1.setDescriptifCategorie("Attention de ne pas grossir");
		
		categorieEntite2 = new CategorieEntite(); 
		categorieEntite2.setIdCategorie(2L);
		categorieEntite2.setNom("Boissons");
		categorieEntite2.setDescriptifCategorie("Trop de sucre");
		
		listeCat.add(categorieEntite1); 
		listeCat.add(categorieEntite2);
		
		cat1 = new Categorie();
		cat1.setIdCategorie(1L);
		cat1.setNomCategorie("Chips");
		cat1.setDescriptif("Attention de ne pas grossir");
		
		cat2 = new Categorie(); 
		cat2.setIdCategorie(2L);
		cat2.setNomCategorie("Boissons");
		cat2.setDescriptif("Trop de sucre");
		
		listeResult.add(cat1);
		listeResult.add(cat2);
		
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testFindAllCategories() {
		
		Mockito.when(categorieRepository.findAll()).thenReturn(listeCat);
		PowerMockito.mockStatic(CategorieMapper.class);
		PowerMockito.when(CategorieMapper.transformerListeCategoriesEntiteEnListeCatgories(Mockito.anyList())).thenReturn(listeResult);
		
		List<Categorie> listeCategories = categorieService.findAllCategories(); 
		assertNotNull(listeCategories);
		assertTrue(listeCategories.size() == 2);
		
		Categorie categorie1 = listeCategories.get(0);
		
		assertNotNull(categorie1);
		
		assertEquals(categorie1.getIdCategorie(), cat1.getIdCategorie());
		assertEquals(categorie1.getNomCategorie(), cat1.getNomCategorie());
		assertEquals(categorie1.getDescriptif(), cat1.getDescriptif());
		
		Categorie categorie2 = listeCategories.get(1);
		
		assertNotNull(categorie2);
		
		assertEquals(categorie2.getIdCategorie(), cat2.getIdCategorie());
		assertEquals(categorie2.getNomCategorie(), cat2.getNomCategorie());
		assertEquals(categorie2.getDescriptif(), cat2.getDescriptif());
	}
}
