package com.desafio;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Meu sistema bancario");

		var contaCorrente = new ContaCorrente("João Carlos", 31076563058l, 5300d);
		var contaInvestimento = new ContaCorrente("João Carlos", 31076563058l, 0d);

		var bancoCorrente = new BancoCorrente("Banco Original", 10616961000189l);
		var bancoInvestimento = new BancoInvestimento("Corretora Original", 28148110000151l);

		bancoCorrente.imprimirInfos();
		bancoInvestimento.imprimirInfos();

		bancoCorrente.adicionarConta(contaCorrente);
		bancoInvestimento.adicionarConta(contaInvestimento);

		contaCorrente.imprimirInfos();
		contaInvestimento.imprimirInfos();

		contaCorrente.tranferir(1350d, contaInvestimento);

		contaCorrente.imprimirInfos();
		contaInvestimento.imprimirInfos();

		bancoCorrente.imprimirInfos();
		bancoInvestimento.imprimirInfos();
	}
}
