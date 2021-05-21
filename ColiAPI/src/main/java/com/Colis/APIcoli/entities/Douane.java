package com.Colis.APIcoli.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue("Douane")
@EqualsAndHashCode(callSuper=true)
@Data
public class Douane extends Depot {

}
