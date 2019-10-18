package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
@Configuration
public class GlobalRepositoryRestConfiguration extends RepositoryRestConfigurerAdapter {
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration) {
		repositoryRestConfiguration.setReturnBodyOnCreate(true);
		repositoryRestConfiguration.setReturnBodyOnUpdate(true);
		repositoryRestConfiguration.exposeIdsFor(Formation.class,Etudiant.class);
		repositoryRestConfiguration.getCorsRegistry()
		.addMapping("/**")
		.allowedOrigins("*")
		.allowedHeaders("*")
		.allowedMethods("OPTIONS","POST","GET","PUT","HEAD","DELETE","PATCH");
	}

}
