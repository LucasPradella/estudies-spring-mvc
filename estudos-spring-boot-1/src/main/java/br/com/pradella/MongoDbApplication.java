package br.com.pradella;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import br.com.pradella.Mongo.ClienteRepository;
import br.com.pradella.entities.ClienteMongo;

/*@SpringBootApplication(scanBasePackages="br.com.pradella")*/
public class MongoDbApplication {

	@Autowired
	private ClienteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}

	public void run(String... args) throws Exception {
		repository.deleteAll();
		repository.save(new ClienteMongo("Alice", 20));
		repository.save(new ClienteMongo("João", 30));
		repository.save(new ClienteMongo("Maria", 40));
		System.out.println("Lista todos com o findAll():");
		System.out.println("-------------------------------");
		repository.findAll().forEach(System.out::println);
		System.out.println();
		System.out.println("Busca um único cliente com o findByNome('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByNome("Alice"));
		System.out.println();
		System.out.println("Clientes com idade entre 18 and 35:");
		System.out.println("--------------------------------");
		repository.findByIdadeBetween(18, 35).forEach(System.out::println);
	}

}
