package org.example;

import org.example.servicios.CentroRescateMDQ;
import org.example.servicios.GestionAnimalesMarinos;

public class Main {
    public static void main(String[] args) {

        CentroRescateMDQ centro = new CentroRescateMDQ();

        centro.gestionMenuPrincipal();

    }
}