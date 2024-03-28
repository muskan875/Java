package com.jpa.User.Dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

	private String name;
	private String address;
	private String gender;
	private long mobno;
	List<PositionDto> positions;	
}
