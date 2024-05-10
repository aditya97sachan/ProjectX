package com.foody.dtos.userDtos.dto;

import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import lombok.Data;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@JsonSerializableSchema
public class AddressDto implements Serializable {
    @NotEmpty
    private String addressLine1;
    private String addressLine2;
    @NotEmpty
    private String city;
    private String state;
    @NotEmpty
    private String pincode;
}
