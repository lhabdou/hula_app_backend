/**
 * 
 */
package com.hula.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hula.documents.Produits;
import com.hula.domain.Categorie;
import com.hula.entities.CategorieEntite;
import com.hula.mapper.CategorieMapper;
import com.hula.repository.CategorieRepository;
import com.hula.repository.ProduitsRepository;
import com.hula.services.ICategoriesService;

/**
 * @author asoilihi
 *
 */
@Service
@Transactional
public class CategorieService implements ICategoriesService {
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Autowired
	private ProduitsRepository produitsRepository;
	

	@Override
	public List<Categorie> findAllCategories() {
//		List<CategorieEntite> listeCategorie = categorieRepository.getAllCategories();
//		
//		return CategorieMapper.transformerListeCategoriesEntiteEnListeCatgories(listeCategorie);
		
		List<Produits> produits = produitsRepository.findAll( ); 
		
		return CategorieMapper.transformerListeProduitsEnListeCatgories(produits); 
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
