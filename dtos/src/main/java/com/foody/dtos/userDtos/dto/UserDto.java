package com.foody.dtos.userDtos.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private String username;
    private String email;
    private String password;
    private String phone;
    private List<AddressDto> addresses;
}
