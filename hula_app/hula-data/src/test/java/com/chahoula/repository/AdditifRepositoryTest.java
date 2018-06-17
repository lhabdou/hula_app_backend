package com.chahoula.repository;

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
import com.hula.entities.AdditifEntite;
import com.hula.repository.AdditifRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceConfigTest.class })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DatabaseSetup(value = "classpath:additifData.xml", type = DatabaseOperation.CLEAN_INSERT, connection = "dbUnitDatabaseConnection")
@DatabaseTearDown(value = "classpath:additifData.xml", type = DatabaseOperation.DELETE_ALL)
public class AdditifRepositoryTest {

	@Autowired
	private AdditifRepository additifsRepository;

	@Test
	public void testGetProduit() {
		AdditifEntite additifEntite = additifsRepository.getAdditif("E500");
		assertNotNull(additifEntite);

	}
}