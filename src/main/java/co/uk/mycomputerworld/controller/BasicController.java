package co.uk.mycomputerworld.controller;

import co.uk.mycomputerworld.springboot.bean.WelcomeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello World";
    }

    @GetMapping("/welcome-with-object")
    public WelcomeBean welcomeWithObject() {
        return new WelcomeBean("Hello World");
    }

}


