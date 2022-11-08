package com.example.stose.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stose.entidad.Libro;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long>{

}
