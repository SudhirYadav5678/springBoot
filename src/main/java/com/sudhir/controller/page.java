package com.sudhir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sudhir.Form.SingupForm;
import com.sudhir.entites.User;
import com.sudhir.services.UserService;

@Controller
public class page {

    @Autowired
    private UserService userService;

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
        User user = User.builder()
                .name(singupForm.getName())
                .email(singupForm.getEmail())
                .password(singupForm.getPassword())
                .about(singupForm.getAbout())
                .phone(singupForm.getPhone())
                .profilePic(
                        "https://www.learncodewithdurgesh.com/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fdurgesh_s35c6cb78webp&w=1920&q=75")
                .build();
        User savedUser = userService.saveUser(user);
        return "redirect:/signup";
    }
}
