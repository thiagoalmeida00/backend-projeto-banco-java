package br.com.bancotla.si.entidades;

import br.com.bancotla.si.servicos.Honorario;

public class FuncTecnico extends Funcionario implements Honorario {
	
	public FuncTecnico(String nome, long cpf, double salario, int regimeContrato, int regimeHoras) {
		super(nome, cpf, salario, regimeContrato, regimeHoras);
	}

	@Override
	public double calculaSalario() {
		double descontoEncargos = super.getSalario() * ENCARGOS_TRABALHISTAS;
		double salarioTecnico = (super.getSalario() + AUXILIO_ALIMENTACAO + AUXILIO_SAUDE 
				+ AUXILIO_TRANSPORTE) - descontoEncargos;
		return salarioTecnico;
	}
	
}
