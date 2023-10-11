package com.example.utnapirestfultiendaropa.servicios;

import com.example.utnapirestfultiendaropa.entidades.Cliente;
import com.example.utnapirestfultiendaropa.entidades.PrendaRopa;
import com.example.utnapirestfultiendaropa.interfaces.IPrecios;
import com.example.utnapirestfultiendaropa.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteServicio {

    @Autowired
    ClienteRepositorio clienteRepositorio;


    public Cliente guardarDatosDeCompra(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }
}
