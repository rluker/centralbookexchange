package com.centralbookexchange.webapp.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController
{
    @RequestMapping("/cbe")
    public String index(){
        return "index";
    }

    //    @RequestMapping("/cbe")
    @GetMapping("/cbe")
    public ModelAndView getNumBooks() {
        ModelAndView mav = new ModelAndView(index());
        mav.addObject("numOfBooks", "1234");
        return mav;
    }
}