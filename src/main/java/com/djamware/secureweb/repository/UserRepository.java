package com.djamware.secureweb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.djamware.secureweb.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);

    boolean existsByUsername(String username);
}
