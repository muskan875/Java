package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@ResponseBody  //for input in string format or print a return value on webpage
public class Home {
	
	 @RequestMapping("/")  // view resolver
    public String home() {
    	return "Home Page";
    }
	 
	 @RequestMapping("/contact")
	    public String contact() {
	    	return "Contact Info";
	    }
	 
	 @RequestMapping("/about")
	    public String about() {
	    	return "About Us";
	    }
}
