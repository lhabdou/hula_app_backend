package com.hula.services;

import com.hula.domain.Produit;

public interface IProduitService {
	
	/**
	 * Méthode permettant de retourner 
	 * un produit 
	 * 
	 * @param codeEan
	 * @return Produit
	 */
	public Produit getProduit(String codeEan);

}
