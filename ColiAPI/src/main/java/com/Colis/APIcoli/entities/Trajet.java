package com.Colis.APIcoli.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Trajet {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int idTrajet;
	@OneToMany(mappedBy="trajet",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Voyage>voyages;
	private String description;

}
