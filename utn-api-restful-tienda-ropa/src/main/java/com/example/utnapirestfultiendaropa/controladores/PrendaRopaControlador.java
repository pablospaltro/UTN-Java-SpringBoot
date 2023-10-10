package com.example.utnapirestfultiendaropa.controladores;

import com.example.utnapirestfultiendaropa.entidades.PrendaRopa;
import com.example.utnapirestfultiendaropa.servicios.PrendaRopaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/tiendaDeRopa")
public class PrendaRopaControlador {

    @Autowired
    PrendaRopaServicio prendaRopaServicio;


    // --- métodos para el COMERCIANTE:
    @PostMapping("/comerciante/agregar")
    public PrendaRopa agregarPrenda(@RequestBody PrendaRopa prenda) {
        return this.prendaRopaServicio.guardarPrenda(prenda);
    }
    @GetMapping("/comerciante/ver")
    public ArrayList<PrendaRopa> verPrendasComoComerciante() {
        return prendaRopaServicio.verTodasConPrecioCosto();
    }
    @GetMapping(path = "/comerciante/ver/id/{id}")
    public Optional<PrendaRopa> verPrendaComoComerciante(@PathVariable("id") Long id){
        return this.prendaRopaServicio.verPorIdConPrecioCosto(id);
    }
    @PutMapping("/comerciante/modificar/id/{id}")
    public PrendaRopa modificarPrenda(@PathVariable("id") Long id, @RequestBody PrendaRopa prendaModificada) {
        return this.prendaRopaServicio.actualizarPrenda(prendaModificada, id);
    }
    @DeleteMapping(path = "/comerciante/eliminar/id/{id}")
    public String eliminarPrendaPorId(@PathVariable("id") Long id) {
        boolean prendaEliminada = prendaRopaServicio.eliminarPrenda(id);
        if (prendaEliminada) {
            return "Se elimino la prenda con el id " + id;
        } else {
            return "No se pudo eliminar la prenda con el id " + id;
        }
    }


    // --- métodos para el CLIENTE:
    // establecer el numero
    @GetMapping("/cliente/ver")
    public ArrayList<PrendaRopa> verPrendasComoCliente() {
        return prendaRopaServicio.verTodasConPrecioFinal(50);
    }
    @GetMapping(path = "/cliente/ver/id/{id}")
    public PrendaRopa verPrendaComoCLiente(@PathVariable("id") Long id){
        return this.prendaRopaServicio.verPorIdConPrecioFinal(id, 50);
    }
}
