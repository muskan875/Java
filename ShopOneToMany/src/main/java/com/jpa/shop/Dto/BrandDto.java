package com.jpa.shop.Dto;

import java.util.List;

import lombok.Data;

@Data
public class BrandDto {
    private String name;
    List<ItemDto> items;
}
