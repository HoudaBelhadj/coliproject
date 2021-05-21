package com.Colis.APIcoli.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class DepartVoyage {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int idDepart;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idVoyage")
	private Voyage voyage;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAgence")
	private Agence agence;

}
