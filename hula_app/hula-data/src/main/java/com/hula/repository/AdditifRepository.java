package com.hula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hula.entities.AdditifEntite;

public interface AdditifRepository extends JpaRepository<AdditifEntite, String> {

	/**
	 * @param code
	 * @return AdditifsEntite
	 */
	@Query("SELECT ad from AdditifEntite ad WHERE ad.codeAdditif =:code ")
	public AdditifEntite getAdditif(@Param("code") String code);

}
