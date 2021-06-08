package br.com.bancotla.si.entidades;

import br.com.bancotla.si.servicos.Tributavel;

public final class ContaPoupanca extends Conta implements Tributavel {

	public static final double TRIBUTO_POUPANCA = 0.01;
	public static final double TAXA_IMPOSTO_RENDA = 0.03;
	
	public ContaPoupanca(int numeroConta, double saldo, Agencia agencia, Cliente titular) {
		super(numeroConta, saldo, agencia, titular);
	}
	
	@Override
	public double calculaTributos() {
		double tributoPoupanca = super.getSaldo() * TRIBUTO_POUPANCA;
		return tributoPoupanca;
	}

	@Override
	public double calculaImpostoRenda() {
		double impostoRendaPoupanca = super.getSaldo() * TAXA_IMPOSTO_RENDA;
		return impostoRendaPoupanca;
	}

	@Override
	public double calculaSaldoContaMensal() {
		double saldoContaMensal = super.getSaldo() - TAXA_MANUTENCAO_CONTA;
		return saldoContaMensal;
	}	
	
}
