package com.example.utnapirestfultiendaropa.repositorios;

import com.example.utnapirestfultiendaropa.entidades.CompraItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraItemRepositorio extends CrudRepository<CompraItem, Long> {
}
