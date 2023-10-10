package com.example.utnapirestfultiendaropa.repositorios;

import com.example.utnapirestfultiendaropa.entidades.PrendaRopa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PrendaRopaRepositorio extends CrudRepository<PrendaRopa, Long> {

    public abstract PrendaRopa findById(long id);

}
