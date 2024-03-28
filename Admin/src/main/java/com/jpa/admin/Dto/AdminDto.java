package com.jpa.admin.Dto;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import lombok.Data;

@Data
public class AdminDto {
	private String name;
	private String email;
	private long mobno;
    private List<User> user;
}
