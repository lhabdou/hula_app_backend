package com.hula.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.dialect.PostgreSQL95Dialect;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages="com.hula.repository")
@EnableTransactionManagement
@EntityScan
public class PersistenceConfig {
	
	/**
	 * Méthode permettant de configurer le datasource
	 * @return DataSource
	 */
	@Bean
	@Qualifier("dbDataSource")
	public DataSource dataSource() {
	  JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
	  DataSource dataSource = dataSourceLookup.getDataSource("jdbc/postgresDataVendor");
	  return dataSource;
	}

	/**
	 * Méthode permettant de configurer le jpaVendorAdapter
	 * @param environment l'environnement
	 * @return JpaVendorAdapter
	 */
	@Bean
	public JpaVendorAdapter jpaVendorAdapter(final Environment environment) {
		final HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();

		jpaVendorAdapter.setDatabase(Database.POSTGRESQL);
		jpaVendorAdapter.setDatabasePlatform(PostgreSQL95Dialect.class.getName());
		jpaVendorAdapter.setGenerateDdl(false);
		jpaVendorAdapter.setShowSql(true);

		return jpaVendorAdapter;
	}

	/**
	 * Méthode permettant de configurer le transactionManager
	 * @param entityManagerFactory l'entityManagerFactory
	 * @return PlatformTransactionManager
	 */
	@Bean
	public PlatformTransactionManager transactionManager(final EntityManagerFactory entityManagerFactory) {
		final JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
	
	/**
	 * Méthode permettant de configurer l'entityManager
	 * @param entityManagerFactory l'entityManagerFactory
	 * @return EntityManager
	 */
	@Bean
	@Qualifier(value = "entityManager")
	public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
	    return entityManagerFactory.createEntityManager();
	}

	/**
	 * Méthode permettant de configurer l'entityManagerFactory
	 * @param environment l'environnement d'exécution
	 * @param jpaVendorAdapter le jpaVendorAdapter
	 * @return FactoryBean<EntityManagerFactory>
	 */
	@Bean
	public FactoryBean<EntityManagerFactory> entityManagerFactory(final Environment environment, final JpaVendorAdapter jpaVendorAdapter) {
		final Map<String, String> properties = new HashMap<>();
		properties.put("hibernate.generate_statistics", "false");

		final LocalContainerEntityManagerFactoryBean localContainerEMFB = new LocalContainerEntityManagerFactoryBean();
		localContainerEMFB.setPersistenceUnitName("chahoulaPU");
		localContainerEMFB.setPackagesToScan("com.hula.entities");
		localContainerEMFB.setJpaDialect(new HibernateJpaDialect());
		localContainerEMFB.setJpaVendorAdapter(jpaVendorAdapter);
		localContainerEMFB.setDataSource(dataSource());
		localContainerEMFB.setLoadTimeWeaver(new InstrumentationLoadTimeWeaver());
		localContainerEMFB.setJpaPropertyMap(properties);
		return localContainerEMFB;
	}

}
