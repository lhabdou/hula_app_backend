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

import com.hula.domain.CodeCouleur;
import com.hula.entities.CodeCouleursEntite;
import com.hula.mapper.CodeCouleurMapper;
import com.hula.repository.CodeCouleurRepository;

@PrepareForTest({ CodeCouleurMapper.class })
@RunWith(PowerMockRunner.class)
public class CodeCouleurServiceTest {
	
	@Mock
	private CodeCouleurRepository codeCouleurRepository;	
	
	private CodeCouleurService codeCouleurService;

	private List<CodeCouleur> listeResult;

	private List<CodeCouleursEntite> liste;

	private CodeCouleursEntite codeCouleurEntite1;

	private CodeCouleursEntite codeCouleurEntite2;

	private CodeCouleur codeCouleur1;

	private CodeCouleur codeCouleur2;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	
		codeCouleurService = new CodeCouleurService();
		
		codeCouleurService.setCodeCouleurRepository(codeCouleurRepository);
		
		liste = new ArrayList<>();
		listeResult = new ArrayList<>(); 
		
		liste = new ArrayList<>(); 
		codeCouleurEntite1 = new CodeCouleursEntite(); 
		codeCouleurEntite1.setCodeCouleur("ORA");
		codeCouleurEntite1.setLibelle("orange");
		
		codeCouleurEntite2 = new CodeCouleursEntite(); 
		codeCouleurEntite2.setCodeCouleur("VER");
		codeCouleurEntite2.setLibelle("Vert");
		
		liste.add(codeCouleurEntite1); 
		liste.add(codeCouleurEntite2);
		
		codeCouleur1 = new CodeCouleur();
		codeCouleur1.setCode("ORA");
		codeCouleur1.setLibelle("orange");
		
		codeCouleur2 = new CodeCouleur(); 
		codeCouleur2.setCode("VER");
		codeCouleur2.setLibelle("Vert");
		
		listeResult.add(codeCouleur1);
		listeResult.add(codeCouleur2);
		
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testFindAllCodesCouleurs() {
		
		Mockito.when(codeCouleurRepository.findAll()).thenReturn(liste);
		PowerMockito.mockStatic(CodeCouleurMapper.class);
		PowerMockito.when(CodeCouleurMapper.transformerListeCodeCouleursEntiteEnListeCodeCouleur(Mockito.anyList())).thenReturn(listeResult);
		
		List<CodeCouleur> listeCodesCouleurs = codeCouleurService.getAllCodesCouleurs(); 
		assertNotNull(listeCodesCouleurs);
		assertTrue(listeCodesCouleurs.size() == 2);
		
		CodeCouleur codeCouleurResult = listeCodesCouleurs.get(0);
		
		assertNotNull(codeCouleurResult);
		
		assertEquals(codeCouleur1.getCode(), codeCouleurResult.getCode());
		assertEquals(codeCouleur1.getLibelle(), codeCouleurResult.getLibelle());
		
		CodeCouleur codeCouleurResult2 = listeCodesCouleurs.get(1);
		
		assertNotNull(codeCouleurResult2);
		
		assertEquals(codeCouleur2.getCode(), codeCouleurResult2.getCode());
		assertEquals(codeCouleur2.getLibelle(), codeCouleurResult2.getLibelle());
	}
	
	
	@Test
	public void testGetCodeCouleur() {
		
		Mockito.when(codeCouleurRepository.getOne(Mockito.anyString())).thenReturn(codeCouleurEntite1);
		PowerMockito.mockStatic(CodeCouleurMapper.class);
		PowerMockito.when(CodeCouleurMapper.transformerCodeCouleurEntiteEnCodeCouleur((CodeCouleursEntite)Mockito.anyObject())).thenReturn(codeCouleur1);
		
		
		
		CodeCouleur codeCouleurResult = codeCouleurService.getCodeCouleur("ORA");
		
		assertNotNull(codeCouleurResult);
		
		assertEquals(codeCouleur1.getCode(), codeCouleurResult.getCode());
		assertEquals(codeCouleur1.getLibelle(), codeCouleurResult.getLibelle());
		
	}
	
}
