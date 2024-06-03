package com.example.springcurso.controller;


import com.example.springcurso.models.dto.ParamsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamsDto foo(@RequestParam(required = false,defaultValue = " ") String message) {
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }
    @GetMapping("/bar")
    public ParamsDto bar(@RequestParam String text,@RequestParam Integer code) {

        ParamsDto param = new ParamsDto();
        param.setMessage(text);
        param.setCode(code);
        return param;
    }

}
