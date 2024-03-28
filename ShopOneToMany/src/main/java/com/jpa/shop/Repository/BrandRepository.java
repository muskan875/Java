package com.jpa.shop.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.shop.Entity.Brand;

@Repository
public interface BrandRepository extends CrudRepository <Brand , Integer>{

}
