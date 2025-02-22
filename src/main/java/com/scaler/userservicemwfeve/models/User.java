package com.scaler.userservicemwfeve.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModel {
    private String name;
    private String email;
    private String hashedPassword;
    @ManyToMany
    private List<Role> roles;
    /*
    allow multiple login:
    login from phone -> one token
    and login from laptop -> another token (shouldn't get logged out from phone)
     */
    private boolean isEmailVerified;
}
