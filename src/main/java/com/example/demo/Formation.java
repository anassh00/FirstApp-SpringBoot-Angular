package com.example.demo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Formation {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private String nomFormation ;
	private int dureeFormation ;
	@OneToMany(mappedBy = "formation")
	private Collection<Etudiant> etudiants;
}
