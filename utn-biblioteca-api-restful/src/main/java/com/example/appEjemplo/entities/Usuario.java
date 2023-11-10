package com.example.appEjemplo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@Entity
public class Usuario {
    @Id
    private Long id;

    private String nombre;
    private String email;


}
