package com.hula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hula.entities.ProduitEntite;
import com.hula.entities.pk.ProduitsIngredientsPk;

public interface ProduitIngredientRepository extends JpaRepository<ProduitEntite, ProduitsIngredientsPk>{

}
