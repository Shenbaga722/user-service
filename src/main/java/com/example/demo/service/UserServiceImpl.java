package com.example.demo.service;


import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserRequest;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import static com.example.demo.constant.Constants.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;
    @Override
    public List<User> getUsers(){
        return (List<User>)userRepo.findAll();
    }


}