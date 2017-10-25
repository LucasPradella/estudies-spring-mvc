package br.com.pradella.Cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory ;
import org.springframework.cache.annotation.Cacheable ;
import org.springframework.stereotype.Service ;

@Service
public class ExemploCacheService {

	private static final Logger LOGGER = LoggerFactory.getLogger("ExemploCacheService");

	@Cacheable("exemploCache")
	public String exemploCache() {
		LOGGER.info("### Executando o serviço...");
		return "Teste de exemplo de cache";
	}

}
