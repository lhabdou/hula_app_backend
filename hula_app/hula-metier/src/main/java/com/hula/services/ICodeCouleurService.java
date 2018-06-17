package com.hula.services;

import java.util.List;

import com.hula.domain.CodeCouleur;

public interface ICodeCouleurService {
	
	/**
	 * Méthode permettant de retourner 
	 * un code couleur 
	 * 
	 * @param code
	 * @return CodeCouleur
	 */
	public CodeCouleur getCodeCouleur(String code);
	
	/**
	 * Méthode permettant de retourner 
	 * les codes couleurs 
	 * 
	 * @return CodeCouleur
	 */
	public List<CodeCouleur> getAllCodesCouleurs();

}
