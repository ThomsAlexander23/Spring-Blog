package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
//public class HomeController {
//
//    @GetMapping("/")
//    @ResponseBody
//    public String landing(){
//        return "This is the landing page!";
//    }
//}


@Controller
public class HomeController {

    @GetMapping("/home")
    public String welcome() {
        return "home";
    }
}
