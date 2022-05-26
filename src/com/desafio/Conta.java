package com.desafio;

public abstract class Conta {
	private static int SEQUENCIAL = 1;

	private String nomeCliente;
	private Long cpfCliente;
	private Integer numeroConta;
	private Double saldoConta;

	public Conta(String nomeCliente, Long cpfCliente, Double saldoInicial) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.numeroConta = SEQUENCIAL++;
		this.saldoConta = saldoInicial;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public Long getCpfCliente() {
		return cpfCliente;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}
	
	public void sacar(Double valor) {
		this.saldoConta = this.saldoConta - valor;
	}
	
	public void depositar(Double valor) {
		this.saldoConta = this.saldoConta + valor;
	}
	
	public void tranferir(Double valor, Conta contaDestino) {
		System.out.println("========================================");
		System.out.println("Transferindo da conta: " + this.numeroConta);
		System.out.println("Para conta: " + contaDestino.getNumeroConta());
		this.saldoConta = this.saldoConta - valor;
		contaDestino.depositar(valor);
	}

	public void imprimirInfos() {
		System.out.println("========================================");
		System.out.println("Conta de número: " + this.numeroConta);
		System.out.println("Titular: " + this.nomeCliente);
		System.out.println("Portador do CPF: " + this.cpfCliente);
		System.out.println(String.format("Possui um Saldo de RS: %.2f", this.saldoConta));
	}
}
