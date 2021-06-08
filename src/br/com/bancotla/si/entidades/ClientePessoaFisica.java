package br.com.bancotla.si.entidades;

public final class ClientePessoaFisica extends Cliente {

	private String nome;
	private String endereco;
	private long cpf;
	private double rendaMensal;

	public ClientePessoaFisica(int numeroDeCliente, String nome, String endereco, long cpf, double rendaMensal) {
		super(numeroDeCliente);
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.rendaMensal = rendaMensal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public double getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	
	public String toString() {
		return "Número de Cliente: " + super.getNumeroDeCliente() + "\n" +
				"Nome:  " + nome + "\n" +
				"Endereço: " + endereco + "\n" +
				"CPF: " + cpf +
				"Renda Mensal (R$): " + String.format("%.2f", rendaMensal);
	}
	
}
