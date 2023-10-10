package com.example.utnapirestfultiendaropa.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prendasDeRopa")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class PrendaRopa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private int stock;
    private double precio;

    /*
    @OneToOne(cascade = CascadeType.ALL)
    private Precio precio;

     */
}
