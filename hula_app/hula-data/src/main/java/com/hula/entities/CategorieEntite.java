package com.hula.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entite représentant les catégories
 * 
 * @author asoilihi
 *
 */
@Entity
@Table(name="CATEGORIES")
public class CategorieEntite implements Serializable {

	/**
	 * Numero de sérialisation
	 */
	private static final long serialVersionUID = 4868549751146112368L;

	/**
	 * l'id de la catégorie
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_categorie")
	private Long idCategorie; 
	
	
	/**
	 * le nom 
	 */
	@Column(name = "nom")
	private String nom; 
	
	/**
	 *  le descriptif
	 */
	@Column(name = "descriptif")
	private String descriptifCategorie;
	
	@OneToMany(mappedBy="categorie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ProduitEntite> produits; 
	

	/**
	 * Retourne la valeur de l'attribut idCategorie
	 *
	 * @return idCategorie
	 */
	public Long getIdCategorie() {
		return idCategorie;
	}

	/**
	 * Met à jour la valeur de l'attribut idCategorie
	 *
	 * @param idCategorie la nouvelle valeur de l'attribut idCategorie 
	 */
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
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
	 * Retourne la valeur de l'attribut descriptifCategorie
	 *
	 * @return descriptifCategorie
	 */
	public String getDescriptifCategorie() {
		return descriptifCategorie;
	}

	/**
	 * Met à jour la valeur de l'attribut descriptifCategorie
	 *
	 * @param descriptifCategorie la nouvelle valeur de l'attribut descriptifCategorie 
	 */
	public void setDescriptifCategorie(String descriptifCategorie) {
		this.descriptifCategorie = descriptifCategorie;
	}

	/**
	 * Retourne la valeur de l'attribut produits
	 *
	 * @return produits
	 */
	public List<ProduitEntite> getProduits() {
		return produits;
	}

	/**
	 * Met à jour la valeur de l'attribut produits
	 *
	 * @param produits la nouvelle valeur de l'attribut produits 
	 */
	public void setProduits(List<ProduitEntite> produits) {
		this.produits = produits;
	}

	
}
