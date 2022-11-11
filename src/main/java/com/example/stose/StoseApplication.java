package com.example.stose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.stose.entidad.Libro;
import com.example.stose.repositorio.LibroRepositorio;

@SpringBootApplication
public class StoseApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StoseApplication.class, args);
	}

	@Autowired
	private LibroRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
	 

	}

}
