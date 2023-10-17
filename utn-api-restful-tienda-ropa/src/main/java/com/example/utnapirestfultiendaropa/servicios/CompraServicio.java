package com.example.utnapirestfultiendaropa.servicios;

import com.example.utnapirestfultiendaropa.repositorios.CompraRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CompraServicio  {

    @Autowired
    CompraRepositorio compraRepositorio;

    //CRUD de Compra.
    //Puedo crear una nueva compra y asociarla a un cliente después de crear
    // ambos objetos.
}
