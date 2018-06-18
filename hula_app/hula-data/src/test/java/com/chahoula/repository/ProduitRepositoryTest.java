package com.chahoula.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.chahoula.config.PersistenceConfigTest;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import com.hula.entities.CategorieEntite;
import com.hula.entities.CodeCouleursEntite;
import com.hula.entities.ProduitEntite;
import com.hula.repository.ProduitRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceConfigTest.class })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DatabaseSetup(value = "classpath:produitData.xml", type = DatabaseOperation.CLEAN_INSERT, connection = "dbUnitDatabaseConnection")
@DatabaseTearDown(value = "classpath:produitData.xml", type = DatabaseOperation.DELETE_ALL)
public class ProduitRepositoryTest {

	@Autowired
	private ProduitRepository produitsRepository;

	@Test
	public void testGetProduit() {
		ProduitEntite produitEntite = produitsRepository.getProduit("3088545004001");
		assertNotNull(produitEntite);
		assertEquals("Produit très sucré et très bon" + " ayant des bienfaits naturels",
				produitEntite.getDescriptifProduit()); 

		CategorieEntite categoriesEntite = produitEntite.getCategorie();
		assertNotNull(categoriesEntite);
		assertEquals(1L, categoriesEntite.getIdCategorie(), 0);
		CodeCouleursEntite codeCouleur = produitEntite.getCodeCouleur();
		assertNotNull(codeCouleur);

		assertEquals("3088545004001", produitEntite.getCodeEan());
		assertEquals("A", codeCouleur.getCodeCouleur());
	}
}