/**
 * 
 */
package com.hula.domain;

import java.io.Serializable;

/**
 * Objet métier représentant le code couleur
 *  
 * @author asoilihi
 *
 */
public class CodeCouleur implements Serializable {

	/**
	 * numero de série
	 */
	private static final long serialVersionUID = -7540120085022607283L;

	/**
	 * le code couleur
	 */
	private String code;

	/**
	 * le libelle de la couleur
	 */
	private String libelle;

	/**
	 * la description de la couleur
	 */
	private String descriptifCouleur;

	/**
	 * Met à jour la valeur du champ code 
	 * avec code
	 * 
	 * @param code 
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Met à jour la valeur du champ libelle 
	 * avec libelle
	 * 
	 * @param libelle 
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Met à jour la valeur du champ descriptif 
	 * avec descriptif
	 * 
	 * @param descriptif 
	 */
	public String getDescriptifCouleur() {
		return descriptifCouleur;
	}

	/**
	 * @param descriptif the descriptif to set
	 */
	public void setDescriptifCouleur(String descriptif) {
		this.descriptifCouleur = descriptif;
	}

	
	
}
