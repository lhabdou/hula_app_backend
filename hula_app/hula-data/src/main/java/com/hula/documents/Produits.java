/**
 * 
 */
package com.hula.documents;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author asoilihi
 *
 */
@Document(collection="productsFr")
public class Produits {
	
	@Id
	private String id;
	
	private String code;
	
	private String categories;
	
	private String origins; 
	
	@Field("additives_tags")
	private List<String> additifs; 
	
	private List<String> ingredients_tags;
	
	private String ingredients;
	
	private Nutriment nutriments;
	
	

	public String getId() {
		return id;
	}

	
	
	public void setId(String id) {
		this.id = id;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getOrigins() {
		return origins;
	}



	public void setOrigins(String origins) {
		this.origins = origins;
	}



	public List<String> getAdditifs() {
		return additifs;
	}



	public void setAdditifs(List<String> additifs) {
		this.additifs = additifs;
	}



	public List<String> getIngredients_tags() {
		return ingredients_tags;
	}



	public void setIngredients_tags(List<String> ingredients_tags) {
		this.ingredients_tags = ingredients_tags;
	}



	public String getIngredients() {
		return ingredients;
	}



	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}



	public Nutriment getNutriments() {
		return nutriments;
	}



	public void setNutriments(Nutriment nutriments) {
		this.nutriments = nutriments;
	}
	

	

}
