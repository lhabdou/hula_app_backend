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
import com.hula.entities.CodeCouleursEntite;
import com.hula.repository.CodeCouleurRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceConfigTest.class })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DatabaseSetup(value = "classpath:codesCouleursData.xml", type = DatabaseOperation.CLEAN_INSERT, connection = "dbUnitDatabaseConnection")
@DatabaseTearDown(value = "classpath:codesCouleursData.xml", type = DatabaseOperation.DELETE_ALL)
public class CodeCouleurRepositoryTest {

	@Autowired
	private CodeCouleurRepository codesCouleursRepository;

	@Test
	public void testGetProduit() {
		List<CodeCouleursEntite> listeCodeCouleurs = codesCouleursRepository.findAll();
		assertNotNull(listeCodeCouleurs);
		assertTrue(listeCodeCouleurs.size()==5);
	}
}