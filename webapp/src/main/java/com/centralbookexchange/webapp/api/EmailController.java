package com.centralbookexchange.webapp.api;

import javax.validation.constraints.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import com.centralbookexchange.webapp.model.Email;

@Controller
public class EmailController {

    @NotBlank
    private String email;

    @Controller
    public class MyController {

        // TODO: For some reason this throws a builder error with the requestHandlerMapping
//        @GetMapping("/")
//        public String showPage(Model model) {
//            model.addAttribute("userEmail", new Email());
//            return "/";
//        }
//
//        @PostMapping("/")
//        public String showPage(@ModelAttribute("userEmail") Email bean) {
//
//            System.out.println("Email: " + bean.getEmail()); //in reality, you'd use a logger instead :)
//            return "redirect:index";
//        }
    }


    //    @PostMapping("/addEmail")
    //    public String greetingSubmit(@ModelAttribute Email email) {
    //        return "result";
    //    }
    //
    //    @GetMapping("/addEmail")
    //    public String greetingForm( Model model) {
    //        model.addAttribute("email", new Email());
    //        return "greeting";
    //    }

}
