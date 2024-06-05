package com.example.springcurso.controller;


import com.example.springcurso.models.User;
import com.example.springcurso.models.dto.ParamsDto;
import com.example.springcurso.models.dto.ParamsMixDto;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    private static final Logger log = LoggerFactory.getLogger(RequestParamsController.class);

    @GetMapping("/foo")
    public ParamsDto foo(@RequestParam(required = false,defaultValue = " ") String message) {
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }
    @GetMapping("/bar")
    public ParamsMixDto bar(@RequestParam String text, @RequestParam Integer code) {

        ParamsMixDto param = new ParamsMixDto();
        param.setMessage(text);
        param.setCode(code);
        return param;
    }

    // Uitilando HttpServletRequest
    @GetMapping("/bar2")
    public ParamsMixDto  bar2(HttpServletRequest requestparam) {
        ParamsMixDto param = new ParamsMixDto();
        param.setMessage(requestparam.getParameter("message"));
        param.setCode(Integer.parseInt(requestparam.getParameter("code").strip()));
        return param;
    }

    // Path Variable

      @GetMapping("/baz/{message}")

    public  ParamsDto baz(@PathVariable String message){
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return  param;
    }
    @GetMapping("/mix/{product}/{id}")

    public Map<String,Object> mix(@PathVariable String product,@PathVariable Long id ){

        Map<String,Object> json = new HashMap<>();

        json.put("products",product);
        json.put("id",id);
        return json;
    }
    @PostMapping("/create")
    public User create(@RequestBody  User users){
        



        return  users;
    }
}
