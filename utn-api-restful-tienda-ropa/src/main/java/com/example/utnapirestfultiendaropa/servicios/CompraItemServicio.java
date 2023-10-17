package com.example.utnapirestfultiendaropa.servicios;

import com.example.utnapirestfultiendaropa.repositorios.CompraItemRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraItemServicio {

    @Autowired
    CompraItemRepositorio compraItemRepositorio;

    //CRUD de CompraItem
    //Al crear una compra, puedo agregar elementos de CompraItem a través
    //de este repositorio
}
