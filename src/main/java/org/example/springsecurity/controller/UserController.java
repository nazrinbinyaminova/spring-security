package org.example.springsecurity.controller;

import lombok.RequiredArgsConstructor;
import org.example.springsecurity.dao.model.UserModel;
import org.example.springsecurity.service.JPAUserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("users/v1")
@RequiredArgsConstructor
public class UserController {
//    private final JPAUserDetailsService userDetailsService;

    @GetMapping
    public List<String> getUsers(){
        return List.of("Nazrin");
    }

//    @PostMapping
//    public List<String> createUser(UserModel model){
//        return List.of("Nazrin");
//    }
}
