package com.jpa.admin.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.admin.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
