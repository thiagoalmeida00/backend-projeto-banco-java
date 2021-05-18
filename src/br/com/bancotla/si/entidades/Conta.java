package br.com.bancotla.si.entidades;

public abstract class Conta {

	private int numeroConta;
	private double saldo;
	
	private Agencia agencia;
	private Cliente titular;
	
	public Conta(int numeroConta, double saldo, Agencia agencia, Cliente titular) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.agencia = agencia;
		this.titular = titular;
	}
	
	
	
	
	
	
	
}
