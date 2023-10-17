package com.example.utnapirestfultiendaropa.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "clientes")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String telefono;
    private String metodoDePago;

    @OneToOne(mappedBy = "cliente")
    private Compra carrito;
}
