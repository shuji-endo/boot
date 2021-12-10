package com.simwelman.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HeloController {

	@Autowired
	WeatherService weatherService;
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message", "Hello Springboot");
        List<WeatherEntity> list = weatherService.selectAll();
        model.addAttribute("list", list);
        return "index";
    }
}
