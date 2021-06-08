package br.com.bancotla.si.entidades;

import br.com.bancotla.si.servicos.Tributavel;

public final class ContaCorrente extends Conta implements Tributavel {

	public static final double TRIBUTO_CONTA = 0.05;
	public static final double TAXA_IMPOSTO_RENDA = 0.10;
	
	public ContaCorrente(int numeroConta, double saldo, Agencia agencia, Cliente titular) {
		super(numeroConta, saldo, agencia, titular);
	}

	@Override
	public double calculaTributos() {
		double tributoContaCorrente = super.getSaldo() * TRIBUTO_CONTA;
		return tributoContaCorrente;
	}

	@Override
	public double calculaImpostoRenda() {
		double impostoContaCorrente = super.getSaldo() * TAXA_IMPOSTO_RENDA;
		return impostoContaCorrente;
	}

	@Override
	public double calculaSaldoContaMensal() {
		double saldoContaMensal = super.getSaldo() - TAXA_MANUTENCAO_CONTA;
		return saldoContaMensal;
	}
	
}
