package com.example.stose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stose.entity.TendenciaRight;

@Repository
public interface TendenciaRightRepositorio extends JpaRepository<TendenciaRight, Long>{

}
