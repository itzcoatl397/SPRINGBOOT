package com.example.springcurso.controller;


import com.example.springcurso.models.dto.ParamsDto;
import com.example.springcurso.models.dto.ParamsMixDto;
import jakarta.servlet.http.HttpServletRequest;
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
    public ParamsMixDto bar(@RequestParam String text, @RequestParam Integer code) {

        ParamsMixDto param = new ParamsMixDto();
        param.setMessage(text);
        param.setCode(code);
        return param;
    }
    @GetMapping("/bar2")
    public ParamsMixDto  bar2(HttpServletRequest requestparam) {

        ParamsMixDto param = new ParamsMixDto();
        param.setMessage(requestparam.getParameter("message"));
        param.setCode(Integer.parseInt(requestparam.getParameter("code").strip()));
        return param;
    }



}
