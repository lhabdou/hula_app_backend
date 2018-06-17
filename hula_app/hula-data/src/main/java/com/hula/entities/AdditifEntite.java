package com.hula.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entité representant la table Additifs
 * 
 * @author asoilihi
 *
 */
@Entity
@Table(name ="ADDITIFS")
public class AdditifEntite implements Serializable {

	/**
	 * Numero de sérialisation
	 */
	private static final long serialVersionUID = 6062937150685625393L;
	
	/**
	 * le code
	 */
	@Id
	@Column(name="CODE_ADDITIF")
	private String codeAdditif; 
	
	/**
	 * le nom de l'additif
	 */
	@Column(name="NOM_ADDITIF")
	private String nomAdditif; 
	
	/**
	 * le descriptif
	 */
	@Column(name="DESCRIPTIF")
	private String descriptif;

	/**
	 * Retourne la valeur de l'attribut codeAdditif
	 *
	 * @return codeAdditif
	 */
	public String getCodeAdditif() {
		return codeAdditif;
	}

	/**
	 * Met à jour la valeur de l'attribut codeAdditif
	 *
	 * @param codeAdditif la nouvelle valeur de l'attribut codeAdditif 
	 */
	public void setCodeAdditif(String codeAdditif) {
		this.codeAdditif = codeAdditif;
	}

	/**
	 * Retourne la valeur de l'attribut nomAdditif
	 *
	 * @return nomAdditif
	 */
	public String getNomAdditif() {
		return nomAdditif;
	}

	/**
	 * Met à jour la valeur de l'attribut nomAdditif
	 *
	 * @param nomAdditif la nouvelle valeur de l'attribut nomAdditif 
	 */
	public void setNomAdditif(String nomAdditif) {
		this.nomAdditif = nomAdditif;
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
