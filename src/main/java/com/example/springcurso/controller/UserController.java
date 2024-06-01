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

       List<User> users = Arrays.asList(
               new User("Diana", "Fonseca", "dianafonseca@gmail.com "),
               new User("Mario", "Aguilar", "aguilarmario@gmail.com"),
               new User("Pedro", "Lopez", "pedrolopez@gmail.com"),
               new User("Maria", "Mariano", "marano@gmail.com"),
               new User("Jose", "Jose", "jose@gmail.com"),
               new  User("sofia","mayorga","sofia@gmail.com")
       );
       model.addAttribute("users",users);
        return "list";

    }
}
