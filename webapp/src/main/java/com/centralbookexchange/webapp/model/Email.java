package com.centralbookexchange.webapp.model;

import javax.validation.constraints.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class Email {

    @NotBlank
    private String email;

    public Email() {

    }

    public Email(String email) {
        this.email = email;
    }

    @PostMapping("/addEmail")
    public String greetingSubmit(@ModelAttribute Email email) {
        return "result";
    }

    @GetMapping("/addEmail")
    public String greetingForm( Model model) {
        model.addAttribute("email", new Email());
        return "greeting";
    }

}
