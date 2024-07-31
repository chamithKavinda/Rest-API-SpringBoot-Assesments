package org.example.restapispringboot.controller;

import org.example.restapispringboot.entity.Blog;
import org.example.restapispringboot.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    public BlogRepository blogRepository ;

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

    @GetMapping("/object")
    public Object getObject() {
        Blog blog = new Blog();
        return blog;
    }
}
