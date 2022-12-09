package com.example.stose.services;

import java.util.Arrays;

import com.example.stose.dto.UsuarioRegistroDTO;
import com.example.stose.model.Usuario;
import com.example.stose.model.Rol;
import com.example.stose.repositories.UsuarioRepositorio;

public class UsuarioServicioImpl implements UsuarioServicio{
	
	private UsuarioRepositorio usuarioRepositorio;
	
	public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
		super();
		this.usuarioRepositorio = usuarioRepositorio;
	}

	@Override
	public Usuario guardar(UsuarioRegistroDTO registroDTO) {
		Usuario usuario = new Usuario(registroDTO.getNombre(), 
				registroDTO.getApellido(),registroDTO.getEmail(),
				registroDTO.getPassword(),Arrays.asList(new Rol("ROLE_USER")));
		return usuarioRepositorio.save(usuario);
	}
}
