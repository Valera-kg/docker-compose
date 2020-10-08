package com.example.dockercompose.service;

import com.example.dockercompose.exception.UserAlreadyExistsException;
import com.example.dockercompose.domain.User;

import java.util.List;

public interface UserService {
    List<User> readAll();

    User saveUser(User user) throws UserAlreadyExistsException;

}
