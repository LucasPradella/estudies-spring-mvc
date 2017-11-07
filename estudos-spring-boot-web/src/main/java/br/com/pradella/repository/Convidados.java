package br.com.pradella.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pradella.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

	
	
}
