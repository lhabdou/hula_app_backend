package com.hula.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="PRATIQUES_ALIMENTAIRES")
public class PratiqueAlimentairesEntite implements Serializable {

	/**
	 * numero de sérialisation
	 */
	private static final long serialVersionUID = 3476331322386544220L;

	/**
	 * L'identifiant
	 */
	@Id 
	@Column(name="id_pratique")
	private Long idPratique;
	
	/**
	 * le nom de la pratique
	 */
	@Column(name="nom")
	private String nom; 
	
	/**
	 * le descriptif
	 */
	@Column(name="descriptif")
	private String descriptif;

	/**
	 * Retourne la valeur de l'attribut idPratique
	 *
	 * @return idPratique
	 */
	public Long getIdPratique() {
		return idPratique;
	}

	/**
	 * Met à jour la valeur de l'attribut idPratique
	 *
	 * @param idPratique la nouvelle valeur de l'attribut idPratique 
	 */
	public void setIdPratique(Long idPratique) {
		this.idPratique = idPratique;
	}

	/**
	 * Retourne la valeur de l'attribut nom
	 *
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Met à jour la valeur de l'attribut nom
	 *
	 * @param nom la nouvelle valeur de l'attribut nom 
	 */
	public void setNom(String nom) {
		this.nom = nom;
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
