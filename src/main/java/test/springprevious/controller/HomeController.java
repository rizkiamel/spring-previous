package test.springprevious.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/user")
    public String userWorld(){
        return "Halo user";
    }

    @GetMapping("/admin")
    public String adminWorld(){
        return "Halo admin";
    }
}
