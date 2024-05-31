package com.example.springcurso.controller;

import com.example.springcurso.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Gerardo","Maldonado");
        model.addAttribute("users",user);

        return "details";
    }
}
