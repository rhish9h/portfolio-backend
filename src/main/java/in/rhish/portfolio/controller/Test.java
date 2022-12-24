package in.rhish.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/test")
    public String test() {
        System.out.println("Test API called!");
        return "Portfolio-backend is working fine!";
    }
}
