package br.com.bancotla.si.entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String razaoSocial;
	private String nomeFantasia;
	private long cnpj;
	private String endereco;
	
	private List<Agencia> agencias = new ArrayList<>();

	public Banco(String razaoSocial, String nomeFantasia, long cnpj, String endereco) {
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public List<Agencia> getAgencias() {
		return agencias;
	}
	
	// TODO implementar m�todo para listar todas as contas cadastradas
	// TODO implementar m�todo para retornar o saldo total investido de todas as contas
	
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
		return "Raz�o Social: " + razaoSocial + "\n" +
				"Nome Fantasia: " + nomeFantasia + "\n" +
				"CNPJ: " + cnpj + "\n" +
				"Endere�o: " + endereco + "\n";
	}

}
