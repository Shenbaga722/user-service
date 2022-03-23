package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserRequest;
import com.example.demo.exception.CustomCreateUserException;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

        @Autowired
        UserService userService;

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getUsers(){
        return new ResponseEntity<>(userService.getUsers(),HttpStatus.FOUND);
    }
    @PostMapping
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserRequest userRequest){
        try {
            UserServiceImpl userService;
            return new ResponseEntity<>(userService.createUser(userRequest), HttpStatus.CREATED);
        }
        catch (Exception e){
            throw new CustomCreateUserException("Syntax Error");
        }

}

