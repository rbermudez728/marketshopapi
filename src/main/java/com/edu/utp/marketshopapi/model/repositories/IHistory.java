package com.edu.utp.marketshopapi.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.edu.utp.marketshopapi.model.entities.History;

public interface IHistory extends CrudRepository<History, Integer> {

}
