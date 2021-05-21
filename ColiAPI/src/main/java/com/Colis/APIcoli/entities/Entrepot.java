package com.Colis.APIcoli.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="Entrepot_type")
@Data
public class Entrepot {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int idEntrepot;
	
	@OneToMany(mappedBy="entrepot",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<TransportExterne>transportExternes;
	
	private String nom;
	}
