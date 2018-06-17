package com.hula.config;

import javax.sql.DataSource;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "local")
public class TomcatEmbeddedConfig {

	/**
	 * Méthode permettant de paramétrer le serveur tomcat embarqué
	 * @return
	 */
	@Bean
	public TomcatEmbeddedServletContainerFactory tomcatFactory() {
		return new TomcatEmbeddedServletContainerFactory() {

			/**
			 * {@inheritDoc}
			 * @see org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory#getTomcatEmbeddedServletContainer(org.apache.catalina.startup.Tomcat)
			 */
			@Override
			protected TomcatEmbeddedServletContainer getTomcatEmbeddedServletContainer(
					Tomcat tomcat) {
				tomcat.enableNaming();
				return super.getTomcatEmbeddedServletContainer(tomcat);
			}

			/**
			 * {@inheritDoc}
			 * @see org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory#postProcessContext(org.apache.catalina.Context)
			 */
			@Override
			protected void postProcessContext(Context context) {
				ContextResource resource = new ContextResource();
				resource.setName("jdbc/postgresDataVendor");
				resource.setType(DataSource.class.getName());
				resource.setProperty("driverClassName", "org.postgresql.Driver");
				resource.setProperty("url", "jdbc:postgresql://localhost:5432/chahoula");
				resource.setProperty("user", "chahoula");
				resource.setProperty("password", "chahoula");

				context.getNamingResources().addResource(resource);
			}
		};
	}
}
