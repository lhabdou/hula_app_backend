package com.hula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hula.entities.ProduitEntite;


public interface ProduitRepository extends JpaRepository<ProduitEntite, String> {
	
	/**
	 * Méthode permettant de trouver un produit
	 * @return
	 */
	@Query("select p from ProduitEntite p "
			+ "left join fetch p.codeCouleur cc "
			+ "where p.codeEan = :code")
	ProduitEntite getProduit(@Param("code") String code);

}
