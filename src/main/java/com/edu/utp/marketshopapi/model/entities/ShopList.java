package com.edu.utp.marketshopapi.model.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ShopList {

	@Id
	@GeneratedValue
	private Integer listId;

	private List<ShopListProduct> shopListProducts;

	private LocalDate date;

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
