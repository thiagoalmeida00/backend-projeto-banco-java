package br.com.bancotla.si.entidades;

public abstract class Funcionario {

	private String nome;
	private long cpf;
	private double salario;
	private int regimeContrato;
	private int regimeHoras;
	
	public Funcionario(String nome, long cpf, double salario, int regimeContrato, int regimeHoras) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.regimeContrato = regimeContrato;
		this.regimeHoras = regimeHoras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getRegimeContrato() {
		return regimeContrato;
	}

	public void setRegimeContrato(int regimeContrato) {
		this.regimeContrato = regimeContrato;
	}

	public int getRegimeHoras() {
		return regimeHoras;
	}

	public void setRegimeHoras(int regimeHoras) {
		this.regimeHoras = regimeHoras;
	}
	
	public String toString() {
		return "Nome: " + nome + "\n" +
				"CPF: " + cpf + "\n" +
				"Salário: " + String.format("%;2f", salario) + "\n" +
				"Regime de contratação: " + regimeContrato + "\n" +
				"Regime de horas semanais: " + regimeHoras + "\n";
	}
	
}
