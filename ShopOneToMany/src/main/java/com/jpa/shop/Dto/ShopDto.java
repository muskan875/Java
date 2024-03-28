package com.jpa.shop.Dto;

import java.util.List;

import lombok.Data;

@Data
public class ShopDto {
      private String name;
      private String address;
      private long mobno;
      List<BrandDto> brands;
//      List<ItemDto> items;
}