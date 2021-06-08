package br.com.bancotla.si.entidades;

public abstract class Cliente {
	
	private int numeroDeCliente;
	
	public Cliente(int numeroDeCliente) {
		this.numeroDeCliente = numeroDeCliente;
	}
	
	public int getNumeroDeCliente() {
		return numeroDeCliente;
	}
	
	public void setNumeroDeCliente(int numeroDeCliente) {
		this.numeroDeCliente = numeroDeCliente;
	}
	
}
