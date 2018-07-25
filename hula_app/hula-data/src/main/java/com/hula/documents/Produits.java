/**
 * 
 */
package com.hula.documents;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
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
	
	private Integer additives_old_n;
	
	private Integer additives_n;
		
	private List<Ingredient> ingredients;
	
	private Nutriment nutriments;
	
	private String product_name; 
	
	private Integer ingredients_from_palm_oil_n;
	
	private Double product_quantity; 
	
	private String ingredients_text_fr; 
	
	private byte[] images; 
	
	private String allergens; 
	
	private String traces;
	
	private Date last_image_t; 
	

	public Integer getAdditives_old_n() {
		return additives_old_n;
	}

	
	public void setAdditives_old_n(Integer additives_old_n) {
		this.additives_old_n = additives_old_n;
	}



	public Integer getAdditives_n() {
		return additives_n;
	}



	public void setAdditives_n(Integer additives_n) {
		this.additives_n = additives_n;
	}



	public Double getProduct_quantity() {
		return product_quantity;
	}



	public void setProduct_quantity(Double product_quantity) {
		this.product_quantity = product_quantity;
	}



	public String getIngredients_text_fr() {
		return ingredients_text_fr;
	}



	public void setIngredients_text_fr(String ingredients_text_fr) {
		this.ingredients_text_fr = ingredients_text_fr;
	}



	public byte[] getImages() {
		return images;
	}



	public void setImages(byte[] images) {
		this.images = images;
	}



	public String getAllergens() {
		return allergens;
	}



	public void setAllergens(String allergens) {
		this.allergens = allergens;
	}



	public String getTraces() {
		return traces;
	}



	public void setTraces(String traces) {
		this.traces = traces;
	}



	public Date getLast_image_t() {
		return last_image_t;
	}



	public void setLast_image_t(Date last_image_t) {
		this.last_image_t = last_image_t;
	}



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





	public Nutriment getNutriments() {
		return nutriments;
	}



	public void setNutriments(Nutriment nutriments) {
		this.nutriments = nutriments;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public Integer getIngredients_from_palm_oil_n() {
		return ingredients_from_palm_oil_n;
	}


	public void setIngredients_from_palm_oil_n(Integer ingredients_from_palm_oil_n) {
		this.ingredients_from_palm_oil_n = ingredients_from_palm_oil_n;
	}


	public List<Ingredient> getIngredients() {
		return ingredients;
	}


	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}


}
