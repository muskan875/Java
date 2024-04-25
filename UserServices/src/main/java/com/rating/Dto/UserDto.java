package com.rating.Dto;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.rating.Entities.Contact;

import lombok.Data;

@Data
public class UserDto {
private String name;
private String email;
private long mobno;
List<Contact> contacts;
}
