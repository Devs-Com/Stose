package com.example.stose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stose.entity.TendenciaLeft;

@Repository
public interface TendenciaLeftRepositorio extends JpaRepository<TendenciaLeft, Long>{

}
