package com.example.RetrofitServer.Controller;


import com.example.RetrofitServer.Entity.User;
import com.example.RetrofitServer.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class api {

    @Autowired
    private PostService postService;

    @PostMapping("/create-user")
    public User postUser(@RequestBody User data){
        return postService.saveAllUser(data);
    }

    @GetMapping("/get-user")
    public List<User> getAllUser(){
        return postService.getAllUser();
    }
}
