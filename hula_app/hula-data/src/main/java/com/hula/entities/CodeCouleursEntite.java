package com.hula.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entité représentant les codes couleurs
 * 
 * @author asoilihi
 *
 */
@Entity
@Table(name="CODES_COULEURS")
public class CodeCouleursEntite implements Serializable {

	/**
	 * Numero de sérialisation
	 */
	private static final long serialVersionUID = 5859224997188378837L;
	
		
	/**
	 * le code couleur
	 */
	@Id
	@Column(name="code_couleur")
	private String codeCouleur; 
	
	/**
	 * le libelle
	 */
	@Column(name="libelle")
	private String libelle;
	
	/**
	 * le descriptif
	 */
	@Column(name="descriptif")
	private String descriptif;

	/**
	 * Retourne la valeur de l'attribut codeCouleur
	 *
	 * @return codeCouleur
	 */
	public String getCodeCouleur() {
		return codeCouleur;
	}

	/**
	 * Met à jour la valeur de l'attribut codeCouleur
	 *
	 * @param codeCouleur la nouvelle valeur de l'attribut codeCouleur 
	 */
	public void setCodeCouleur(String codeCouleur) {
		this.codeCouleur = codeCouleur;
	}

	/**
	 * Retourne la valeur de l'attribut libelle
	 *
	 * @return libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Met à jour la valeur de l'attribut libelle
	 *
	 * @param libelle la nouvelle valeur de l'attribut libelle 
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Retourne la valeur de l'attribut descriptif
	 *
	 * @return descriptif
	 */
	public String getDescriptif() {
		return descriptif;
	}

	/**
	 * Met à jour la valeur de l'attribut descriptif
	 *
	 * @param descriptif la nouvelle valeur de l'attribut descriptif 
	 */
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	} 
	

}
