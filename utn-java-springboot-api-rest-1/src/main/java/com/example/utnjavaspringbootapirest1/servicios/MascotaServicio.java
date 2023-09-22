package com.example.utnjavaspringbootapirest1.servicios;

import com.example.utnjavaspringbootapirest1.entidades.Gato;
import com.example.utnjavaspringbootapirest1.entidades.Mascota;
import com.example.utnjavaspringbootapirest1.entidades.Perro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MascotaServicio implements IMascota {

    ArrayList <Perro> perros = new ArrayList<>();
    ArrayList <Gato> gatos = new ArrayList<>();

    @Override
    public void crearMascotas() {

        Perro perro1 = new Perro(1, "Roco", "Callejero", "Guau");
        Perro perro2 = new Perro(2, "Lola", "Pitbull", "Auuuuuu");
        Perro perro3 = new Perro(3, "Claudio", "Dalmata", "Bark");
        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);

        Gato gato1 = new Gato(1, "Rita", "Siames", "Miau");
        Gato gato2 = new Gato(2, "Morena", "Callejero", "Maumaumau");
        Gato gato3 = new Gato(3, "Garfield", "Felino", "Miiiiiuuu");
        gatos.add(gato1);
        gatos.add(gato2);
        gatos.add(gato3);
    }

    @Override
    public String mostrarMensajeMascota(String tipoMascota, int id) {
        String mensaje= "vacio";
        crearMascotas();
        if ("perro".equals(tipoMascota)) {
            for (Perro perro : perros) {
                if (perro.getId() == id) {
                    mensaje = perro.getMensaje();
                    return mensaje;
                }
            }
        } else if ("gato".equals(tipoMascota)) {
            for (Gato gato : gatos) {
                if (gato.getId() == id) {
                    mensaje = gato.getMensaje();
                    return mensaje;
                }
            }
        }

        return mensaje;
    }
}
