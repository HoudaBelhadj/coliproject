package com.Colis.APIcoli.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue("Depot")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="depot_emplacement")
@EqualsAndHashCode(callSuper=true)
@Data
public class Depot extends Entrepot{
	@OneToOne(mappedBy="depot")
    private Adresse adresse;
	
	
	
	
}
