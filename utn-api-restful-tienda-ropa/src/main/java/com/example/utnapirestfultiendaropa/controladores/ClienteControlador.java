package com.example.utnapirestfultiendaropa.controladores;

import com.example.utnapirestfultiendaropa.entidades.Cliente;
import com.example.utnapirestfultiendaropa.servicios.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrito")
public class ClienteControlador {

    @Autowired
    ClienteServicio clienteServicio;

    @PostMapping("/agregar")
    public Cliente agregarAlCarrito(@RequestBody Cliente cliente) {
        return this.clienteServicio.guardarDatosDeCompra(cliente);
    }
}
