package com.Colis.APIcoli.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@DiscriminatorValue("Vehicule")
@EqualsAndHashCode(callSuper=true)
@Data
public class Vehicule extends Entrepot {
	
	private String matricule;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			  name = "Vehicule_voyage", 
			  joinColumns = @JoinColumn(name = "matricule"), 
			  inverseJoinColumns = @JoinColumn(name = "idVoyage"))
	private List<Voyage>voyages;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTypeVehicule")
	private TypeVehicule typeV;

}
