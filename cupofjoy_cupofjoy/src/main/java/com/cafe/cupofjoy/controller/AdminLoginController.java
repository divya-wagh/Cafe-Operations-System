package com.cafe.cupofjoy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.cafe.cupofjoy.models.Admin;
import com.cafe.cupofjoy.services.AdminRepository;

@Controller
public class AdminLoginController {

    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        Admin admin = adminRepository.findByUsername(username);
        if (admin != null && admin.getPassword().equals(password)) {
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Invalid username or password!");
            return "login";
        }
    }
}

