/**
 * 
 */
package com.hula.mapper;

import java.util.ArrayList;
import java.util.List;

import com.hula.domain.CodeCouleur;
import com.hula.entities.CodeCouleursEntite;

/**
 * @author asoilihi
 *
 */
public class CodeCouleurMapper {

	private CodeCouleurMapper() {
		// Nothing to do
	}

	/**
	 * Méthode permettant de tranformer une liste d'objets codeCouleursEntite en
	 * liste d'objets codeCouleur
	 * 
	 * @param listeCodeCouleursEntite
	 * @return List<CodeCouleur>
	 */
	public static List<CodeCouleur> transformerListeCodeCouleursEntiteEnListeCodeCouleur(
			List<CodeCouleursEntite> listeCodeCouleursEntite) {

		List<CodeCouleur> listeCodeCouleurs = new ArrayList<>();
		if (listeCodeCouleursEntite != null) {
			
			for (CodeCouleursEntite codeCouleurEntite : listeCodeCouleursEntite) {

				listeCodeCouleurs.add(transformerCodeCouleurEntiteEnCodeCouleur(codeCouleurEntite));
			}
		}

		return listeCodeCouleurs;
	}

	/**
	 * Méthode permettant de tranformer un objet codeCouleur Entite en objet
	 * codeCouleur
	 * 
	 * @param codeCouleurEntite
	 * @return CodeCouleur
	 */
	public static CodeCouleur transformerCodeCouleurEntiteEnCodeCouleur(CodeCouleursEntite codeCouleurEntite) {
		CodeCouleur codeCouleur = null;

		if (codeCouleurEntite != null) {
			codeCouleur = new CodeCouleur();
			codeCouleur.setCode(codeCouleurEntite.getCodeCouleur());
			codeCouleur.setLibelle(codeCouleurEntite.getLibelle());
			codeCouleur.setDescriptifCouleur(codeCouleurEntite.getDescriptif());
		}

		return codeCouleur;
	}

}
