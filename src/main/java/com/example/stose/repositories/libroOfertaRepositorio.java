package com.example.stose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stose.entity.libroOferta;

@Repository
public interface libroOfertaRepositorio extends JpaRepository<libroOferta, Long>{

}
