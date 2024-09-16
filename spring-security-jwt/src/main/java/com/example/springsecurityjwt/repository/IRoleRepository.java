package com.example.springsecurityjwt.repository;

import com.example.springsecurityjwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long> {
}
