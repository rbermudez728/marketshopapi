package com.edu.utp.marketshopapi.controllers;

import java.util.List;

import com.edu.utp.marketshopapi.dto.ProductDto;

public class ShopListDto {

	List<ProductDto> productList;

	public List<ProductDto> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductDto> productList) {
		this.productList = productList;
	}

}
