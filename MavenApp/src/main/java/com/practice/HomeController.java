package com.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class HomeController {

    @RequestMapping("/Home")
    public String home() {
        return "Hello Home Page ||";
    }

    @RequestMapping("/About")
    public String about() {
        return "Hello About US ||";
    }
}
