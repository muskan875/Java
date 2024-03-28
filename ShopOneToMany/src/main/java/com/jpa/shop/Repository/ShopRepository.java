package com.jpa.shop.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.shop.Entity.Shop;

@Repository
public interface ShopRepository extends CrudRepository <Shop , Integer>{

}
