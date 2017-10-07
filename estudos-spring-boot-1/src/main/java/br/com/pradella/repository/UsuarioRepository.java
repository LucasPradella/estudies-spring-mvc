package br.com.pradella.repository;

import org.springframework.data.jpa.repository.JpaRepository ;
import org.springframework.transaction.annotation.Transactional;

import br.com.pradella.entities.Usuario;

@Transactional(readOnly=true)
public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

	Usuario findByEmail(String email);
	
}
