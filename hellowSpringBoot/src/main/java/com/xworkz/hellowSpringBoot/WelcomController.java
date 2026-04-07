package com.xworkz.hellowSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomController {

    @GetMapping("/hellow")
    public String hellow(){
        return "Welcome to Spring Boot";
    }
}
