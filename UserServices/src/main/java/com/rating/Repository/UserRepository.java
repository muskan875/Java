package com.rating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
