package com.example.fooddelivery.Repo;

import com.example.fooddelivery.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepo extends MongoRepository<User, Long> {
    Optional<User> getByUsername(String username);

}
