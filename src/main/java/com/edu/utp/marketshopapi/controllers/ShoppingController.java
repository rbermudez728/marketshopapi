package com.edu.utp.marketshopapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.utp.marketshopapi.services.ShoppingListService;

@RestController
public class ShoppingController {

	ShoppingListService shoppingListService;
	
	public ShoppingController(ShoppingListService shoppingListService) {
		
		this.shoppingListService = shoppingListService;
	}
	
	@GetMapping("/listarCompras")
	List<ShopListDto> listarCompras(){
		
		return shoppingListService.getShoppingLists();		
	}
	
}