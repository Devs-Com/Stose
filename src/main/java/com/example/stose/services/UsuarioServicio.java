package com.example.stose.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.stose.dto.UsuarioRegistroDTO;
import com.example.stose.model.Usuario;

public interface UsuarioServicio extends UserDetailsService{

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
	public List<Usuario> listarUsuarios();
}