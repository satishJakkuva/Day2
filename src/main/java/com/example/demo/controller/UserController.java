package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userServiceObject;
    @PostMapping("/addUserDetails")
   public String addUserDetails(Users usersObject)
   {
     String stringObject=userServiceObject.addUserDetails(usersObject);
     return stringObject;
   }
}
