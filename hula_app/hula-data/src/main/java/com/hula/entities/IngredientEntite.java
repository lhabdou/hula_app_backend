package com.hula.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entité représentant Les ingrédients
 * 
 * @author asoilihi
 *
 */
@Entity
@Table(name="INGREDIENTS")
public class IngredientEntite implements Serializable {

	/**
	 * Numero de sérialisation
	 */
	private static final long serialVersionUID = 6023827256788437639L;
	
	/**
	 * l'identifiant
	 */
	@Id
	@Column(name="id_ingredient")
	private Long idIngredient; 
	
	
	/**
	 * Le nom de l'ingrédient
	 */
	@Column(name="nom")
	private String nom; 
	
	/**
	 * Le descriptif
	 */
	@Column(name="descritptif")
	private String descriptifIngredient;

	/**
	 * Retourne la valeur de l'attribut idIngredient
	 *
	 * @return idIngredient
	 */
	public Long getIdIngredient() {
		return idIngredient;
	}

	/**
	 * Met à jour la valeur de l'attribut idIngredient
	 *
	 * @param idIngredient la nouvelle valeur de l'attribut idIngredient 
	 */
	public void setIdIngredient(Long idIngredient) {
		this.idIngredient = idIngredient;
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
	 * Retourne la valeur de l'attribut descriptifIngredient
	 *
	 * @return descriptifIngredient
	 */
	public String getDescriptifIngredient() {
		return descriptifIngredient;
	}

	/**
	 * Met à jour la valeur de l'attribut descriptifIngredient
	 *
	 * @param descriptifIngredient la nouvelle valeur de l'attribut descriptifIngredient 
	 */
	public void setDescriptifIngredient(String descriptifIngredient) {
		this.descriptifIngredient = descriptifIngredient;
	} 
	

}
