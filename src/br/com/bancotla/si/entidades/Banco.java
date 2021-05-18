package br.com.bancotla.si.entidades;

public class Banco {

	private String razaoSocial;
	private String nomeFantasia;
	private long cnpj;
	private String endereco;

	public Banco(String razaoSocial, String nomeFantasia, long cnpj, String endereco) {
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	// TODO implementar método para listar todas as contas cadastradas
	// TODO implementar método para retornar o saldo total investido de todas as contas
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {
		return "Razão Social: " + razaoSocial + "\n" +
				"Nome Fantasia: " + nomeFantasia + "\n" +
				"CNPJ: " + cnpj + "\n" +
				"Endereço: " + endereco + "\n";
	}

}
