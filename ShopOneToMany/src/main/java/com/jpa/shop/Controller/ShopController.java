package com.jpa.shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.shop.Dto.ShopDto;
import com.jpa.shop.Entity.Shop;
import com.jpa.shop.Service.ShopService;

@RestController
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired
	private ShopService shopService;
  
	@GetMapping
	public List<Shop> getShops() {
		List<Shop> shop = shopService.getAllShops();
		return shop;
	}
	
	@PostMapping
	public Shop saveShop(@RequestBody ShopDto shopdto) {
		return shopService.addShop(shopdto);
	}
}
