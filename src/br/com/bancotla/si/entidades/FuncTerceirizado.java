package br.com.bancotla.si.entidades;

public class FuncTerceirizado extends Funcionario {

	private String empresa;

	public FuncTerceirizado(String nome, long cpf, double salario, int regimeContrato, int regimeHoras, String empresa) {
		super(nome, cpf, salario, regimeContrato, regimeHoras);
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public String toString() {
		return "Nome: " + super.getNome() + "\n" +
				"CPF: " + super.getCpf() + "\n" +
				"Salário: " + String.format("%;2f", super.getSalario()) + "\n" +
				"Regime de contratação: " + super.getRegimeContrato() + "\n" +
				"Regime de horas semanais: " + super.getRegimeHoras() + "\n" +
				"Empresa: " + empresa + "\n";
	}
	
}
