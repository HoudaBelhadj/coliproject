package com.Colis.APIcoli.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
@Entity
@Data
public class MouvementEntrepot {
	@Id
	private Date date;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			  name = "Coli_MouvementEntrepot", 
			  joinColumns = @JoinColumn(name = "idColi"), 
			  inverseJoinColumns = @JoinColumn(name = "date"))
	private List<Coli>colis;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdEntrepot")
	private Entrepot entrepot;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdVoyage")
	private Voyage voyage;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPersonne")
	private AgentEntrepot agentEntrepot;	
	

}
