package com.user.Dto;

import java.util.List;

import com.user.Entities.Rating;

import lombok.Data;

@Data
public class UserDto {

	private String name;
	private String email;
	private String address;
	private long mobno;
	private List<Rating> ratings;
}
