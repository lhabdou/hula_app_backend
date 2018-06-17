package com.hula.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="PRODUITS")
public class ProduitEntite implements Serializable {

	/**
	 * Numero de sérialisation
	 */
	private static final long serialVersionUID = -283615733347143432L;
	
	/**
	 * Le code EAN
	 */
	@Id
	@Column(name="code_ean")
	private String codeEan; 
	
	/**
	 * Le nom du produit
	 */
	@Column(name="nom")
	private String nom;
	
	/**
	 * Le descriptif
	 */
	@Column(name="descriptif")
	private String descriptifProduit;
	
	/**
	 * Le code couleur
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="code_couleur")
	private CodeCouleursEntite codeCouleur;
	
	/**
	 * La catégorie
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_categorie")
	private CategorieEntite categorie;

	/**
	 * Retourne la valeur de l'attribut codeEan
	 *
	 * @return codeEan
	 */
	public String getCodeEan() {
		return codeEan;
	}

	/**
	 * Met à jour la valeur de l'attribut codeEan
	 *
	 * @param codeEan la nouvelle valeur de l'attribut codeEan 
	 */
	public void setCodeEan(String codeEan) {
		this.codeEan = codeEan;
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
	 * Retourne la valeur de l'attribut descriptifProduit
	 *
	 * @return descriptifProduit
	 */
	public String getDescriptifProduit() {
		return descriptifProduit;
	}

	/**
	 * Met à jour la valeur de l'attribut descriptifProduit
	 *
	 * @param descriptifProduit la nouvelle valeur de l'attribut descriptifProduit 
	 */
	public void setDescriptifProduit(String descriptifProduit) {
		this.descriptifProduit = descriptifProduit;
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

	/**
	 * Retourne la valeur de l'attribut categorie
	 *
	 * @return categorie
	 */
	public CategorieEntite getCategorie() {
		return categorie;
	}

	/**
	 * Met à jour la valeur de l'attribut categorie
	 *
	 * @param categorie la nouvelle valeur de l'attribut categorie 
	 */
	public void setCategorie(CategorieEntite categorie) {
		this.categorie = categorie;
	}
	
	

}
