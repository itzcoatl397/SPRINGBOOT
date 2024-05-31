package com.example.springcurso.controller;

import com.example.springcurso.models.User;
import com.example.springcurso.models.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details2")
    public UserDto details(){

        UserDto userDto = new UserDto();

        User user = new User("Gerardo","Maldonado");
         userDto.setUser(user);
         userDto.setTitle("Hola Mundo");
        return userDto;
    }


}
