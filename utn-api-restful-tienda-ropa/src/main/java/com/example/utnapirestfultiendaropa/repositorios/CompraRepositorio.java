package com.example.utnapirestfultiendaropa.repositorios;

import com.example.utnapirestfultiendaropa.entidades.Compra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepositorio extends CrudRepository<Compra, Long> {
}
