package com.example.utnspringsecurityproject.services;

import com.example.utnspringsecurityproject.entities.Role;
import com.example.utnspringsecurityproject.entities.User;
import com.example.utnspringsecurityproject.repositories.RoleRepository;
import com.example.utnspringsecurityproject.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        log.info("Saving new user {} to the database", user.getName());
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role {} to the database", role.getName());
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        log.info("Addig role {} to user {}", roleName, userName);
        User user = userRepository.findUserByUsername(userName);
        Role role = roleRepository.findUserByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String userName) {
        log.info("Fetching user {}", userName);
        return userRepository.findUserByUsername(userName);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching all users");
        return userRepository.findAll();
    }
}
