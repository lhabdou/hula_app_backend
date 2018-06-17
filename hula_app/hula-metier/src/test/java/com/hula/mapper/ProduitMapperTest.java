package com.hula.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hula.domain.Produit;
import com.hula.entities.CategorieEntite;
import com.hula.entities.CodeCouleursEntite;
import com.hula.entities.ProduitEntite;

public class ProduitMapperTest {

	private List<ProduitEntite> listeProduitsEntite;
	private ProduitEntite produitEntite1;

	@Before
	public void setUp() {
		
		listeProduitsEntite = new ArrayList<>(); 
		produitEntite1 = new ProduitEntite(); 
		produitEntite1.setCodeEan("545451218");;
		produitEntite1.setNom("Biscuit LU");
		produitEntite1.setDescriptifProduit("très bon");
		CodeCouleursEntite codeCouleur = new CodeCouleursEntite();
		codeCouleur.setCodeCouleur("VER");
		codeCouleur.setLibelle("Vert");
		produitEntite1.setCodeCouleur(codeCouleur);
		CategorieEntite categorie = new CategorieEntite();
		categorie.setIdCategorie(1L);
		categorie.setNom("Gateaux");
		produitEntite1.setCategorie(categorie);
		listeProduitsEntite.add(produitEntite1); 
		

	}

	@Test
	public void testTransformerListeProduitsEntiteEnListeCatgories() {

		List<Produit> listeProduits = ProduitMapper
				.transformerListeProduitsEntiteEnListeProduits(listeProduitsEntite);
		
		assertTrue(!listeProduits.isEmpty());
		assertTrue(listeProduits.size() == 1);
		
		Produit produit1 = listeProduits.get(0);
		assertEquals("545451218", produit1.getCodeEan());
		assertEquals("Biscuit LU", produit1.getNomProduit());
		assertEquals("très bon", produit1.getDescriptifProduit());
		
	}
	
	@Test
	public void testTransformerListeProduitsEntiteNullEnListeCatgories() {

		List<Produit> listeProduits = ProduitMapper
				.transformerListeProduitsEntiteEnListeProduits(null);
		
		assertTrue(listeProduits.isEmpty());

	}
	
	@Test
	public void testTransformerProduitsEntiteNullEnCatgorie() {

		Produit produit = ProduitMapper
				.transformerProduitEntiteEnProduit(null);
		
		assertNull(produit);

	}

}
