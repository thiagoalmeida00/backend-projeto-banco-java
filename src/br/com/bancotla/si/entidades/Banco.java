package br.com.bancotla.si.entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private String endereco;
	
	private List<Agencia> listaAgencias = new ArrayList<>();
	
	public Banco(String razaoSocial, String nomeFantasia, String cnpj, String endereco) {
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	public List<Agencia> getAgencias() {
		return listaAgencias;
	}
	
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
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
