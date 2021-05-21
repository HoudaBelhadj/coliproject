package com.Colis.APIcoli.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue("Agent")
@EqualsAndHashCode(callSuper=true)
@Data
public class Agent extends Personne {
	@OneToMany(mappedBy="agent",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DeclarationExp>declarationExps;

}
