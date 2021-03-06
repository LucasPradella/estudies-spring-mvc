package br.com.pradella;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication(scanBasePackages="br.com.pradella")
public class EstudosSpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(EstudosSpringBoot1Application.class, args);
	}
}
