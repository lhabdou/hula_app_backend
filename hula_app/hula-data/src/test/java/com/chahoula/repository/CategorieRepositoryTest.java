package com.chahoula.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

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
import com.hula.repository.CategorieRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceConfigTest.class })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DatabaseSetup(value = "classpath:categorieData.xml", type = DatabaseOperation.CLEAN_INSERT, connection = "dbUnitDatabaseConnection")
@DatabaseTearDown(value = "classpath:categorieData.xml", type = DatabaseOperation.DELETE_ALL)
public class CategorieRepositoryTest {

	@Autowired
	private CategorieRepository categorieRepository;

	@Test
	public void testGetAllCategories() {
		List<CategorieEntite> listeCategories = categorieRepository.findAll();
		assertNotNull(listeCategories);
		assertTrue(listeCategories.size()==2);

		CategorieEntite categoriesEntite = listeCategories.get(0);
		assertNotNull(categoriesEntite);
		
	}
}