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
public class ColiType {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int idTypeColi;
	
	@OneToMany(mappedBy="colitype",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Coli>colis;
	
	private String typeColi;

}
