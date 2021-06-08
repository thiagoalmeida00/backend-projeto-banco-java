package br.com.bancotla.si.servicos;

public interface Honorario {

	static final double AUXILIO_TRANSPORTE = 200.0;
	static final double AUXILIO_ALIMENTACAO = 250.00;
	static final double AUXILIO_SAUDE = 200.00;
	static final double ENCARGOS_TRABALHISTAS = 0.08;
	
	double calculaSalario();
	
}
