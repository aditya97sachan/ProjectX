package com.foody.dtos.userDtos.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AddressDto {
    @NotEmpty
    private String addressLine1;
    private String addressLine2;
    @NotEmpty
    private String city;
    private String state;
    @NotEmpty
    private String pincode;
}
