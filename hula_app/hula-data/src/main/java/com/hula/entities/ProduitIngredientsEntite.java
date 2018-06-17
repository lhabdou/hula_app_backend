package com.hula.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hula.entities.pk.ProduitsIngredientsPk;

@Entity
@Table(name="PRODUITS_INGREDIENTS")
public class ProduitIngredientsEntite implements Serializable {

	/**
	 * Numero de sérialisation
	 */
	private static final long serialVersionUID = -3657440808842010660L;

	/**
	 * clé composée
	 */
	@EmbeddedId
	private ProduitsIngredientsPk produitsIngredientsPk; 
	
	@Column(name="composition_100g")
	private Float composition100g;

	/**
	 * Retourne la valeur de l'attribut produitsIngredientsPk
	 *
	 * @return produitsIngredientsPk
	 */
	public ProduitsIngredientsPk getProduitsIngredientsPk() {
		return produitsIngredientsPk;
	}

	/**
	 * Met à jour la valeur de l'attribut produitsIngredientsPk
	 *
	 * @param produitsIngredientsPk la nouvelle valeur de l'attribut produitsIngredientsPk 
	 */
	public void setProduitsIngredientsPk(ProduitsIngredientsPk produitsIngredientsPk) {
		this.produitsIngredientsPk = produitsIngredientsPk;
	}

	/**
	 * Retourne la valeur de l'attribut composition100g
	 *
	 * @return composition100g
	 */
	public Float getComposition100g() {
		return composition100g;
	}

	/**
	 * Met à jour la valeur de l'attribut composition100g
	 *
	 * @param composition100g la nouvelle valeur de l'attribut composition100g 
	 */
	public void setComposition100g(Float composition100g) {
		this.composition100g = composition100g;
	} 
	
	
}
