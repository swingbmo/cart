package io.swingbmo.cart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart_info")
public class CartInfo {
	
	@Id
	private Integer id;
	@Column
	private String title;
	@Column
	private String desc;
	@Column
	private String footerdesc;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getFooterdesc() {
		return footerdesc;
	}
	public void setFooterdesc(String footerDesc) {
		this.footerdesc = footerDesc;
	}
}
