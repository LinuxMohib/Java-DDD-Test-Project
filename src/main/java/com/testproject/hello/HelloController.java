package com.testproject.hello;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Hello from Spring Boot!";
    }

}
