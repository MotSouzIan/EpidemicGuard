package com.example.EpidemicGuard.user;

import org.springframework.security.core.userdetails.UserDetails;

public enum UserRole {

    ADMIN("admin"),

    USER("user");

    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
