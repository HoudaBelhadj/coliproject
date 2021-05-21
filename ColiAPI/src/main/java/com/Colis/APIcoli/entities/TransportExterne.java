package com.Colis.APIcoli.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class TransportExterne {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private long idTransportExterne;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEntrepot")
	private Entrepot entrepot;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			  name = "Coli_TransportExterne", 
			  joinColumns = @JoinColumn(name = "idColi"), 
			  inverseJoinColumns = @JoinColumn(name = "idTransportExterne"))
	private List<Coli>colis;
	
	private String chauffeur;
	private String vehicule;
	private String societe;
	private String villeDestination;
	private String agenceDestination;
	private String numeroExpedition;
	private Date dateDepart;
	

	

}
