package com.desafio;

import java.util.ArrayList;
import java.util.List;

public abstract class Banco {
	private String nome;
	private Long cnpj;
	private List<Conta> contas;

	public Banco(String nome, Long cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void imprimirInfos() {
		System.out.println("========================================");
		System.out.println("O Banco: " + this.nome);
		System.out.println("De CNPJ: " + this.cnpj);
		System.out.println("Possui " + this.contas.size() + " contas");		
	}
}
