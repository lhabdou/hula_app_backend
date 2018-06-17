package com.hula.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hula.entities.pk.AdditifsPratiquesPk;


/**
 * Entités reliant les additifs 
 * et les pratiques alimentaires
 * 
 * @author asoilihi
 *
 */
@Entity
@Table(name="ADDITIFS_PRATIQUES")
public class AdditifPratiquesEntite implements Serializable {

	/**
	 * Numero de sérialisation
	 */
	private static final long serialVersionUID = 4709709855021088449L;
	
	/**
	 * clé composée
	 */
	@EmbeddedId
	private AdditifsPratiquesPk additifsPratiquesPk;
	
	/**
	 * le code couleur
	 */
	@Column
	private CodeCouleursEntite codeCouleur;

	/**
	 * Retourne la valeur de l'attribut additifsPratiquesPk
	 *
	 * @return additifsPratiquesPk
	 */
	public AdditifsPratiquesPk getAdditifsPratiquesPk() {
		return additifsPratiquesPk;
	}

	/**
	 * Met à jour la valeur de l'attribut additifsPratiquesPk
	 *
	 * @param additifsPratiquesPk la nouvelle valeur de l'attribut additifsPratiquesPk 
	 */
	public void setAdditifsPratiquesPk(AdditifsPratiquesPk additifsPratiquesPk) {
		this.additifsPratiquesPk = additifsPratiquesPk;
	}

	/**
	 * Retourne la valeur de l'attribut codeCouleur
	 *
	 * @return codeCouleur
	 */
	public CodeCouleursEntite getCodeCouleur() {
		return codeCouleur;
	}

	/**
	 * Met à jour la valeur de l'attribut codeCouleur
	 *
	 * @param codeCouleur la nouvelle valeur de l'attribut codeCouleur 
	 */
	public void setCodeCouleur(CodeCouleursEntite codeCouleur) {
		this.codeCouleur = codeCouleur;
	} 

	
}
