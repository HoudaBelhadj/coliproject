package com.Colis.APIcoli.entities;



import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@DiscriminatorValue("Magasinier")
@EqualsAndHashCode(callSuper=true)
@Data

public class Magasinier extends AgentEntrepot{

}
