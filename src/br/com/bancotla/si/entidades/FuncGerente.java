package br.com.bancotla.si.entidades;

public class FuncGerente extends Funcionario {

	public static final double BONUS_SALARIO_GERENTE = 500.0;

	public FuncGerente(String nome, long cpf, double salario, int regimeContrato, int regimeHoras, double bonusSalarioGerente) {
		super(nome, cpf, salario, regimeContrato, regimeHoras);
	}

	public void calculaSalario() {
		//TODO implementar método		
	}
	
}
