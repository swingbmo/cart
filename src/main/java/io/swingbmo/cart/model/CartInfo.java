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
	private String footerDesc;
	@Column
	private String isActive;
	
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
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
	public String getFooterDesc() {
		return footerDesc;
	}
	public void setFooterDesc(String footerDesc) {
		this.footerDesc = footerDesc;
	}
}
