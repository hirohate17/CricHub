package com.crichub.home;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeScreenController {

    @GetMapping("/home")
    public String getHomeScreen() {
        return "HomeScreen";
    }
}
