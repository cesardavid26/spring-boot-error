package com.springboot.error.app.services;

import java.util.List;

import com.springboot.error.app.models.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();
	public Usuario getById(Integer id);
}
