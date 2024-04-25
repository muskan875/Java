package com.user.Dto;

import java.sql.Date;

import lombok.Data;

@Data
public class UserDto {
private String name;
private String email;
private String password;
private String address;
private String userRole;
private String gender;
private long mobno;
private Date dob;

}
