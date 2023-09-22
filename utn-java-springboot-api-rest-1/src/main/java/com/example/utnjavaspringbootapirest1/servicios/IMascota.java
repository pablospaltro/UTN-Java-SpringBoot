package com.example.utnjavaspringbootapirest1.servicios;

import com.example.utnjavaspringbootapirest1.entidades.Mascota;
import org.springframework.stereotype.Service;

@Service
public interface IMascota {

    public void crearMascotas();

    public String mostrarMensajeMascota(String mascota, int id);
}
