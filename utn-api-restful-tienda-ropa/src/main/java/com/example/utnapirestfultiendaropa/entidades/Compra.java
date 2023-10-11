package com.example.utnapirestfultiendaropa.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "compras")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private PrendaRopa prendaComprada;

    private int cantidadComprada;

}
