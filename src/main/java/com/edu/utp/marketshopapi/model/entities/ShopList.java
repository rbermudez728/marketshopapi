package com.edu.utp.marketshopapi.model.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ShopList {

	@Id
	@GeneratedValue
	private Integer listId;

	@OneToMany(mappedBy = "shopList")
	private List<ShopListProduct> shopListProducts;

	private LocalDate date;
	
	@ManyToOne()
	@JoinColumn(name="shoplist_id")
	private History history;

	public Integer getListId() {
		return listId;
	}

	public void setListId(Integer listId) {
		this.listId = listId;
	}

	public List<ShopListProduct> getShopListProducts() {
		return shopListProducts;
	}

	public void setShopListProducts(List<ShopListProduct> shopListProducts) {
		this.shopListProducts = shopListProducts;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
