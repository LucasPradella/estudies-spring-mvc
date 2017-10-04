package br.com.pradella.jpa;

import org.springframework.data.jpa.repository.JpaRepository ;

public interface EmpresaRepository extends JpaRepository<Empresa , Long>  {
	
	Empresa findByCnpj(String cnpj);

}
