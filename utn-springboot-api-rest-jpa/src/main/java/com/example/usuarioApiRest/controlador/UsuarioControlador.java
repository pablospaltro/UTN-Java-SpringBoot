package com.example.usuarioApiRest.controlador;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.usuarioApiRest.entidades.UsuarioEntidad;
import com.example.usuarioApiRest.servicio.UsuarioServicio;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
    @Autowired
    UsuarioServicio usuarioServicio;

    @GetMapping()
    public ArrayList<UsuarioEntidad> obtenerUsuarios() {
        return usuarioServicio.obtenerUsuarios();
    }

    // Este método nos retornará el usuario pero actualizado
    // es decir, con su ID generado
    @PostMapping
    // Todos los clientes pueden enviar información dentro del cuerpo de la
    // solicitud HTTP
    // para eso usamos la anotación @RequestBody
    public UsuarioEntidad guardarUsuario(@RequestBody UsuarioEntidad usuario) {
        return this.usuarioServicio.guardarUsuario(usuario);
    }

    // su camino será ".../id"
    // Ejemplo: http://localhost:8080/usuario/1
    // como ese número (id) será tomado como parámetro, debemos usar @PathVariable
    @GetMapping(path = "/{id}")
    public Optional<UsuarioEntidad> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioServicio.obtenerPorId(id);
    }

    // agregamos la ruta ".../query"
    // en este caso usamos @RequestParam, con lo cual nuestro link se vería así:
    // "?" al final del servicio + la variable + el valor
    // http://localhost:8080/usuario/query?prioridad=5
    @GetMapping("/query")
    public ArrayList<UsuarioEntidad> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") int prioridad) {
        return this.usuarioServicio.obtenerPorPrioridad(prioridad);
    }

    @PutMapping("/{id}")
    public UsuarioEntidad modificarUsuario(@PathVariable("id") Long id, @RequestBody UsuarioEntidad usuario) {
        return this.usuarioServicio.actualizarUsuario(usuario, id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean okEliminacion = usuarioServicio.eliminarUsuario(id);
        if (okEliminacion) {
            return "Se elimino el usuario con el id " + id;
        } else {
            return "No se pudo eliminar el usuario con el id " + id;
        }
    }

}
