package com.Colis.APIcoli.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Colis.APIcoli.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
