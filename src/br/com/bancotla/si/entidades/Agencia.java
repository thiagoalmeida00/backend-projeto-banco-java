package br.com.bancotla.si.entidades;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

	private String nomeAgencia;
	private int numeroAgencia;
	
	private List<Funcionario> listaFuncionarios = new ArrayList<>();
	
	private List<Conta> listaContas = new ArrayList<>();

	public Agencia(String nomeAgencia, int numeroAgencia) {
		this.nomeAgencia = nomeAgencia;
		this.numeroAgencia = numeroAgencia;
	}

	public int getFuncionarios(Agencia agencia) {
		System.out.print("Número de funcionários: ");
		return listaFuncionarios.size();
	}
	
	public List<Conta> getListaContas() {
		return listaContas;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	public String toString() {
		return "Agência: " + nomeAgencia + "\n" +
				"Número da agência: " + numeroAgencia + "\n" + "--------------------";
	}
}
