package com.hula.services;

import java.util.List;

import com.hula.domain.Categorie;

public interface ICategoriesService {
	
	/**
	 * Méthode permettant de retourner les catégories 
	 * de produits 
	 * 
	 * @return List<Categorie>
	 */
	public List<Categorie> findAllCategories();
	
	
	/**
	 * @param id
	 * @return
	 */
	public Categorie getCategorieWithId(Long id); 

}
