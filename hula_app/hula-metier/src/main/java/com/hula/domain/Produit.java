package com.hula.domain;

import java.io.Serializable;

/**
 * Objet métier représentant un produit
 * 
 * @author asoilihi
 *
 */
public class Produit implements Serializable {

	/**
	 * numero de sérialisation
	 */
	private static final long serialVersionUID = -3932177749112211203L;

	
	/**
	 * le code EAN
	 */
	private String codeEan; 
	
	/**
	 * le nom du produit
	 */
	private String nomProduit; 
	
	/**
	 * le descriptif du produit
	 */
	private String descriptif; 
	
	/**
	 * le code couleur
	 */
	private CodeCouleur codeCouleur; 
	
	/**
	 * la catégorie du produit
	 */
	private Categorie categorie;

	/**
	 * Met à jour la valeur du champ codeEan 
	 * avec codeEan
	 * 
	 * @param codeEan 
	 */
	public String getCodeEan() {
		return codeEan;
	}

	/**
	 * @param codeEan the codeEan to set
	 */
	public void setCodeEan(String codeEan) {
		this.codeEan = codeEan;
	}

	/**
	 * Met à jour la valeur du champ nomProduit 
	 * avec nomProduit
	 * 
	 * @param nomProduit 
	 */
	public String getNomProduit() {
		return nomProduit;
	}

	/**
	 * @param nomProduit the nomProduit to set
	 */
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	/**
	 * Met à jour la valeur du champ descriptifProduit 
	 * avec descriptifProduit
	 * 
	 * @param descriptif 
	 */
	public String getDescriptif() {
		return descriptif;
	}

	/**
	 * @param descriptifProduit the descriptifProduit to set
	 */
	public void setDescriptif(String descriptifProduit) {
		this.descriptif = descriptifProduit;
	}

	/**
	 * Met à jour la valeur du champ codeCouleur 
	 * avec codeCouleur
	 * 
	 * @param codeCouleur 
	 */
	public CodeCouleur getCodeCouleur() {
		return codeCouleur;
	}

	/**
	 * @param codeCouleur the codeCouleur to set
	 */
	public void setCodeCouleur(CodeCouleur codeCouleur) {
		this.codeCouleur = codeCouleur;
	}

	/**
	 * Met à jour la valeur du champ categorie 
	 * avec categorie
	 * 
	 * @param categorie 
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	} 
	
	
}
