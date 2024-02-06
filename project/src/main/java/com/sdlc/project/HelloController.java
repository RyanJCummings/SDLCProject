package com.sdlc.project;

import com.sdlc.project.ResponseObjects.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final String greetingTemplate = "Hello, %s!";
    @GetMapping("/greeting")
    public Greeting sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(String.format(greetingTemplate, name));
    }
}
