package com.Colis.APIcoli.entities;

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
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="coli")
@Data
public class Coli {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int idColi;
	
	@OneToMany(mappedBy="coli")
	private List<ColiSuivi>colisuivis;
	
	@ManyToMany(mappedBy="colis",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<TransportExterne>transportExternes;
	
	@ManyToMany(mappedBy="colis",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<MouvementEntrepot>mouvementEntrepots;
	
	@ManyToMany(mappedBy="colis",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Manifest>manifests;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDeclarationExp")
	private DeclarationExp declarationExp;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTypeColi")
	private ColiType colitype;
	
	
	
	private double poids;
	private double prix;
	private double valeurDeclaree;
	
	
	

}
