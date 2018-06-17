/**
 * 
 */
package com.hula.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Objet métier représentant une catégorie
 * 
 * @author asoilihi
 *
 */
public class Categorie implements Serializable {

	/**
	 * numero de série 
	 */
	private static final long serialVersionUID = -2005167995808769416L;

	
	/**
	 * l'id de la catégorie 
	 */
	private Long idCategorie; 
	
	/**
	 * le nom de la catégorie
	 */
	private String nomCategorie; 
	
	/**
	 * le descriptif
	 */
	private String descriptif;
	
	/**
	 * Les produits de la categorie
	 */
	private List<Produit> produits; 
	

	/**
	 * Met à jour la valeur du champ idCategorie 
	 * avec idCategorie
	 * 
	 * @param idCategorie 
	 */
	public Long getIdCategorie() {
		return idCategorie;
	}

	/**
	 * @param idCategorie the idCategorie to set
	 */
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	/**
	 * Met à jour la valeur du champ nomCategorie 
	 * avec nomCategorie
	 * 
	 * @param nomCategorie 
	 */
	public String getNomCategorie() {
		return nomCategorie;
	}

	/**
	 * @param nomCategorie the nomCategorie to set
	 */
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	/**
	 * Met à jour la valeur du champ descriptif 
	 * avec descriptif
	 * 
	 * @param descriptif 
	 */
	public String getDescriptif() {
		return descriptif;
	}

	/**
	 * @param descriptif the descriptif to set
	 */
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	/**
	 * Met à jour la valeur du champ produits 
	 * avec produits
	 * 
	 * @param produits 
	 */
	public List<Produit> getProduits() {
		return produits;
	}

	/**
	 * @param produits the produits to set
	 */
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	} 

	
}
