package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class FirstAppApplication implements CommandLineRunner {
	@Autowired
	private EtudiantRepository etudiantRepository ;
	
	@Autowired
	private FormationRepository formationRepository ;

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration ;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Formation f1 = formationRepository.save(new Formation(null,"Java",40,null));
		Formation f2 = formationRepository.save(new Formation(null,"PHP",30,null));
		Formation f3 = formationRepository.save(new Formation(null,"JS",30,null));

		etudiantRepository.save(new Etudiant(null,"anass","habi",new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"hicham","faris",new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"mouad","mansour",new Date(),f2));
		etudiantRepository.save(new Etudiant(null,"issam","zahir",new Date(),f3));

	}

}
