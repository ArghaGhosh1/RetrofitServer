package com.example.RetrofitServer.Service;


import com.example.RetrofitServer.Entity.User;
import com.example.RetrofitServer.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private UserRepo userRepo;

    public User saveAllUser(User data) {
        return userRepo.save(data);
    }

    public List<User> getAllUser() {
        return userRepo.findAll();
    }
}
