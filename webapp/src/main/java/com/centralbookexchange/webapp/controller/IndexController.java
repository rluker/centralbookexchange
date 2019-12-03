package com.centralbookexchange.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.centralbookexchange.webapp.db.EmailRepository;
import com.centralbookexchange.webapp.model.Email;


@Controller
public class IndexController
{
	@Autowired 
	private EmailRepository emails;

    @GetMapping("/")
    public String index(Model model)
    {
    	if(!model.containsAttribute("email"))
    	{
        	model.addAttribute("email", new Email());
    	}
        return "index";
    }
    
    @PostMapping("/")
	public String addEmail(@RequestParam String userEmail) 
    {
    	emails.save(new Email(userEmail));
		return "redirect:/";
	}

}