package com.jpa.admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.admin.Entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
