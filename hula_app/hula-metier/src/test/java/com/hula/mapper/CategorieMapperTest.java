package com.hula.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hula.domain.Categorie;
import com.hula.entities.CategorieEntite;

public class CategorieMapperTest {

	private List<CategorieEntite> listeCategoriesEntite;
	private CategorieEntite categorieEntite1;
	private CategorieEntite categorieEntite2;

	@Before
	public void setUp() {
		
		listeCategoriesEntite = new ArrayList<>(); 
		categorieEntite1 = new CategorieEntite(); 
		categorieEntite1.setIdCategorie(1L);
		categorieEntite1.setNom("Chips");
		categorieEntite1.setDescriptifCategorie("Attention de ne pas grossir");
		
		categorieEntite2 = new CategorieEntite(); 
		categorieEntite2.setIdCategorie(2L);
		categorieEntite2.setNom("Boissons");
		categorieEntite2.setDescriptifCategorie("Trop de sucre");
		
		listeCategoriesEntite.add(categorieEntite1); 
		listeCategoriesEntite.add(categorieEntite2);
		

	}

	@Test
	public void testTransformerListeCategoriesEntiteEnListeCatgories() {

		List<Categorie> listeCategories = CategorieMapper
				.transformerListeCategoriesEntiteEnListeCatgories(listeCategoriesEntite);
		
		assertTrue(!listeCategories.isEmpty());
		assertTrue(listeCategories.size() == 2);
		
		Categorie categorie1 = listeCategories.get(0);
		assertEquals(1L, categorie1.getIdCategorie(),0);
		assertEquals("Chips", categorie1.getNomCategorie());
		assertEquals("Attention de ne pas grossir", categorie1.getDescriptif());
		
		Categorie categorie2 = listeCategories.get(1);
		assertEquals(2L, categorie2.getIdCategorie(),0);
		assertEquals("Boissons", categorie2.getNomCategorie());
		assertEquals("Trop de sucre", categorie2.getDescriptif());

	}
	
	@Test
	public void testTransformerListeCategoriesEntiteNullEnListeCatgories() {

		List<Categorie> listeCategories = CategorieMapper
				.transformerListeCategoriesEntiteEnListeCatgories(null);
		
		assertTrue(listeCategories.isEmpty());

	}
	
	@Test
	public void testTransformerCategoriesEntiteNullEnCatgorie() {

		Categorie categorie = CategorieMapper
				.transformerCategorieEntiteEnCategorie(null);
		
		assertNull(categorie);

	}

}
