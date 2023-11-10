package com.example.appEjemplo.controller;

import com.example.appEjemplo.dto.LibroDTO;
import com.example.appEjemplo.entities.Libro;
import com.example.appEjemplo.entities.ModelResponseLista;
import com.example.appEjemplo.services.LibroService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biblioteca")
public class LibroController {

    @Autowired
    private LibroService libroserv;

    @GetMapping("/libro/vertodos")
    public ResponseEntity<ModelResponseLista> list() {
        try{
            List<Libro> list = libroserv.list();
            return ResponseEntity.status(HttpStatus.OK).body(new ModelResponseLista("Operación exitosa.", list));
        } catch (Exception e){
            List<Libro> list = null;
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ModelResponseLista("No se encontraron libros", list));
        }
    }

    @GetMapping("/libro/ver/{id}")
    public ResponseEntity<Libro> getById(@PathVariable("id") int id) {
        /*
        if (!libroserv.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        Libro libro = libroserv.getById(id).get();
        return ResponseEntity.status(HttpStatus.OK).body(libro);
        */
        try{
            Libro libro = libroserv.getById(id).get();
            return ResponseEntity.status(HttpStatus.OK).body(libro);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/libro/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!libroserv.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        libroserv.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping("/libro/crear")
    public ResponseEntity<?> create(@RequestBody LibroDTO dtolibro) {
        if (StringUtils.isBlank(dtolibro.getNombre())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        
        if (libroserv.existsByNombre(dtolibro.getNombre())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        Libro libro = new Libro(dtolibro.getNombre(), dtolibro.getAutor(), dtolibro.getEditorial(), 
                                dtolibro.getAnio(), dtolibro.isFueLeido(), dtolibro.getFormato());
        libroserv.save(libro);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/libro/editar/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody LibroDTO dtolibro) {

        if (!libroserv.existsById(id)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        if (libroserv.existsByNombre(dtolibro.getNombre()) && libroserv.getByNombre(dtolibro.getNombre()).get().getId() != id) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        if (StringUtils.isBlank(dtolibro.getNombre())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        Libro libro = libroserv.getById(id).get();
        libro.setNombre(dtolibro.getNombre());
        libro.setAutor(dtolibro.getAutor());
        libro.setEditorial(dtolibro.getEditorial());
        libro.setAnio(dtolibro.getAnio());
        libro.setFueLeido(dtolibro.isFueLeido());
        libro.setFormato(dtolibro.getFormato());

        libroserv.save(libro);
        return ResponseEntity.status(HttpStatus.OK).build();

    }

}
