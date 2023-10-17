package com.example.utnapirestfultiendaropa.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "compraItems")
@Getter
@Setter
public class CompraItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Compra compra;

    @ManyToOne
    private PrendaRopa prendaRopa;

    private Integer cantidad;
}
