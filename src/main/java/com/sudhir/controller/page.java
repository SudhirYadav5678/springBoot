package com.sudhir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sudhir.Form.SingupForm;

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
        SingupForm singupForm = new SingupForm();
        singupForm.setName("Sudhir");
        model.addAttribute("userForm", singupForm);
        return "signup";
    }

    // signup form
    @RequestMapping(value = "/do-signup", method = RequestMethod.POST)
    public String form(@ModelAttribute SingupForm singupForm) {
        System.out.println(singupForm);
        return "redirect:/signup";
    }
}
