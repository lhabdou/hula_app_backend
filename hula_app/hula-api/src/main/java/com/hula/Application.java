package com.hula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.annotation.AnnotationMBeanExporter;


/**
 * Classe principale de l'API Chahoula
 * @author ASO15476
 *
 */
@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@ComponentScan(basePackages="com.hula")
public class Application extends SpringBootServletInitializer {

	/**
	 * Méthode permettant de lancer l'application
	 * @param args
	 */
	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.springframework.boot.web.support.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
    }
	
	/**
	 * Permet de gérer la double inclusion du datasource
	 * Uniquement pour le tomcat embarqué
	 * @return AnnotationMBeanExporter
	 */
	@Bean
	public AnnotationMBeanExporter annotationMBeanExporter() {
	    AnnotationMBeanExporter annotationMBeanExporter = new AnnotationMBeanExporter();
	    annotationMBeanExporter.addExcludedBean("dataSource");
	    return annotationMBeanExporter;
	}
	
//	/**
//	 * Permet de gérer le cors Origing
//	 * @return WebMvcConfigurer
//	 */
//	@Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurerAdapter() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**").allowedOrigins("http://localhost:3000");
//            }
//        };
//	}
	
	
}