package com.sdlc.project;

import com.sdlc.project.Formatters.MathFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    @GetMapping ("/add/{a}/{b}")
    public int add(@PathVariable("a") String a, @PathVariable("b") String b) {
        return MathFormatter.performAdd(a, b);
    }

    @GetMapping ("/sub/{a}/{b}")
    public int subtract(@PathVariable("a") String a, @PathVariable("b") String b) {
        return MathFormatter.performSubtract(a, b);
    }

    @GetMapping ("/mult/{a}/{b}")
    public int multiply(@PathVariable("a") String a, @PathVariable("b") String b) {
        return MathFormatter.performMultiply(a, b);
    }

    @GetMapping ("/div/{a}/{b}")
    public double divide(@PathVariable("a") String a, @PathVariable("b") String b) {
        return MathFormatter.performDivide(a, b);
    }
}
