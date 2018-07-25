/**
 * 
 */
package com.hula.documents;

import org.springframework.data.annotation.Id;

/**
 * @author asoilihi
 *
 */
public class Ingredient {

	@Id
	private String id; 
	
	private Integer rank; 
	
	private String text;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	} 
	
	
}
