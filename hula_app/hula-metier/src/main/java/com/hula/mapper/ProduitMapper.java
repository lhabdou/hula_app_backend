/**
 * 
 */
package com.hula.mapper;

import java.util.ArrayList;
import java.util.List;

import com.hula.domain.Produit;
import com.hula.entities.CategorieEntite;
import com.hula.entities.CodeCouleursEntite;
import com.hula.entities.ProduitEntite;

/**
 * @author asoilihi
 *
 */
public class ProduitMapper {

	private ProduitMapper() {
		// Nothing to do
	}

	/**
	 * Méthode permettant de tranformer une liste d'objets produitsEntite en liste
	 * d'objets proruit
	 * 
	 * @param listeProduitsEntite
	 * @return List<Produit>
	 */
	public static List<Produit> transformerListeProduitsEntiteEnListeProduits(
			List<ProduitEntite> listeProduitsEntite) {

		List<Produit> listeProduits = new ArrayList<>();

		if (listeProduitsEntite != null) {
			for (ProduitEntite produitEntite : listeProduitsEntite) {

				listeProduits.add(transformerProduitEntiteEnProduit(produitEntite));
			}
		}

		return listeProduits;
	}

	/**
	 * Méthode permettant de tranformer un objet produit Entite en objet produit
	 * 
	 * @param produitEntite
	 * @return Produit
	 */
	public static Produit transformerProduitEntiteEnProduit(ProduitEntite produitEntite) {
		Produit produit = null;

		if (produitEntite != null) {

			produit = new Produit();
			produit.setCodeEan(produitEntite.getCodeEan());
			produit.setNomProduit(produitEntite.getNom());
			produit.setDescriptifProduit(produitEntite.getDescriptifProduit());
			CategorieEntite categorieEntite = produitEntite.getCategorie();
			produit.setCategorie(CategorieMapper.transformerCategorieEntiteEnCategorie(categorieEntite));
			CodeCouleursEntite codeCouleurEntite = produitEntite.getCodeCouleur();
			produit.setCodeCouleur(CodeCouleurMapper.transformerCodeCouleurEntiteEnCodeCouleur(codeCouleurEntite));

		}

		return produit;
	}

}
