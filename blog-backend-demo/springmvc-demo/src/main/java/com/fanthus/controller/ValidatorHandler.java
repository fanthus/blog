package com.fanthus.controller;

import com.fanthus.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/validator")
public class ValidatorHandler {

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("account",new Account());
        return "login";
    }

    @PostMapping("/login")
    public String login(@Validated Account account, BindingResult result) {
        if (result.hasErrors()) {
            return "login";
        }
        return "index";
    }

}
