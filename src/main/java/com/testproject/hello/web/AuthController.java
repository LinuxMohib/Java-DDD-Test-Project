package com.testproject.hello.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.testproject.hello.user.service.UserService;

@Controller
public class AuthController {
    private final UserService  userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("content", "dashboardContent.jsp");
        return "layout";
    }


    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(){
        return "register";
    }

    @PostMapping("/register")
    public String handleRegister(
        @RequestParam String username,
        @RequestParam String password,
        Model model) {
            userService.register(username, password);
            model.addAttribute("msg", "Registration Successful. Please log in.");
            return "redirect:/login";
        }

    // @GetMapping("/dashboard")
    // public String dashboard() {
    //     return "dashboard";
    // }
    

}
