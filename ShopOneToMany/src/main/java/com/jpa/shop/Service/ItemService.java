package com.jpa.shop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.shop.Dto.ItemDto;
import com.jpa.shop.Entity.Item;
import com.jpa.shop.Repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public ItemDto addItem(ItemDto itemdto) {
		return itemdto;
	}
	
	public List<Item> getAllItems(){
		List<Item> item = (List<Item>) itemRepository.findAll();
		return item;
	}

}
