package com.example.appEjemplo.services;

import com.example.appEjemplo.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    IUsuarioRepository iUsuarioRepository;


}
