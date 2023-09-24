package com.example.utnspringbootapirest2.servicios;

import com.example.utnspringbootapirest2.entidades.AuthorInfo;
import com.example.utnspringbootapirest2.entidades.Libro;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class LibroServicio {

    Libro libro = new Libro();

    public String mostrarTitulo(){
        String tituloEncontrado = null;
        try {
            URL url = new URL("https://openlibrary.org/works/OL45804W.json");
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.connect();
            int respuestaCodigo = conexion.getResponseCode();
            if (respuestaCodigo != 200) {
                throw new RuntimeException("Ocurrió un error " + respuestaCodigo);
            } else {
                InputStreamReader inputStreamReader = new InputStreamReader(conexion.getInputStream());
                Gson gson = new Gson();
                Libro libro = gson.fromJson(inputStreamReader, Libro.class);
                tituloEncontrado = libro.getTitle();
                inputStreamReader.close();
                conexion.disconnect();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tituloEncontrado;
    }

    public String mostrarAutor(){
        AuthorInfo[] autorEncontrado = null;
        try {
            URL url = new URL("https://openlibrary.org/works/OL45804W.json");
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.connect();
            int respuestaCodigo = conexion.getResponseCode();
            if (respuestaCodigo != 200) {
                throw new RuntimeException("Ocurrió un error " + respuestaCodigo);
            } else {
                InputStreamReader inputStreamReader = new InputStreamReader(conexion.getInputStream());
                Gson gson = new Gson();
                Libro libro = gson.fromJson(inputStreamReader, Libro.class);
                autorEncontrado = libro.getAuthors();
                inputStreamReader.close();
                conexion.disconnect();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        String autorEncontradoJson = gson.toJson(autorEncontrado);

        return autorEncontradoJson;
    }

    public String mostrarDescripcionLibro(){
        String descripcionEncontrada = null;
        try {
            URL url = new URL("https://openlibrary.org/works/OL45804W.json");
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.connect();
            int respuestaCodigo = conexion.getResponseCode();
            if (respuestaCodigo != 200) {
                throw new RuntimeException("Ocurrió un error " + respuestaCodigo);
            } else {
                InputStreamReader inputStreamReader = new InputStreamReader(conexion.getInputStream());
                Gson gson = new Gson();
                Libro libro = gson.fromJson(inputStreamReader, Libro.class);
                descripcionEncontrada = libro.getDescription();
                inputStreamReader.close();
                conexion.disconnect();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return descripcionEncontrada;
    }
}
