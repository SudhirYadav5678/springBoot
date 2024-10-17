package com.sudhir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class page {
    @RequestMapping("/")
    public String Home(Model model) {
        model.addAttribute("name", "sunstring");
        return "Home";
    }

    // about route
    @RequestMapping("/about")
    public String About(Model model) {
        return "about";
    }

    // service route
    @RequestMapping("/service")
    public String Service(Model model) {
        return "service";
    }

    // constact
    @RequestMapping("/contact")
    public String Contact(Model model) {
        return "contact";
    }

    // login
    @RequestMapping("/login")
    public String Login(Model model) {
        return "login";
    }

    // signup
    @RequestMapping("/signup")
    public String Signup(Model model) {
        return "signup";
    }
}
