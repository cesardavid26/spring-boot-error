package com.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;
	
	

	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Cesar", "Carvajal"));
		this.lista.add(new Usuario(2, "Javier", "Moncada"));
		this.lista.add(new Usuario(3, "Brayan", "Palomino"));
		this.lista.add(new Usuario(4, "Brayan", "Espitia"));
		this.lista.add(new Usuario(5, "Jarbir", "Mejía"));
		this.lista.add(new Usuario(6, "Carlos", "Pablos"));
		this.lista.add(new Usuario(7, "Camilo", "Boada"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario getById(Integer id) {
		Usuario resultado = null;
		
		for(Usuario u: this.lista) {
			if(u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		
		return resultado;
	}

}
