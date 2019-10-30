package com.centralbookexchange.webapp.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("index")
    public ModelAndView getWatchlist() {

        String viewName = "index";

        Map<String, Object> model = new HashMap<String, Object>();

        model.put("numberOfBooks", "1234");

        return new ModelAndView(viewName , model);
    }
}