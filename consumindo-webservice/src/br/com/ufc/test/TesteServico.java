package br.com.ufc.test;

import java.io.IOException;

import br.com.ufc.model.CEP;
import br.com.ufc.service.CepService;

public class TesteServico {

	public static void main(String[] args) throws IOException {
		CEP cep = new CepService("63900061").retornarCEP();
		System.out.println("Retorno: " + cep.getBairro());
	}
}
