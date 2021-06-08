package br.com.bancotla.si.servicos;

public interface Tributavel {

	public static final double TAXA_MANUTENCAO_CONTA = 25.0;
	
	double calculaTributos();
	
	double calculaImpostoRenda();
	
	double calculaSaldoContaMensal();
		
}
