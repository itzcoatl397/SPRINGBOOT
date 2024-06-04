package com.example.springcurso.controller;


import com.example.springcurso.models.dto.ParamsDto;
import com.example.springcurso.models.dto.ParamsMixDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

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






}
