package com.smart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.smart.Service.HomeService;

@Controller
public class HomeController {

	 private final HomeService homeService;

	    @Autowired
	    public HomeController(HomeService homeService) {
	        this.homeService = homeService;
	    }

   

    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("title", homeService.getHomePageTitle());
        model.addAttribute("content", "<h2>This Is Home page</h2>");
        return "base";
    }

    @GetMapping("/about")
    public String getAbout(Model model) {
        model.addAttribute("title", homeService.getAboutPageTitle());
        model.addAttribute("content", "<h2>This Is About page</h2>");
        return "base";
    }
}