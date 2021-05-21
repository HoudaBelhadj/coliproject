package com.Colis.APIcoli.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Entity
@Data
public class ColiSuivi {
	@Id
	private Date date;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idColi")
	private Coli coli;
	
	@Enumerated(EnumType.STRING)
    private ColiStatut statutColi;
	

}
