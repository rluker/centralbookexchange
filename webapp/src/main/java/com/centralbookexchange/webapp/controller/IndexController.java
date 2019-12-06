package com.centralbookexchange.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.centralbookexchange.webapp.db.CBERepository;
import com.centralbookexchange.webapp.model.Email;


@Controller
@SessionAttributes("name")
public class IndexController
{
	@Autowired 
	private CBERepository repo;

    @GetMapping("/")
    public ModelAndView index()
    {
    	ModelAndView model = new ModelAndView("index");
    	model.addObject("email", new Email());
    	model.addObject("eventsList", repo.getAllEvents());
    	model.addObject("bannerList", repo.getAllBanners());
    	model.addObject("pickList", repo.getAllPicks());
        return model;
    }
    
    @PostMapping("/")
	public String addEmail(@RequestParam String userEmail) 
    {
    	repo.saveEmail(new Email(userEmail));
		return "redirect:/";
	}
    
    @GetMapping("/search")
	public String search(@RequestParam String searchText) 
    {
    	String searchRedirect = "redirect:https://www.central-bookexchange.com/quicksearch/all/" + searchText;
		return searchRedirect;
	}

}
