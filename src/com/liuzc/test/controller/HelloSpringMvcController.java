package com.liuzc.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 15827
 */
@Controller
public class HelloSpringMvcController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return  "hello";
    }

    @RequestMapping(value = "/getPort")
    public ModelAndView getPort(){
        ModelAndView model = new ModelAndView("web/index");
        return model;
    }
}
