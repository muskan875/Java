package com.jpa.shop.Dto;

import lombok.Data;

@Data
public class ItemDto {
	
     private String name;
     private float price;
     private int quantity;
     private float total;
     
}
