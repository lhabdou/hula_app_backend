package com.hula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hula.entities.AdditifPratiquesEntite;
import com.hula.entities.pk.AdditifsPratiquesPk;

public interface AdditifPratiqueRepository extends JpaRepository<AdditifPratiquesEntite, AdditifsPratiquesPk> {

}
