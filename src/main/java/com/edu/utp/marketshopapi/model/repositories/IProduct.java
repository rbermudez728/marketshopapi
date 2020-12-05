package com.edu.utp.marketshopapi.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.edu.utp.marketshopapi.model.entities.Product;

public interface IProduct extends CrudRepository<Product, Integer> {

}
