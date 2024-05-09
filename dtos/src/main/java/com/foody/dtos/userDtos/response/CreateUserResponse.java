package com.foody.dtos.userDtos.response;

import lombok.Data;

@Data
public class CreateUserResponse {
    private String username;
    private String email;
    private String phone;
}
