package org.example.restapispringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/blog")
public class BlogController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("number")
    public int getNumber(){
        return 1;
    }

    @GetMapping("/number/{number}")
    public String getNumber(@PathVariable String number) {
        return number;
    }
}
