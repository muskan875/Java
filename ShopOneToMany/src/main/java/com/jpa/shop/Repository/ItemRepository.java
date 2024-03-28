package com.jpa.shop.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.shop.Entity.Item;

@Repository
public interface ItemRepository extends CrudRepository <Item , Integer>{

}
