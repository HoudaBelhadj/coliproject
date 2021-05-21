package com.Colis.APIcoli.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class TypeVehicule {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int idTypeVehicule;
	private String nom;
	
	@OneToMany(mappedBy="typeV")
	private List<Vehicule>vehicules;
	

}
