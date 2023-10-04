package com.example.usuarioApiRest.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usuarioApiRest.entidades.UsuarioEntidad;
import com.example.usuarioApiRest.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicio {
    // para poder usar el Repositorio creado
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    public ArrayList<UsuarioEntidad> obtenerUsuarios() {
        // con el método findAll muestro los usuarios
        // lo casteamos a un ArrayList para poder retornarlos
        return (ArrayList<UsuarioEntidad>) usuarioRepositorio.findAll();
    }

    public UsuarioEntidad guardarUsuario(UsuarioEntidad usuario) {
        // para guardar un usuario
        return usuarioRepositorio.save(usuario);
    }

    // decimos "Optional" para que no nos tire error en el caso de que
    // el id haya sido eliminado
    public Optional<UsuarioEntidad> obtenerPorId(Long id) {
        return usuarioRepositorio.findById(id);
    }

    // usaremos el método abstracto que implementados en Repositorio
    public ArrayList<UsuarioEntidad> obtenerPorPrioridad(int prioridad) {
        return usuarioRepositorio.findByPrioridad(prioridad);
    }

    public UsuarioEntidad actualizarUsuario(UsuarioEntidad usuarioModificado, Long id) {
        UsuarioEntidad usuarioAux = usuarioRepositorio.findById(id).get();
        usuarioAux.setNombre(usuarioModificado.getNombre());
        usuarioAux.setEmail(usuarioModificado.getEmail());
        usuarioAux.setPrioridad(usuarioModificado.getPrioridad());
        return usuarioRepositorio.save(usuarioAux);
    }

    // capturamos posibles errores para eliminar
    public boolean eliminarUsuario(Long id) {
        try {
            usuarioRepositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
