/**
 * 
 */
package com.hula.mapper;

import java.util.ArrayList;
import java.util.List;

import com.hula.domain.Categorie;
import com.hula.entities.CategorieEntite;

/**
 * @author asoilihi
 *
 */
public class CategorieMapper {

	private CategorieMapper() {
		// Nothing to do
	}

	/**
	 * Méthode permettant de tranformer une liste d'objets categoriesEntite en liste
	 * d'objets catégories
	 * 
	 * @param listeCategoriesEntite
	 * @return List<Categorie>
	 */
	public static List<Categorie> transformerListeCategoriesEntiteEnListeCatgories(
			List<CategorieEntite> listeCategoriesEntite) {

		List<Categorie> listeCategories = new ArrayList<>();
		if (listeCategoriesEntite != null) {

			for (CategorieEntite categorieEntite : listeCategoriesEntite) {

				listeCategories.add(transformerCategorieEntiteEnCategorie(categorieEntite));
			}
		}

		return listeCategories;

	}

	/**
	 * Méthode permettant de tranformer un objet categorie Entite en objet catégorie
	 * 
	 * @param categorieEntite
	 * @return Categorie
	 */
	public static Categorie transformerCategorieEntiteEnCategorie(CategorieEntite categorieEntite) {
		Categorie categorie = null;

		if (categorieEntite != null) {

			categorie = new Categorie();
			categorie.setIdCategorie(categorieEntite.getIdCategorie());
			categorie.setNomCategorie(categorieEntite.getNom());
			categorie.setDescriptif(categorieEntite.getDescriptifCategorie());

			if (categorieEntite.getProduits() != null && categorieEntite.getProduits().isEmpty()) {

				categorie.setProduits(
						ProduitMapper.transformerListeProduitsEntiteEnListeProduits(categorieEntite.getProduits()));
			}
		}

		return categorie;
	}

}
