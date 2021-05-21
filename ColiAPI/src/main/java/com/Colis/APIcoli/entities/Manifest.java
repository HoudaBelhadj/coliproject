package com.Colis.APIcoli.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Manifest {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int idManifest;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			  name = "Coli_Manifest", 
			  joinColumns = @JoinColumn(name = "idColi"), 
			  inverseJoinColumns = @JoinColumn(name = "idManifest"))
	private List<Coli>colis;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idVoyage")
	private Voyage voyage;
	
	
	
	

}
