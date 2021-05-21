package com.Colis.APIcoli.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="chauffeur")
@DiscriminatorValue("Chauffeur")
@Data
public class Chauffeur extends AgentEntrepot {
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			  name = "Chauffeur_voyage", 
			  joinColumns = @JoinColumn(name = "idAgentEntrepot"), 
			  inverseJoinColumns = @JoinColumn(name = "idVoyage"))
	private List<Voyage>voyages;
	
	

}
