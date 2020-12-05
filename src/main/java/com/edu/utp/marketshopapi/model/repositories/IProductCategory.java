package com.edu.utp.marketshopapi.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.edu.utp.marketshopapi.model.entities.ProductCategory;

public interface IProductCategory extends CrudRepository<ProductCategory, Integer> {

}