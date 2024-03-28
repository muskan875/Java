package com.jpa.shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.shop.Dto.BrandDto;
import com.jpa.shop.Entity.Brand;
import com.jpa.shop.Service.BrandService;

@RestController
@RequestMapping("/brands")
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	@GetMapping
	public List<Brand> getBrands(){
		return brandService.getAllBrands();
	}

	@PostMapping
	public BrandDto saveBrand(@RequestBody BrandDto branddto) {
		return brandService.addBrand(branddto);
	}
}
