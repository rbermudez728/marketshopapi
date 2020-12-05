package com.edu.utp.marketshopapi.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.edu.utp.marketshopapi.model.entities.ShopListProduct;

public interface IShopListProduct extends CrudRepository<ShopListProduct, Integer> {
	
}