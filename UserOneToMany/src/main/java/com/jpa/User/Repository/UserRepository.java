package com.jpa.User.Repository;


import org.springframework.stereotype.Repository;
import com.jpa.User.Entities.User;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository <User , Integer>{

}
