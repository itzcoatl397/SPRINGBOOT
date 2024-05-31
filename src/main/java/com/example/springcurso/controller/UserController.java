package com.example.springcurso.controller;

import com.example.springcurso.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Gerardo","Maldonado","a@cesgyt.edu");
        model.addAttribute("users",user);

        return "details";
    }
    @GetMapping("/list-user")
    public String listUser(ModelMap model){

       List<User> users = new ArrayList<>();
       User user1 = new User("Gerardo","maldonado","itzcoatl3b@gmail.com");
        User user2= new User("Luis","Palacios","luis@gmail.com");


       users.add(user1);
       users.add(user2);
       model.addAttribute("users",users);
        return "list";

    }
}
