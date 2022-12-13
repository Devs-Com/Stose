package com.example.stose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stose.entity.destacados;

@Repository
public interface destacadosRepositorio extends JpaRepository<destacados, Long>{

}
