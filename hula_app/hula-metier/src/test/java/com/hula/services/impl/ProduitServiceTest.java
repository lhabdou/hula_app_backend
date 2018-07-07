package com.hula.services.impl;

import static org.junit.Assert.assertNotNull;

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

import com.hula.domain.Produit;
import com.hula.entities.ProduitEntite;
import com.hula.mapper.ProduitMapper;
import com.hula.repository.ProduitRepository;

@PrepareForTest({ ProduitMapper.class })
@RunWith(PowerMockRunner.class)
public class ProduitServiceTest {
	
	@Mock
	private ProduitRepository produitRepository;	
	
	private ProduitService produitService;

	private List<Produit> listeResult;

	private List<ProduitEntite> liste;

	private ProduitEntite produitEntite;

	private Produit produit;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	
		produitService = new ProduitService();
		
		produitService.setProduitRepository(produitRepository);
		
		liste = new ArrayList<>();
		listeResult = new ArrayList<>(); 
		
		produitEntite = new ProduitEntite(); 
		produitEntite.setCodeEan("1121511");
		produitEntite.setNom("Jus de mangue");
		produitEntite.setDescriptifProduit("Boisson sucré");
		
		produit = new Produit(); 
		produit.setCodeEan("1121511");
		produit.setNomProduit("Jus de mangue");
		produit.setDescriptif("Boisson sucré");
		
		listeResult.add(produit);

	}
	
	@Test
	public void testGetProduit() {
		
		Mockito.when(produitRepository.findAll()).thenReturn(liste);
		PowerMockito.mockStatic(ProduitMapper.class);
		PowerMockito.when(ProduitMapper.transformerProduitEntiteEnProduit((ProduitEntite)Mockito.anyObject())).thenReturn(produit);
		
		Produit produit = produitService.getProduit("1121511"); 
		assertNotNull(produit);
		
	}
}
