package com.Colis.APIcoli.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue("AEntrepot")
@EqualsAndHashCode(callSuper=true)
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="agentEntrepot_type")
@Data
public class AgentEntrepot extends Personne {
	@OneToMany(mappedBy="agentEntrepot",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<MouvementEntrepot>mouvementEntrepots;
	


}
