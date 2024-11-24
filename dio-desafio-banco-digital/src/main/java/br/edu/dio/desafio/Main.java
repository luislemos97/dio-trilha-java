package br.edu.dio.desafio;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		var venilton = Cliente.builder().nome("Venilton").build();
		var joao = Cliente.builder().nome("João").build();

		Conta ccVenilton = new ContaCorrente(venilton);
		Conta poupancaJoao = new ContaPoupanca(joao);

		var banco = new Banco("Digital Bank", new ArrayList<>());
		banco.cadastrarConta(ccVenilton);
		banco.cadastrarConta(poupancaJoao);

		ccVenilton.depositar(100);
		ccVenilton.transferir(100, poupancaJoao);
		
		ccVenilton.imprimirExtrato();
		poupancaJoao.imprimirExtrato();

		banco.listarContas();

	}

}
