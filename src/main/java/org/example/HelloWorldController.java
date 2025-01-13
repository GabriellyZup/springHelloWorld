package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }
}

//"feat: create Spring Boot application with "Hello World!" endpoint"