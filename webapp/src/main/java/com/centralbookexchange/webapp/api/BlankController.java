package com.centralbookexchange.webapp.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlankController {

    @RequestMapping("/blank")
    public String index(){
        return "blank";
    }

    @GetMapping("/blank")
    public ModelAndView getNumBooks() {
        ModelAndView mav = new ModelAndView(index());
        mav.addObject("numOfBooks", "1234");
        return mav;
    }
}