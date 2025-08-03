package com.djamware.secureweb.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    private Set<Role> roles;
}
