package com.svs.service;

import com.svs.entity.User;
import com.svs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    // bind with interface using builder
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    // ... //

    public List<User> findAllByName(String name){
        return userRepository.findAll();
    }
}
