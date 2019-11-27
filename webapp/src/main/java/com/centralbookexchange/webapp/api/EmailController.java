package com.centralbookexchange.webapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.centralbookexchange.webapp.db.EmailRepository;
import com.centralbookexchange.webapp.model.Email;
import com.centralbookexchange.webapp.model.Greeting;

public class EmailController 
{

//	@Autowired 
//	private EmailRepository emails;
//
//    //@RequestMapping(value = "/email", method = RequestMethod.POST)
//    @GetMapping("/subscribe")
//    public String form(Model model)
//    {
//    	if(!model.containsAttribute("email"))
//    	{
//        	model.addAttribute("email", new Email());
//    	}
//        return "index";
//    }
//	
//    @PostMapping("/subscribe") 
//	public String addNewUser (@ModelAttribute String userEmail) 
//    {
//    	emails.save(new Email(userEmail));
//		return "redirect:index";
//	}

}
