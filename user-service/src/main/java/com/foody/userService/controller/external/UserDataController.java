package com.foody.userService.controller.external;

import com.foody.dtos.userDtos.request.CreateUserRequest;
import com.foody.userService.service.skeleton.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users/v1/")
public class UserDataController {

    @Autowired
    private UserService userService;

    @PostMapping(name = "create")
    public ResponseEntity<String> createUser(@Valid @RequestBody CreateUserRequest request) {
        userService.createUser(request);
        return new ResponseEntity<>("User created successfully", HttpStatus.CREATED);
    }
}