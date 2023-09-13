package com.example.demo.service;

import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepositoryObject;
    public String addUserDetails(Users usersObject) {
        userRepositoryObject.save(usersObject);
        return "user details got added succesfully";
    }
}
