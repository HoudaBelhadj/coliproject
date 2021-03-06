package com.Colis.APIcoli.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="arrivee")
@Data
public class ArriveeVoyage {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int idArrivee;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idVoyage")
	private Voyage voyage;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAgence")
	private Agence agence;
	
	

}
