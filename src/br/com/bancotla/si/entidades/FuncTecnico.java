package br.com.bancotla.si.entidades;

public class FuncTecnico extends Funcionario {

	private double bonusSalarioTecnico;

	public FuncTecnico(String nome, long cpf, double salario, int regimeContrato, int regimeHoras,
			double bonusSalarioTecnico) {
		super(nome, cpf, salario, regimeContrato, regimeHoras);
		this.bonusSalarioTecnico = bonusSalarioTecnico;
	}

	// colocar bonus como uma constante
	public double getBonusSalarioTecnico() {
		return bonusSalarioTecnico;
	}

	public void setBonusSalarioTecnico(double bonusSalarioTecnico) {
		this.bonusSalarioTecnico = bonusSalarioTecnico;
	}
	
}
