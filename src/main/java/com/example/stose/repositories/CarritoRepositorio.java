package com.example.stose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stose.entity.Carrito;

@Repository
public interface CarritoRepositorio extends JpaRepository<Carrito, Long>{
    
}
