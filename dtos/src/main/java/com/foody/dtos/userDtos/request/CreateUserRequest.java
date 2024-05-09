package com.foody.dtos.userDtos.request;

import com.foody.dtos.userDtos.dto.AddressDto;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Valid
@Data
public class CreateUserRequest {
    private String username;
    private String email;
    private String password;
    @NotEmpty
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
    private String phone;
    private List<AddressDto> addresses;
}
