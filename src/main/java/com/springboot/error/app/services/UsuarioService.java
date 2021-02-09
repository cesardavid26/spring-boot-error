package com.springboot.error.app.services;

import java.util.List;
import java.util.Optional;

import com.springboot.error.app.models.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();
	public Usuario getById(Integer id);
	public Optional<Usuario> obtenerById(Integer id);
}
