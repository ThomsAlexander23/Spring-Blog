package com.codeup.springblog.controllers;

import com.codeup.springblog.dao.UsersRepository;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UsersRepository usersDao;

    public UserController(UsersRepository usersDao){
        this.usersDao = usersDao;
    }
}
