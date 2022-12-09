package com.example.stose.services;

import com.example.stose.dto.UsuarioRegistroDTO;
import com.example.stose.model.Usuario;

public interface UsuarioServicio {

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
}
