package br.edu.dio.desafio;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Banco {

	private String nome;
	private List<Conta> contas;

	public void cadastrarConta(Conta conta) {
		if (contas != null) {
			contas.add(conta);
		} else {
			this.contas = new ArrayList<>();
			this.contas.add(conta);
		}
	}

	public void listarContas() {
		System.out.println("=== Listagem de contas ===\n");
		for(Conta conta : contas) {
			conta.imprimirInfosComuns();
			System.out.println();
		}
	}

}
