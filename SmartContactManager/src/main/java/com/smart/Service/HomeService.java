package com.smart.Service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getHomePageTitle() {
        return "Home - Smart Contact Manager";
    }

    public String getAboutPageTitle() {
        return "About - Smart Contact Manager";
    }
}