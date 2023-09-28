package com.example.utnspringbootpostman1.controladores;

import com.example.utnspringbootpostman1.entidades.Tarea;
import com.example.utnspringbootpostman1.servicios.TareaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/listaDeTareas")
public class TareaControlador {

    @Autowired
    private TareaServicio tareaServicio;

    public TareaControlador(TareaServicio tareaServicio){
        this.tareaServicio = tareaServicio;
    }

    @GetMapping
    public Iterable<Tarea> mostrarTareas(){
        return tareaServicio.mostrartareas();
    }

    @GetMapping("/{id}")
    public Tarea obtenerTareaPorId(@PathVariable("id") int id){
        return tareaServicio.buscarTareaPorId(id);
    }

    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea tarea){
        return tareaServicio.guardarTarea(tarea);
    }

    @PutMapping("/{id}")
    public Tarea actualizarTarea(@PathVariable("id") int id, @RequestBody Tarea tarea){
        return tareaServicio.actualizarTarea(id, tarea);
    }

    @PutMapping("/{id}")
    public Tarea marcarTareaCompleta(@PathVariable("id") int id, @RequestBody Tarea tarea){
        return tareaServicio.marcarTareaComoCompleta(id, tarea);
    }

    @DeleteMapping("/{id}")
    public boolean eliminarTarea(@PathVariable("id") int id){
        return tareaServicio.eliminarTarea(id);
    }



}
