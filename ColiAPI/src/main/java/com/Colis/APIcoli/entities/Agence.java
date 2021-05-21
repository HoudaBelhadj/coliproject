package com.Colis.APIcoli.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue("Agence")
@EqualsAndHashCode(callSuper=true)
@Data
public class Agence extends Depot {
	
}
