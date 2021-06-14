package com.codeup.springblog;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String home(Model model) {
        List<Post> myPosts = new ArrayList<Post>();
        Post alex = new Post("hi", "ja ja ding dong");
        Post vasya = new Post("bye", "dong ding ja ja");
        myPosts.add(vasya);
        myPosts.add(alex);
        model.addAttribute("posts", myPosts);
        return "posts/index";
    }

    @GetMapping("/posts/show")
    public String singlePost(Model model) {
        Post alex = new Post("hi", "ja ja ding dong");
        model.addAttribute("post", alex);
        return "posts/show";
    }
}

//    @GetMapping("/show")
//    @ResponseBody
//    public String displayPosts(){
//        return "All posts will go here";
//    }
//
//    @GetMapping("/posts/{id}")
//    @ResponseBody
//    public String displaySinglePost(@PathVariable String id){
//        return "Post number: " + id;
//    }
//
//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String CreatePost(){
//        return "Post Form Here";
//    }
//
//    @PostMapping("/posts/create")
//    @ResponseBody
//    public String displayNewPost(){
//        return "post created from form";
//    }
//}
