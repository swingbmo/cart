package io.swingbmo.cart.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Image {

	@Id
	private String id;
	private String main;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	
}
