package com.hula.entities.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProduitsIngredientsPk implements Serializable {

	/**
	 * Numero de sérialisation
	 */
	private static final long serialVersionUID = -3657440808842010660L;

	@Column(name = "code_ean")
	private String codeEAN;
	
	@Column(name = "id_ingredient")
	private String idIngredient;

	/**
	 * Retourne la valeur de l'attribut codeEAN
	 *
	 * @return codeEAN
	 */
	public String getCodeEAN() {
		return codeEAN;
	}

	/**
	 * Met à jour la valeur de l'attribut codeEAN
	 *
	 * @param codeEAN la nouvelle valeur de l'attribut codeEAN 
	 */
	public void setCodeEAN(String codeEAN) {
		this.codeEAN = codeEAN;
	}

	/**
	 * Retourne la valeur de l'attribut idIngredient
	 *
	 * @return idIngredient
	 */
	public String getIdIngredient() {
		return idIngredient;
	}

	/**
	 * Met à jour la valeur de l'attribut idIngredient
	 *
	 * @param idIngredient la nouvelle valeur de l'attribut idIngredient 
	 */
	public void setIdIngredient(String idIngredient) {
		this.idIngredient = idIngredient;
	}
	
	
}
