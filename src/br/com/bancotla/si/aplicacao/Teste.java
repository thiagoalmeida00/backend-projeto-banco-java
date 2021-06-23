package br.com.bancotla.si.aplicacao;

import java.util.List;
import java.util.Locale;

import br.com.bancotla.si.entidades.Agencia;
import br.com.bancotla.si.entidades.Banco;
import br.com.bancotla.si.entidades.ClientePessoaFisica;
import br.com.bancotla.si.entidades.ClientePessoaJuridica;
import br.com.bancotla.si.servicos.util.ArquivoAgenciaUtil;
import br.com.bancotla.si.servicos.util.ArquivoClientePfUtil;
import br.com.bancotla.si.servicos.util.ArquivoClientePjUtil;

// Teste de código

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Banco bancoTLA = new Banco("Banco TLA LTDA", "Banco Fácil", "01.012.345/0001-00", "Rua Getúlio Vargas, 60. Campina Grande - PB");
		
		String arquivoAgencias = "D:\\agencias.txt";
	
		List<Agencia> listaAgencias = ArquivoAgenciaUtil.carregarDeArquivo(arquivoAgencias);
		
		bancoTLA.getAgencias().addAll(listaAgencias);
		
		for (Agencia agencia : bancoTLA.getAgencias()) {
			System.out.println(agencia);	
		}
		
		System.out.println("====================================");
		
		String arquivoClientePf = "D:\\clientePf.txt";
				
		List<ClientePessoaFisica> listaClientesPf = ArquivoClientePfUtil.carregarDeArquivo(arquivoClientePf);
		
		for (ClientePessoaFisica clientePf : listaClientesPf) {
			System.out.println(clientePf);
			System.out.println("--------------------------------");
		}
		
		System.out.println("====================================");
		
		String arquivoClientePj = "D:\\clientePj.txt";
		
		List<ClientePessoaJuridica> listaClientesPj = ArquivoClientePjUtil.carregaDeArquivo(arquivoClientePj);
		
		for (ClientePessoaJuridica clientePj : listaClientesPj) {
			System.out.println(clientePj);
			System.out.println("--------------------------------");
		}
		
		System.out.println("====================================");
		
	}

}
