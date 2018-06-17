package com.chahoula.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.dbunit.ext.h2.H2DataTypeFactory;
import org.hibernate.dialect.H2Dialect;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.github.springtestdbunit.bean.DatabaseConfigBean;
import com.github.springtestdbunit.bean.DatabaseDataSourceConnectionFactoryBean;

@Configuration
@EnableJpaRepositories(basePackages = "com.hula.repository")
@EnableTransactionManagement
@EntityScan
public class PersistenceConfigTest {

	/**
	 * Méthode permettant de configurer le datasource
	 * 
	 * @return DataSource
	 */
	@Bean
	@Qualifier("dbDataSource")
	public DataSource dataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.url("jdbc:h2:mem:sboed_test");
		dataSourceBuilder.username("sa");
		dataSourceBuilder.password("");
		return dataSourceBuilder.build();
	}

	/**
	 * Méthode permettant de configurer le jpaVendorAdapter
	 * 
	 * @param environment
	 *            l'environnement
	 * @return JpaVendorAdapter
	 */
	@Bean
	public JpaVendorAdapter jpaVendorAdapter(final Environment environment) {
		final HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();

		jpaVendorAdapter.setDatabase(Database.HSQL);
		jpaVendorAdapter.setDatabasePlatform(H2Dialect.class.getName());
		jpaVendorAdapter.setGenerateDdl(true);
		jpaVendorAdapter.setShowSql(true);

		return jpaVendorAdapter;
	}

	/**
	 * Méthode permettant de configurer le transactionManager
	 * 
	 * @param entityManagerFactory
	 *            l'entityManagerFactory
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
	 * 
	 * @param entityManagerFactory
	 *            l'entityManagerFactory
	 * @return EntityManager
	 */
	@Bean
	@Qualifier(value = "entityManager")
	public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
		return entityManagerFactory.createEntityManager();
	}

	/**
	 * Méthode permettant de configurer l'entityManagerFactory
	 * 
	 * @param environment
	 *            l'environnement d'exécution
	 * @param jpaVendorAdapter
	 *            le jpaVendorAdapter
	 * @return FactoryBean<EntityManagerFactory>
	 */
	@Bean
	public FactoryBean<EntityManagerFactory> entityManagerFactory(final Environment environment,
			final JpaVendorAdapter jpaVendorAdapter) {
		final Map<String, String> properties = new HashMap<>();
		properties.put("hibernate.generate_statistics", "false");

		final LocalContainerEntityManagerFactoryBean localContainerEMFB = new LocalContainerEntityManagerFactoryBean();
		localContainerEMFB.setPersistenceUnitName("hulaPU");
		localContainerEMFB.setPackagesToScan("com.hula.entities");
		localContainerEMFB.setJpaDialect(new HibernateJpaDialect());
		localContainerEMFB.setJpaVendorAdapter(jpaVendorAdapter);
		localContainerEMFB.setDataSource(dataSource());
		localContainerEMFB.setLoadTimeWeaver(new InstrumentationLoadTimeWeaver());
		localContainerEMFB.setJpaPropertyMap(properties);
		return localContainerEMFB;
	}
	
	@Bean
	@Qualifier(value = "dbUnitDatabaseConfig")
	public DatabaseConfigBean dataBaseConfigBean() {
		DatabaseConfigBean config = new DatabaseConfigBean();
		H2DataTypeFactory dataType = new H2DataTypeFactory();
		config.setDatatypeFactory(dataType);
		config.setCaseSensitiveTableNames(true);
		config.setAllowEmptyFields(true);
		return config;
	}
	
	@Bean
	@Qualifier(value = "dbUnitDatabaseConnection")
	public DatabaseDataSourceConnectionFactoryBean dbUnitDatabaseConnection(final DatabaseConfigBean dbUnitDatabaseConfig, final DataSource dbDataSource) {
		DatabaseDataSourceConnectionFactoryBean f = new DatabaseDataSourceConnectionFactoryBean();
		f.setDatabaseConfig(dbUnitDatabaseConfig);
		f.setDataSource(dbDataSource);
		return f;
	}

}
