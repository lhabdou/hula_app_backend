package com.hula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hula.entities.ProduitAdditifsEntite;
import com.hula.entities.pk.ProduitsAdditifsPk;

public interface ProduitAdditifRepository extends JpaRepository<ProduitAdditifsEntite, ProduitsAdditifsPk> {

}
