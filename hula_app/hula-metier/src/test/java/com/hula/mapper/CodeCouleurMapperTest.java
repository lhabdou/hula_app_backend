package com.hula.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hula.domain.CodeCouleur;
import com.hula.entities.CodeCouleursEntite;

public class CodeCouleurMapperTest {

	private List<CodeCouleursEntite> listeCodesCouleursEntite;
	private CodeCouleursEntite codeCouleurEntite1;

	@Before
	public void setUp() {
		
		listeCodesCouleursEntite = new ArrayList<>(); 
		codeCouleurEntite1 = new CodeCouleursEntite(); 
		codeCouleurEntite1.setCodeCouleur("VER");
		codeCouleurEntite1.setLibelle("Vert");
		codeCouleurEntite1.setDescriptif("couleur vert");
		
		listeCodesCouleursEntite.add(codeCouleurEntite1); 
		

	}

	@Test
	public void testTransformerListeCodesCouleursEntiteEnListeCatgories() {

		List<CodeCouleur> listeCodesCouleurs = CodeCouleurMapper
				.transformerListeCodeCouleursEntiteEnListeCodeCouleur(listeCodesCouleursEntite);
		
		assertTrue(!listeCodesCouleurs.isEmpty());
		assertTrue(listeCodesCouleurs.size() == 1);
		
		CodeCouleur codeCouleur1 = listeCodesCouleurs.get(0);
		assertEquals("VER", codeCouleur1.getCode());
		assertEquals("Vert", codeCouleur1.getLibelle());
		assertEquals("couleur vert", codeCouleur1.getDescriptifCouleur());
		
	}
	
	@Test
	public void testTransformerListeCodesCouleursEntiteNullEnListeCatgories() {

		List<CodeCouleur> listeCodesCouleurs = CodeCouleurMapper
				.transformerListeCodeCouleursEntiteEnListeCodeCouleur(null);
		
		assertTrue(listeCodesCouleurs.isEmpty());

	}
	
	@Test
	public void testTransformerCodesCouleursEntiteNullEnCatgorie() {

		CodeCouleur codeCouleur = CodeCouleurMapper
				.transformerCodeCouleurEntiteEnCodeCouleur(null);
		
		assertNull(codeCouleur);

	}

}
