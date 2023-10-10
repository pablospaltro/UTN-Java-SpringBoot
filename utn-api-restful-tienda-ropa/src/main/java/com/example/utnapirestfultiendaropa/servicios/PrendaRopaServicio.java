package com.example.utnapirestfultiendaropa.servicios;

import com.example.utnapirestfultiendaropa.entidades.PrendaRopa;
import com.example.utnapirestfultiendaropa.interfaces.IPrecios;
import com.example.utnapirestfultiendaropa.repositorios.PrendaRopaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PrendaRopaServicio implements IPrecios{

    @Autowired
    PrendaRopaRepositorio prendaRopaRepositorio;


    // --- métodos para el COMERCIANTE:

    public PrendaRopa guardarPrenda(PrendaRopa prenda) {
        return prendaRopaRepositorio.save(prenda);
    }
    public ArrayList<PrendaRopa> verTodasConPrecioCosto() {
        return (ArrayList<PrendaRopa>) prendaRopaRepositorio.findAll();
    }
    public Optional<PrendaRopa> verPorIdConPrecioCosto(Long id) {
        return prendaRopaRepositorio.findById(id);
    }
    public PrendaRopa actualizarPrenda(PrendaRopa prendaModificada, Long id) {
        PrendaRopa prendaAActualizar = prendaRopaRepositorio.findById(id).get();
        prendaAActualizar.setNombre(prendaModificada.getNombre());
        prendaAActualizar.setStock(prendaModificada.getStock());
        prendaAActualizar.setPrecio(prendaModificada.getPrecio());
        return prendaRopaRepositorio.save(prendaAActualizar);
    }
    public boolean eliminarPrenda(Long id) {
        try {
            prendaRopaRepositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // --- métodos para el CLIENTE:

    @Override
    public ArrayList<PrendaRopa> verTodasConPrecioFinal(double porcentajeDeAumento) {
        ArrayList<PrendaRopa> prendas = (ArrayList<PrendaRopa>) prendaRopaRepositorio.findAll();
        aplicarAumentoALista(prendas, porcentajeDeAumento);
        return prendas;
    }
    @Override
    public PrendaRopa verPorIdConPrecioFinal(long id, double porcentajeDeAumento) {
        PrendaRopa prendaEncontrada = prendaRopaRepositorio.findById(id);
        aplicarAumentoAPrenda(prendaEncontrada, porcentajeDeAumento);
        return prendaEncontrada;
    }

    // --- metodos para mostrar precio final al CLIENTE:

    private void aplicarAumentoAPrenda(PrendaRopa prenda, double porcentajeDeAumento) {
        double factorDeAumento = 1 + (porcentajeDeAumento / 100);
        prenda.setPrecio(prenda.getPrecio() * factorDeAumento);
    }
    private void aplicarAumentoALista(ArrayList<PrendaRopa> prendas, double porcentajeDeAumento) {
        for (PrendaRopa prenda : prendas) {
            aplicarAumentoAPrenda(prenda, porcentajeDeAumento);
        }
    }
}
