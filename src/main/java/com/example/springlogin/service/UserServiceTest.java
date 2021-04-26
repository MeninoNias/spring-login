package com.example.springlogin.service;

import com.example.springlogin.model.User;
import com.example.springlogin.repository.RoleRepository;
import com.example.springlogin.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



public class UserServiceTest {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private UserService userServiceTest;
    private User user;

}
