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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Voyage {
    
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int idVoyage;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTrajet")
	private Trajet trajet;
	
	@ManyToMany(mappedBy="voyages",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Vehicule>vehicules;
	
	@ManyToMany(mappedBy="voyages",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Chauffeur>chauffeurs;
	
	@OneToMany(mappedBy="voyage",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ArriveeVoyage>arrivees;
	
	@OneToMany(mappedBy="voyage",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DepartVoyage>departs;
	
	@OneToMany(mappedBy="voyage",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<MouvementEntrepot>mouvementEntrepots;
	
	@OneToOne(mappedBy="voyage",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Manifest manifest;
	
	private Date dateDepart;
	private Date dateArrivee;
	
	
}
