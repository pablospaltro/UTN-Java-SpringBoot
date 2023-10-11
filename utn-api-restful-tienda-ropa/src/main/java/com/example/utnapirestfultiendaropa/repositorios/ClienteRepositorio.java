package com.example.utnapirestfultiendaropa.repositorios;

import com.example.utnapirestfultiendaropa.entidades.Cliente;
import com.example.utnapirestfultiendaropa.entidades.PrendaRopa;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepositorio extends CrudRepository<Cliente, Long> {
}
