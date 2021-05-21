package com.Colis.APIcoli.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="adresse")
@Data
public class Adresse {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int idAdresse;
	
	@OneToOne
    @JoinColumn(name = "idEntrepot")
    private Depot depot;
	
	
	private String ville;
	private int voie;
	private String bp;
	private int codePostal;
	

}
