/**
 * 
 */
package com.hula.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hula.domain.Categorie;
import com.hula.entities.CategorieEntite;
import com.hula.mapper.CategorieMapper;
import com.hula.repository.CategorieRepository;
import com.hula.services.ICategoriesService;

/**
 * @author asoilihi
 *
 */
@Service
public class CategorieService implements ICategoriesService {
	
	@Autowired
	private CategorieRepository categorieRepository;
	

	@Override
	public List<Categorie> findAllCategories() {
		List<CategorieEntite> listeCategorie = categorieRepository.findAll();
		
		return CategorieMapper.transformerListeCategoriesEntiteEnListeCatgories(listeCategorie);
	}


	@Override
	public Categorie getCategorieWithId(Long id) {
		
		CategorieEntite categorieEntite = categorieRepository.getCategorieWithId(id); 
		
		return CategorieMapper.transformerCategorieEntiteEnCategorie(categorieEntite);
	}


	/**
	 * @param categorieRepository the categorieRepository to set
	 */
	public void setCategorieRepository(CategorieRepository categorieRepository) {
		this.categorieRepository = categorieRepository;
	}


}
