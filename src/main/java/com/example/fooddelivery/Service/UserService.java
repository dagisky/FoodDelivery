package com.example.fooddelivery.Service;

import com.example.fooddelivery.Model.User;
import com.example.fooddelivery.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public User findById(Long id){
        Optional<User> user = userRepo.findById(id);
        return user.orElse(null);
    }
}
