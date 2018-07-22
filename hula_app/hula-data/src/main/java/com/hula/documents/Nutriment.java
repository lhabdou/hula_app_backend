package com.hula.documents;

import org.springframework.data.mongodb.core.mapping.Field;

public class Nutriment {

	private String fat_unit; 
	
	private String fiber_value;
	
	private String proteins_serving; 
	
	private Double fiber_100g;
	
	private String energy_value; 
	
	private String proteins_value; 
	
	private Double sodium_100g; 
	
	@Field("saturated-fat_unit")
	private String saturated_fat_unit;
	
	private Double proteins; 
	
	private String sugars_serving; 
	
	private Double sugars; 
	
	@Field("saturated-fat")
	private Double saturated_fat;
	
	private String salt_value;
	
	private String sodium_value; 
	
	
	@Field("saturated-fat_serving")
	private String saturated_fat_serving;
	
	private Double carbohydrates_100g;
	
	private Double fat_value;
	
	private Double fiber;
	
	private Integer energy;
	
	private Double proteins_100g;
	
	private String fiber_serving;
	
	private String carbohydrates_unit;
	
	private String sodium_unit;
	
	private Double fat;
	
	private Integer energy_100g;
	
	private Double sodium;
	
	private String fiber_unit;
	
	@Field("saturated-fat_value")
	private String saturated_fat_value;
	
	private Double fat_100g;
	
	private String sugars_unit;
	
	private Double carbohydrates_value;
	
	@Field("saturated-fat_100g")
	private Double saturated_fat_100g;
	
	private Double sodium_serving;
	
	private String energy_serving; 
	
	
	private String carbohydrates_serving;
	
	private String fat_serving;

	private Double salt_100g;
	
	private Double salt;
	
	private String energy_unit;
	
	private String salt_unit;
	
	private Double sugars_100g;
	
	private String proteins_unit;

	public String getFat_unit() {
		return fat_unit;
	}

	public void setFat_unit(String fat_unit) {
		this.fat_unit = fat_unit;
	}

	public String getFiber_value() {
		return fiber_value;
	}

	public void setFiber_value(String fiber_value) {
		this.fiber_value = fiber_value;
	}

	public String getProteins_serving() {
		return proteins_serving;
	}

	public void setProteins_serving(String proteins_serving) {
		this.proteins_serving = proteins_serving;
	}

	public Double getFiber_100g() {
		return fiber_100g;
	}

	public void setFiber_100g(Double fiber_100g) {
		this.fiber_100g = fiber_100g;
	}

	public String getEnergy_value() {
		return energy_value;
	}

	public void setEnergy_value(String energy_value) {
		this.energy_value = energy_value;
	}

	public String getProteins_value() {
		return proteins_value;
	}

	public void setProteins_value(String proteins_value) {
		this.proteins_value = proteins_value;
	}

	public Double getSodium_100g() {
		return sodium_100g;
	}

	public void setSodium_100g(Double sodium_100g) {
		this.sodium_100g = sodium_100g;
	}

	public String getSaturated_fat_unit() {
		return saturated_fat_unit;
	}

	public void setSaturated_fat_unit(String saturated_fat_unit) {
		this.saturated_fat_unit = saturated_fat_unit;
	}

	public Double getProteins() {
		return proteins;
	}

	public void setProteins(Double proteins) {
		this.proteins = proteins;
	}

	public String getSugars_serving() {
		return sugars_serving;
	}

	public void setSugars_serving(String sugars_serving) {
		this.sugars_serving = sugars_serving;
	}

	public Double getSugars() {
		return sugars;
	}

	public void setSugars(Double sugars) {
		this.sugars = sugars;
	}

	public Double getSaturated_fat() {
		return saturated_fat;
	}

	public void setSaturated_fat(Double saturated_fat) {
		this.saturated_fat = saturated_fat;
	}

	public String getSalt_value() {
		return salt_value;
	}

	public void setSalt_value(String salt_value) {
		this.salt_value = salt_value;
	}

	public String getSodium_value() {
		return sodium_value;
	}

	public void setSodium_value(String sodium_value) {
		this.sodium_value = sodium_value;
	}

	public String getSaturated_fat_serving() {
		return saturated_fat_serving;
	}

	public void setSaturated_fat_serving(String saturated_fat_serving) {
		this.saturated_fat_serving = saturated_fat_serving;
	}

	public Double getCarbohydrates_100g() {
		return carbohydrates_100g;
	}

	public void setCarbohydrates_100g(Double carbohydrates_100g) {
		this.carbohydrates_100g = carbohydrates_100g;
	}

	public Double getFat_value() {
		return fat_value;
	}

	public void setFat_value(Double fat_value) {
		this.fat_value = fat_value;
	}

	public Double getFiber() {
		return fiber;
	}

	public void setFiber(Double fiber) {
		this.fiber = fiber;
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	public Double getProteins_100g() {
		return proteins_100g;
	}

	public void setProteins_100g(Double proteins_100g) {
		this.proteins_100g = proteins_100g;
	}

	public String getFiber_serving() {
		return fiber_serving;
	}

	public void setFiber_serving(String fiber_serving) {
		this.fiber_serving = fiber_serving;
	}

	public String getCarbohydrates_unit() {
		return carbohydrates_unit;
	}

	public void setCarbohydrates_unit(String carbohydrates_unit) {
		this.carbohydrates_unit = carbohydrates_unit;
	}

	public String getSodium_unit() {
		return sodium_unit;
	}

	public void setSodium_unit(String sodium_unit) {
		this.sodium_unit = sodium_unit;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Integer getEnergy_100g() {
		return energy_100g;
	}

	public void setEnergy_100g(Integer energy_100g) {
		this.energy_100g = energy_100g;
	}

	public Double getSodium() {
		return sodium;
	}

	public void setSodium(Double sodium) {
		this.sodium = sodium;
	}

	public String getFiber_unit() {
		return fiber_unit;
	}

	public void setFiber_unit(String fiber_unit) {
		this.fiber_unit = fiber_unit;
	}

	public String getSaturated_fat_value() {
		return saturated_fat_value;
	}

	public void setSaturated_fat_value(String saturated_fat_value) {
		this.saturated_fat_value = saturated_fat_value;
	}

	public Double getFat_100g() {
		return fat_100g;
	}

	public void setFat_100g(Double fat_100g) {
		this.fat_100g = fat_100g;
	}

	public String getSugars_unit() {
		return sugars_unit;
	}

	public void setSugars_unit(String sugars_unit) {
		this.sugars_unit = sugars_unit;
	}

	public Double getCarbohydrates_value() {
		return carbohydrates_value;
	}

	public void setCarbohydrates_value(Double carbohydrates_value) {
		this.carbohydrates_value = carbohydrates_value;
	}

	public Double getSaturated_fat_100g() {
		return saturated_fat_100g;
	}

	public void setSaturated_fat_100g(Double saturated_fat_100g) {
		this.saturated_fat_100g = saturated_fat_100g;
	}

	public Double getSodium_serving() {
		return sodium_serving;
	}

	public void setSodium_serving(Double sodium_serving) {
		this.sodium_serving = sodium_serving;
	}

	public String getEnergy_serving() {
		return energy_serving;
	}

	public void setEnergy_serving(String energy_serving) {
		this.energy_serving = energy_serving;
	}

	public String getCarbohydrates_serving() {
		return carbohydrates_serving;
	}

	public void setCarbohydrates_serving(String carbohydrates_serving) {
		this.carbohydrates_serving = carbohydrates_serving;
	}

	public String getFat_serving() {
		return fat_serving;
	}

	public void setFat_serving(String fat_serving) {
		this.fat_serving = fat_serving;
	}

	public Double getSalt_100g() {
		return salt_100g;
	}

	public void setSalt_100g(Double salt_100g) {
		this.salt_100g = salt_100g;
	}

	public Double getSalt() {
		return salt;
	}

	public void setSalt(Double salt) {
		this.salt = salt;
	}

	public String getEnergy_unit() {
		return energy_unit;
	}

	public void setEnergy_unit(String energy_unit) {
		this.energy_unit = energy_unit;
	}

	public String getSalt_unit() {
		return salt_unit;
	}

	public void setSalt_unit(String salt_unit) {
		this.salt_unit = salt_unit;
	}

	public Double getSugars_100g() {
		return sugars_100g;
	}

	public void setSugars_100g(Double sugars_100g) {
		this.sugars_100g = sugars_100g;
	}

	public String getProteins_unit() {
		return proteins_unit;
	}

	public void setProteins_unit(String proteins_unit) {
		this.proteins_unit = proteins_unit;
	}

	
}
