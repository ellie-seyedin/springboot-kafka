package com.example.restapi.service;

import com.example.restapi.model.Student;
import com.example.restapi.repository.UserRepository;

import java.util.Optional;

public class UserService    {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public Student getStudent(Long id){
//        Optional<Student>
//    }
}
