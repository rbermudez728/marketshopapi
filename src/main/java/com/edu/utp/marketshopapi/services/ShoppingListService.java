package com.edu.utp.marketshopapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.utp.marketshopapi.controllers.ShopListDto;
import com.edu.utp.marketshopapi.dto.ProductDto;

@Service
public class ShoppingListService {

	public List<ShopListDto> getShoppingLists() {
		
		List<ShopListDto> response = new ArrayList<>();
		
		//Creating shopping list 1
		ShopListDto shopList1 = new ShopListDto();
		List<ProductDto> productList = new ArrayList<>();
		
		//Creating product 1
		ProductDto product1 = new ProductDto();
		product1.setName("Jabon bano");
		product1.setAdquired(true);		
		productList.add(product1);
		
		//Creating product 2
		ProductDto product2 = new ProductDto();
		product2.setName("Bolsas de plastico");
		product2.setAdquired(false);		
		productList.add(product2);
		
		shopList1.setProductList(productList);
		response.add(shopList1);		
		
		ShopListDto shopList2 = new ShopListDto();
		
		List<ProductDto> productList2 = new ArrayList<>();
		//Creating product 1
		ProductDto product3 = new ProductDto();
		product3.setName("Mantel cocina");
		product3.setAdquired(true);		
		productList2.add(product3);
		
		//Creating product 2
		ProductDto product4 = new ProductDto();
		product4.setName("Panales");
		product4.setAdquired(true);		
		productList2.add(product4);
		
		shopList2.setProductList(productList2);
		response.add(shopList2);	
		return response;
	}

}
