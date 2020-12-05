package com.edu.utp.marketshopapi.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.edu.utp.marketshopapi.model.entities.ShopList;

public interface IShopList extends CrudRepository<ShopList, Integer> {

}