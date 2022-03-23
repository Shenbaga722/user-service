package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserRequest;
import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();
    UserDto createUser(UserRequest userRequest);
    UserDto updateUser(UserRequest userRequest, String userId);
    String deleteUser(String userId);
    UserDto getUserById(String userId);
}
