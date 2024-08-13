package org.example.restapispringboot.controller;

import org.example.restapispringboot.entity.Blog;
import org.example.restapispringboot.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    public BlogRepository blogRepository ;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/number")
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

    @PostMapping("/savepost")
    public void savePOst(@RequestBody Blog blog){
        blogRepository.save(blog);
    }
    @GetMapping("/getAllpost")
    public List<Blog> getAllPost( ){
        return blogRepository.findAll();
    }

    @DeleteMapping("/deletePost")
    public void deletePost(@RequestParam("id") int id){
        blogRepository.deleteById(id);
    }

    @PutMapping("/updatePost")
    public Blog updatePost(Blog blog){
        return   blogRepository.save(blog);
    }

}
