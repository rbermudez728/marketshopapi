package com.edu.utp.marketshopapi.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ShopListProduct {

	@Id
	@GeneratedValue
	private Integer shopListProductId;

	@ManyToOne()
	@JoinColumn(name="shoplist_id")
	private ShopList shopList;

	@ManyToOne()
	@JoinColumn(name="product_id")
	private Product product;

	private Integer cantidad;

	private Double precio;

	public Integer getShopListProductId() {
		return shopListProductId;
	}

	public void setShopListProductId(Integer shopListProductId) {
		this.shopListProductId = shopListProductId;
	}

	public ShopList getShopList() {
		return shopList;
	}

	public void setShopList(ShopList shopList) {
		this.shopList = shopList;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
