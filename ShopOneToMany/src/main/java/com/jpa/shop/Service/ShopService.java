package com.jpa.shop.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.shop.Dto.BrandDto;
import com.jpa.shop.Dto.ItemDto;
import com.jpa.shop.Dto.ShopDto;
import com.jpa.shop.Entity.Brand;
import com.jpa.shop.Entity.Item;
import com.jpa.shop.Entity.Shop;
import com.jpa.shop.Repository.ShopRepository;

@Service
public class ShopService {

	@Autowired
	private ShopRepository shopRepository;
	
	public List<Shop> getAllShops(){
		List<Shop> shops = (List<Shop>) shopRepository.findAll();
		return shops;
	}
	
	
	public Shop addShop(ShopDto shopdto) {
	    Shop shop = new Shop();
	    shop.setName(shopdto.getName());
	    shop.setMobno(shopdto.getMobno());
	    shop.setAddress(shopdto.getAddress());
	    
	    List<Brand> brandList = new ArrayList<>();
	    
	    for(BrandDto obj : shopdto.getBrands()) {
	    	
	        Brand brand = new Brand();
	        brand.setName(obj.getName());
	        brand.setShop(shop);
	        
	        List<Item> itemList = new ArrayList<>();
            for (ItemDto obj1 : obj.getItems()) {
            	
            	int quantity = obj1.getQuantity();
            	float price = obj1.getPrice();
            	float total  = quantity*price;
            	
                Item item = new Item();
                item.setName(obj1.getName());
                item.setPrice(obj1.getPrice());
                item.setQuantity(quantity);
                item.setTotal(total);
                item.setBrand(brand);
                item.setShop(shop);
                
                itemList.add(item);
            }
            brand.setItems(itemList);
            
	    brandList.add(brand);
	        
	    }
	    shop.setBrands(brandList);
	    
	    return shopRepository.save(shop);
	}

	
	
}
