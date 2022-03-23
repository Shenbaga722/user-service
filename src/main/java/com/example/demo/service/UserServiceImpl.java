package com.example.demo.service;


import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserRequest;
import com.example.demo.exception.CustomCreateUserException;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
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

    @Override
    public UserDto createUser(UserRequest userRequest) {
        User user1 = new User();
        user1.setFirstName(userRequest.getFirstName());
        user1.setLastName(userRequest.getLastName());
        user1.setMiddleName(userRequest.getMiddleName());
        user1.setPhoneNumber(userRequest.getPhoneNumber());
        user1.setEmail(userRequest.getEmail());
        user1.setDateOfBirth(userRequest.getDateOfBirth());
        user1.setGender(userRequest.getGender());
        user1.setEmployeeNumber(userRequest.getEmployeeNumber());
        user1.setBloodGroup(userRequest.getBloodGroup());
        user1.setPassword(userRequest.getPassword());
        user1 = userRepo.save(user1);
        return new UserDto(user1.getId(), user1.getFirstName(), user1.getLastName(), user1.getMiddleName(), user1.getPhoneNumber(), user1.getEmail(), user1.getDateOfBirth(), user1.getEmployeeNumber(), user1.getBloodGroup(), user1.getGender());

    }


}




