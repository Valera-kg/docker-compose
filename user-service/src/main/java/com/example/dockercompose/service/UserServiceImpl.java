package com.example.dockercompose.service;

import com.example.dockercompose.exception.UserAlreadyExistsException;
import com.example.dockercompose.domain.User;
import com.example.dockercompose.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Value("${app.exceptionMessage}")
    private String exceptionMessage;

    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> readAll() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) throws UserAlreadyExistsException {

        if (userRepository.existsById(user.getId())) {
            throw new UserAlreadyExistsException(exceptionMessage);
        } else
            return userRepository.save(user);
    }
}
