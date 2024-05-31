package com.example.springcurso.controller;

import com.example.springcurso.models.User;
import com.example.springcurso.models.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details2")
    public UserDto details(){

        UserDto userDto = new UserDto();

         User user = new User("Gerardo Maldonado","Maldonado");
         userDto.setUser(user);
         userDto.setTitle("Hola Mundo");
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        List<User> usuarios = new ArrayList<>();
        User user = new User("Gerardo ","Maldonado");
        User user1 = new User("Diana ","Maldonado");
        User user2 = new User("Ramon ","Maldonado");

        usuarios.add(user);
        usuarios.add(user1);
        usuarios.add(user2);

        return usuarios;

    }


}
