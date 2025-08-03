package com.djamware.secureweb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.djamware.secureweb.model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
    Role findByName(String name);
}
