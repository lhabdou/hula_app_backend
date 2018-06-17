/**
 * 
 */
package com.hula.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hula.domain.Produit;
import com.hula.entities.ProduitEntite;
import com.hula.mapper.ProduitMapper;
import com.hula.repository.ProduitRepository;
import com.hula.services.IProduitService;

/**
 * @author asoilihi
 *
 */
@Service
public class ProduitService implements IProduitService {

	@Autowired
	private ProduitRepository produitRepository; 
	
	/** (non-Javadoc)
	 * @see com.hula.services.IProduitService#getProduit(java.lang.String)
	 */
	@Override
	public Produit getProduit(String codeEAN) {
		
		ProduitEntite produitEntite = produitRepository.getProduit(codeEAN);
		
		return ProduitMapper.transformerProduitEntiteEnProduit(produitEntite);
	}

	/**
	 * @param produitRepository the produitRepository to set
	 */
	public void setProduitRepository(ProduitRepository produitRepository) {
		this.produitRepository = produitRepository;
	}


}
