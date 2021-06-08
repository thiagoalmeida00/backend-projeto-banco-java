package br.com.bancotla.si.entidades;

import java.util.Date;

import br.com.bancotla.si.entidades.exceptions.ValorInvalidoException;
import br.com.bancotla.si.entidades.exceptions.ValorLimiteException;

public abstract class Conta {

	public static final double IMPOSTO_FEDERAL_SAQUE = 0.50;
	
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
	
	public void sacar(double montante) throws ValorInvalidoException, ValorLimiteException {
		
		if (montante <= 0) {
			throw new ValorInvalidoException("Erro! Informe valor válido");
		}
		
		if (montante > saldo) {
			throw new ValorLimiteException("Saldo insuficiente!");
		}
		
		saldo -= montante + IMPOSTO_FEDERAL_SAQUE;
		
	}
	
	public void depositar(double montante) throws ValorInvalidoException {
		
		if (montante <= 0) {
			throw new ValorInvalidoException("Erro! Informe valor válido");
		}
		
		saldo += montante;
	}
	
	public void transferir(Conta contaDestino, double montante) throws ValorInvalidoException, ValorLimiteException {
		
		if (montante <= 0) {
			throw new ValorInvalidoException("Erro! Informe valor válido");
		}
		
		this.sacar(montante);
		contaDestino.depositar(montante);
		
	}
	
	public String extrato(Date data) {
		return "Saldo em " + new Date() + ": R$ " + String.format("%.2f", saldo);

	}
	
	public double getImpostoFederal() {
		return IMPOSTO_FEDERAL_SAQUE;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
