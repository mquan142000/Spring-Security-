package com.example.springsecurityjwt.model.DTO;

import com.example.springsecurityjwt.model.Role;

import java.util.Set;

public class UserDTO {
    private Long id;
    private String username;
    private Set<Role> roles;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, Set<Role> roles) {
        this.id = id;
        this.username = name;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
