package br.com.bancotla.si.entidades;

public class Tecnico extends Funcionario {

	private double bonusSalarioTecnico;

	public Tecnico(String nome, long cpf, double salario, int regimeContrato, int regimeHoras,
			double bonusSalarioTecnico) {
		super(nome, cpf, salario += bonusSalarioTecnico, regimeContrato, regimeHoras);
		this.bonusSalarioTecnico = bonusSalarioTecnico;
	}

	public double getBonusSalarioTecnico() {
		return bonusSalarioTecnico;
	}

	public void setBonusSalarioTecnico(double bonusSalarioTecnico) {
		this.bonusSalarioTecnico = bonusSalarioTecnico;
	}
	
}
