package br.com.pradella.services;

import java.util.Optional;

import br.com.pradella.entities.Usuario;

public interface UsuarioService {

	Optional<Usuario> buscaPorEmail(String email);
	
}
