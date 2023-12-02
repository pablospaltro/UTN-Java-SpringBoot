package com.example.utnspringsecurityproject.repositories;

import com.example.utnspringsecurityproject.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findUserByName(String name);
}
