/**
 * 
 */
package com.hula.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hula.documents.Produits;

/**
 * @author asoilihi
 *
 */
@Repository
public interface ProduitsRepository extends MongoRepository<Produits, String> {

}
