package com.hula.entities.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class AdditifsPratiquesPk implements Serializable {

	/**
	 * Numero de sérialisation
	 */
	private static final long serialVersionUID = 8162824201713350411L;
	
	@Column(name = "code_additif")
	private String codeAdditif;
	
	@Column(name = "id_pratique")
	private Long idPratique;

	/**
	 * Retourne la valeur de l'attribut codeAdditif
	 *
	 * @return codeAdditif
	 */
	public String getCodeAdditif() {
		return codeAdditif;
	}

	/**
	 * Met à jour la valeur de l'attribut codeAdditif
	 *
	 * @param codeAdditif la nouvelle valeur de l'attribut codeAdditif 
	 */
	public void setCodeAdditif(String codeAdditif) {
		this.codeAdditif = codeAdditif;
	}

	/**
	 * Retourne la valeur de l'attribut idPratique
	 *
	 * @return idPratique
	 */
	public Long getIdPratique() {
		return idPratique;
	}

	/**
	 * Met à jour la valeur de l'attribut idPratique
	 *
	 * @param idPratique la nouvelle valeur de l'attribut idPratique 
	 */
	public void setIdPratique(Long idPratique) {
		this.idPratique = idPratique;
	}

	
	
}
