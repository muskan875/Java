package com.jpa.shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.shop.Dto.ItemDto;
import com.jpa.shop.Entity.Item;
import com.jpa.shop.Service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	@GetMapping
	public List<Item> getItems(){
		return itemService.getAllItems();
	}
	
	@PostMapping
	public ItemDto saveItem(@RequestBody ItemDto itemdto) {
		return itemService.addItem(itemdto);
	}
}
