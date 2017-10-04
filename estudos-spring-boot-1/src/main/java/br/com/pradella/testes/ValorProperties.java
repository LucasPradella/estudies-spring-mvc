package br.com.pradella.testes;

import org.springframework.beans.factory.annotation.Value;

public class ValorProperties {

	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina ;
	
	
	
	public int getQtdPorPagina() {
		return qtdPorPagina;
	}
	

}
