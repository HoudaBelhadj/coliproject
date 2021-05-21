package com.Colis.APIcoli.entities;

import java.util.Date;

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
public class Reclamation {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int idReclamation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPersonne")
	private Personne personne;
	
	private String reclamation;
	private Date dateReclamation;

}