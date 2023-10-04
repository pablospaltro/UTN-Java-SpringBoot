package com.example.usuarioApiRest.repositorio;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.usuarioApiRest.entidades.UsuarioEntidad;

@Repository
// extendemos de CrudRepository para poder implementar todos sus métodos
// Tenemos que indicar tipo de dato (UsuarioModel) y el tipo de identificador
// (que es un Long)
public interface UsuarioRepositorio extends CrudRepository<UsuarioEntidad, Long> {

    // añadimos a nuestra interface un método abstracto findByPrioridad
    // (findByNombre, findByEmail, etc)
    // haciéndolo abstracto y completando correctamente su nombre, SpringBoot
    // interpreta la acción buscada
    public abstract ArrayList<UsuarioEntidad> findByPrioridad(int prioridad);
}
