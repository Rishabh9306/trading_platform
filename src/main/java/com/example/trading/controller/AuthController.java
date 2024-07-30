package com.example.trading.controller;

import com.example.trading.Model.User;
import com.example.trading.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<User> registerUser(User user) {

        User newUser = new User();
        newUser.setEmail(user.getEmail());

    }
}
