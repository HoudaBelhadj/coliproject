package com.Colis.APIcoli.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class DeclarationExp {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int idDeclarationExp;
	
	@OneToMany(mappedBy="declarationExp")
	private List<Coli>colis;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Agent")
	private Agent agent;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Destinataire")
	private Destinataire destinataire;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Expediteur")
	private Expediteur expediteur;
	
	private Date dateDeclaration;
	private int prixTotal;
	private Date datePaiement;
	
	@Enumerated(EnumType.STRING)
    private TypeLivraison typeLivraison;
	
	
	
	
	
	

}
