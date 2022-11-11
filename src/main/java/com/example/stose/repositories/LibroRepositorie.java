package com.example.stose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stose.entity.Libro;

@Repository
public interface LibroRepositorie extends JpaRepository<Libro, Long>{

}
