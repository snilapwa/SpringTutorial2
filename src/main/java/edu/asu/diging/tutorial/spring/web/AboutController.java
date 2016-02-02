package edu.asu.diging.tutorial.spring.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.tutorial.spring.service.MoodServiceInterface;

@Controller
public class AboutController {

	
	@Autowired
	private MoodServiceInterface moodService;

	@RequestMapping(value="/about/")
	public String showAbout(Model model) {
		//model.addAttribute("mood", mood);
		model.addAttribute("about", moodService.getAbout());
		
		return "about";
	}
}
