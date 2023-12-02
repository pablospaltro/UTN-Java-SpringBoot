package com.example.utnspringsecurityproject.services;

import com.example.utnspringsecurityproject.entities.Role;
import com.example.utnspringsecurityproject.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);


    List<User> getUsers();
    /*
    (Idealmente en una app profesional no habria que devolver
    todos los usuarios en un metodo porque seria ineficiente.
    Seria mejor devolver una pagina, con los primeros 10 usuarios,
    por ejemplo.)
     */
}
