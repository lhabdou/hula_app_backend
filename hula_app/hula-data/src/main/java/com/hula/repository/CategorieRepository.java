package com.hula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hula.entities.CategorieEntite;

public interface CategorieRepository extends JpaRepository<CategorieEntite, Long> {
	
	@Query("select c from CategorieEntite c "
			+ "left join fetch c.produits "
			+ "where c.idCategorie = :id")
	CategorieEntite getCategorieWithId(@Param("id") Long id);

}
