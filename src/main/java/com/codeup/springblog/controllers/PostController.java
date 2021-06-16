package com.codeup.springblog.controllers;


import com.codeup.springblog.dao.PostsRespository;
import com.codeup.springblog.dao.UsersRepository;
import com.codeup.springblog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostsRespository postsDao;
    private final UsersRepository userDao;

    public PostController(PostsRespository postsDao, UsersRepository usersDao) {
        this.postsDao = postsDao;
        this.userDao = usersDao;
    }

    @GetMapping(path = "/posts")
    public String home(Model model) {
        model.addAttribute("posts", postsDao.findAll());
        return "posts/index";
    }

    @PostMapping(path = "/posts")
    public String delete(@RequestParam(name = "deletePost") long id) {
        postsDao.deleteById(id);
        return "redirect:/posts";
    }

    @PostMapping(path = ("/view"))
    public String viewPost(@RequestParam(name = "viewPost") long id, Model model) {
        model.addAttribute("post", postsDao.findPostsById(id));
        return "posts/show";
    }

    @PostMapping(path = "/view/edit")
    public String editPost(@RequestParam(name = "editPost") long id, Model model) {
        Post postToEdit = postsDao.findPostsById(id);
        model.addAttribute("post", postToEdit);
        return "posts/edit";
    }

    @PostMapping(path = "/posts/save")
    public String savePost(@ModelAttribute Post post) {
        postsDao.saveAndFlush(post);
        return "redirect:/posts";

    }
}

