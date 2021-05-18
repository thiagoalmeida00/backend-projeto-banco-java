package br.com.bancotla.si.entidades;

public class Gerente extends Funcionario {

	private double bonusSalarioGerente;

	public Gerente(String nome, long cpf, double salario, int regimeContrato, int regimeHoras, double bonusSalarioGerente) {
		super(nome, cpf, salario += bonusSalarioGerente, regimeContrato, regimeHoras);
		this.bonusSalarioGerente = bonusSalarioGerente;
	}

	public double getAdicionalDeSalario() {
		return bonusSalarioGerente;
	}

	public void setAdicionalDeSalario(double bonusSalarioGerente) {
		this.bonusSalarioGerente = bonusSalarioGerente;
	}
	
}
