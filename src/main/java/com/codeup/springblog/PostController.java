package com.codeup.springblog;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String displayPosts(){
        return "All posts will go here";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String displaySinglePost(@PathVariable String id){
        return "Post number: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String CreatePost(){
        return "Post Form Here";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String displayNewPost(){
        return "post created from form";
    }
}
