package com.jpa.shop.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.shop.Dto.BrandDto;
import com.jpa.shop.Entity.Brand;
import com.jpa.shop.Repository.BrandRepository;

@Service
public class BrandService {
	
	@Autowired
	private BrandRepository brandRepository;
	
	public BrandDto addBrand(BrandDto branddto) {
		return branddto;
	}

	
	public List<Brand> getAllBrands(){
		List<Brand> brand = (List<Brand>) brandRepository.findAll();
		return brand;
	}


	
}