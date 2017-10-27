package br.com.pradella.Mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository ;
import org.springframework.data.mongodb.repository.Query ;

import br.com.pradella.entities.ClienteMongo;


public interface ClienteRepository extends MongoRepository<ClienteMongo, String> {
	
	ClienteMongo findByNome(String nome);

	@Query("{'idade':{ $gt: ?0, $lt: ?1 }}")
	List<ClienteMongo> findByIdadeBetween(int idadeInicial, int idadeFinal);
	
	
}