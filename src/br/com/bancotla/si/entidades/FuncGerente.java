package br.com.bancotla.si.entidades;

import br.com.bancotla.si.servicos.Honorario;

public class FuncGerente extends Funcionario implements Honorario {

	public static final double GRATIFICACAO_SALARIO_GERENTE = 500.0;
	
	public FuncGerente(String nome, long cpf, double salario, int regimeContrato, int regimeHoras, double bonusSalarioGerente) {
		super(nome, cpf, salario, regimeContrato, regimeHoras);
	}
	
	@Override
	public double calculaSalario() {
		double descontoEncargos = super.getSalario() * ENCARGOS_TRABALHISTAS;
		double salarioGerente = (super.getSalario() + GRATIFICACAO_SALARIO_GERENTE + AUXILIO_ALIMENTACAO 
				+ AUXILIO_SAUDE + AUXILIO_TRANSPORTE) - descontoEncargos;
		return salarioGerente;
	}
	
}
