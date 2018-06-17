package com.hula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hula.entities.CodeCouleursEntite;

public interface CodeCouleurRepository extends JpaRepository<CodeCouleursEntite, String> {

}
