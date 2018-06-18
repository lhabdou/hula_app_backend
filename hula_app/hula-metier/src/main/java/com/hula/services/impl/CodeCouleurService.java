/**
 * 
 */
package com.hula.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hula.domain.CodeCouleur;
import com.hula.entities.CodeCouleursEntite;
import com.hula.mapper.CodeCouleurMapper;
import com.hula.repository.CodeCouleurRepository;
import com.hula.services.ICodeCouleurService;

/**
 * @author asoilihi
 *
 */
@Service
@Transactional
public class CodeCouleurService implements ICodeCouleurService {

	@Autowired
	private CodeCouleurRepository codeCouleurRepository;

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.hula.services.ICodeCouleurService#getCodeCouleur(java.lang.String)
	 */
	@Override
	public CodeCouleur getCodeCouleur(String code) {

		CodeCouleursEntite codeCouleurEntite = codeCouleurRepository.getOne(code);

		return CodeCouleurMapper.transformerCodeCouleurEntiteEnCodeCouleur(codeCouleurEntite);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.hula.services.ICodeCouleurService#getAllCodesCouleurs()
	 */
	@Override
	public List<CodeCouleur> getAllCodesCouleurs() {
		
		List<CodeCouleursEntite> listeCodeCouleurs = codeCouleurRepository.findAll();
		
		return CodeCouleurMapper.transformerListeCodeCouleursEntiteEnListeCodeCouleur(listeCodeCouleurs);
	}

	/**
	 * @param codeCouleurRepository the codeCouleurRepository to set
	 */
	public void setCodeCouleurRepository(CodeCouleurRepository codeCouleurRepository) {
		this.codeCouleurRepository = codeCouleurRepository;
	}
	
	

}
