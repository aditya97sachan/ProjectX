package com.foody.userService.service.impl;

import com.foody.dtos.exceptions.DuplicateDataException;
import com.foody.dtos.userDtos.request.CreateUserRequest;
import com.foody.dtos.userDtos.response.CreateUserResponse;
import com.foody.userService.mappers.UserMapper;
import com.foody.userService.repository.UserRepository;
import com.foody.userService.service.skeleton.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public CreateUserResponse createUser(CreateUserRequest request) {
        userRepository.findByPhone(request.getPhone()).ifPresent(user -> {
            throw new DuplicateDataException("User with phone " + user.getPhone() + " is already registered");
        });

        return UserMapper.INSTANCE.mapToCreateUserResponse(userRepository.save(UserMapper.INSTANCE.mapToUser(request)));
    }
}
