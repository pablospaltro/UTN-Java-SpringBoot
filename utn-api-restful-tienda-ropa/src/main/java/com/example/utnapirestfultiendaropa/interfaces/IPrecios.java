package com.example.utnapirestfultiendaropa.interfaces;

import com.example.utnapirestfultiendaropa.entidades.PrendaRopa;

import java.util.ArrayList;
import java.util.Optional;

public interface IPrecios {

    public ArrayList<PrendaRopa> verTodasConPrecioFinal(double aumento);

    public PrendaRopa verPorIdConPrecioFinal(long id, double aumento);


}
