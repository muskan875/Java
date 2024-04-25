package com.jpa.admin.Dto;

import java.util.List;

import lombok.Data;

@Data
public class AdminDto {
	private String name;
	private String email;
	private long mobno;
    private List<UserDto> user;
}
