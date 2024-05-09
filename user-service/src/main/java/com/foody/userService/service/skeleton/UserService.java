package com.foody.userService.service.skeleton;

import com.foody.dtos.userDtos.request.CreateUserRequest;
import com.foody.dtos.userDtos.response.CreateUserResponse;

public interface UserService {
    CreateUserResponse createUser(CreateUserRequest request);
}
