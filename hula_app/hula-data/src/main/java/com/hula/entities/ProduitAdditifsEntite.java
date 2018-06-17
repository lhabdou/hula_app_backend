package com.hula.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hula.entities.pk.ProduitsAdditifsPk;

@Entity
@Table(name="PRODUITS_ADDITIS")
public class ProduitAdditifsEntite implements Serializable {


	/**
	 * Numero de sérialisation
	 */
	private static final long serialVersionUID = -518779491537557626L;

	@EmbeddedId
	private ProduitsAdditifsPk produitsAdditifsPk;

	/**
	 * Retourne la valeur de l'attribut produitsAdditifsPk
	 *
	 * @return produitsAdditifsPk
	 */
	public ProduitsAdditifsPk getProduitsAdditifsPk() {
		return produitsAdditifsPk;
	}

	/**
	 * Met à jour la valeur de l'attribut produitsAdditifsPk
	 *
	 * @param produitsAdditifsPk la nouvelle valeur de l'attribut produitsAdditifsPk 
	 */
	public void setProduitsAdditifsPk(ProduitsAdditifsPk produitsAdditifsPk) {
		this.produitsAdditifsPk = produitsAdditifsPk;
	}

	
}
