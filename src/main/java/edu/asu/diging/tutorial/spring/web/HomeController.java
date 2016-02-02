package edu.asu.diging.tutorial.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.tutorial.spring.service.MoodService;
import edu.asu.diging.tutorial.spring.service.MoodServiceInterface;



@Controller
public class HomeController {
 
	@Autowired
	private MoodServiceInterface service;
	
	@RequestMapping(value = "/")
	public String home(ModelMap map) {
	    map.addAttribute("mood", service.getCurrentMood());
	   // System.out.println("mood" + service.getCurrentMood());
	    return "home";
	}
	
}
