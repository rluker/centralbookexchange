package com.centralbookexchange.webapp.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController 
{
	
    @RequestMapping("/test")
    public String index()
    {
        return "/test";
    }

    @GetMapping("/test")
    public ModelAndView getNumBooks() 
    {
        ModelAndView mav = new ModelAndView(index());
        mav.addObject("numOfBooks", "1234");
        return mav;
    }
}