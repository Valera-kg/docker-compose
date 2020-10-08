package com.example.dockercompose.controller;

import com.example.dockercompose.domain.User;
import com.example.dockercompose.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<User> retrieveFilm() {
        return userService.readAll();
    }

//    @PostMapping("user")
//    public ResponseEntity<?> saveUser(@RequestBody User user) throws UserAlreadyExistsException, Exception {
//        User savedUser = userService.saveUser(user);
//        responseEntity = new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
//        return responseEntity;
//    }
}
