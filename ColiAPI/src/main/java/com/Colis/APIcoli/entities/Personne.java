package com.Colis.APIcoli.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="personne_type")
@Data
public class Personne {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int idPersonne;
	
	
	
	@OneToMany(mappedBy="personne",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Reclamation>reclamations;
	
	
	
	private String prenomPersonne;
	private String nomPersonne;
	private String telephone;
	private String email;
	private String role;
	private String fax;

}
