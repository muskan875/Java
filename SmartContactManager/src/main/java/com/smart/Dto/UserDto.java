package com.smart.Dto;

import java.util.List;

import com.smart.Entities.Contact;

import lombok.Data;

@Data
public class UserDto {
 private String name;
 private String email;
 private String password;
 private String img;
 private String about;
 private String role;
 private boolean enabled;
 List<ContactDto> contact;
}
