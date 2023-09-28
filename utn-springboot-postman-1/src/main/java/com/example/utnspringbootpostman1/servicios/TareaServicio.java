package com.example.utnspringbootpostman1.servicios;

import com.example.utnspringbootpostman1.entidades.Tarea;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TareaServicio {

    private List<Tarea> listaDeTareas;

    public TareaServicio(){
        this.listaDeTareas = new ArrayList<>();
        listaDeTareas.add(new Tarea(1, "Ordenar carpetas", false));
        listaDeTareas.add(new Tarea(2, "Completar planilla de horarios", false));
    }

    public List<Tarea> mostrartareas(){
        return listaDeTareas;
    }

    public Tarea guardarTarea(Tarea tarea){
        listaDeTareas.add(tarea);
        return tarea;
    }

    public Tarea actualizarTarea (int id, Tarea tarea){
        int index = 0;
        for(Tarea tarea1 : listaDeTareas){
            if(tarea1.getId() == id){
                tarea.setId(id);
                listaDeTareas.set(index, tarea);
            }
        }
        return tarea;
    }

    public boolean eliminarTarea (int id){
        for(Tarea tarea1 : listaDeTareas){
            if (tarea1.getId() == id){
                return listaDeTareas.remove(tarea1);
            }
        }
        return false;
    }

    public Tarea buscarTareaPorId(int id){
        for(Tarea tarea1 : listaDeTareas){
            if(tarea1.getId() == id){
                return tarea1;
            }
        }
        return null;
    }

    public Tarea marcarTareaComoCompleta(int id, Tarea tarea){
        int index = 0;
        for(Tarea tarea1 : listaDeTareas){
            if(tarea1.getId() == id){
                tarea.setCompletada(true);
                listaDeTareas.set(index, tarea);
            }
        }
        return tarea;
    }
}
