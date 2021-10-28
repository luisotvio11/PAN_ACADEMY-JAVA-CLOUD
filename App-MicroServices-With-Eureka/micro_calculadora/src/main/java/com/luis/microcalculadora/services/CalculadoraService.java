package com.luis.microcalculadora.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.luis.microcalculadora.WorkerFeignClient;
import com.luis.microcalculadora.model.Calculadora;
import com.luis.microcalculadora.model.Tabela;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

@Service
public class CalculadoraService {

	@Autowired
	private WorkerFeignClient workerFeignClient;

	
	
	//na calculadora deste projeto, passa duas variaveis
	public Calculadora getCalculo(long tabelaId, int dias) {
		
	
	Tabela tabelinha = workerFeignClient.findById(tabelaId).getBody();
	//2 parte do controller	
	return new Calculadora(tabelinha.getPessoa(), tabelinha.getPrecoPorDia(), dias);
}

}













