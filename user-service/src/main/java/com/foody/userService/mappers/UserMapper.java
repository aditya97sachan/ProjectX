package com.foody.userService.mappers;

import com.foody.dtos.userDtos.request.CreateUserRequest;
import com.foody.dtos.userDtos.response.CreateUserResponse;
import com.foody.userService.daos.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Mapper
@Service
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapToUser(CreateUserRequest request);

    CreateUserResponse mapToCreateUserResponse(User user);
}
