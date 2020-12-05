package com.edu.utp.marketshopapi.model.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class History {

	@Id
	@GeneratedValue
	private Integer historyId;

	@OneToMany(mappedBy = "history")
	List<ShopList> lists;

	public List<ShopList> getLists() {
		return lists;
	}

	public void setLists(List<ShopList> lists) {
		this.lists = lists;
	}

}
