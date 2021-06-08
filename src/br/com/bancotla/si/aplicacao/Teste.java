package br.com.bancotla.si.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

import br.com.bancotla.si.entidades.Agencia;
import br.com.bancotla.si.entidades.Banco;
import br.com.bancotla.si.entidades.Cliente;
import br.com.bancotla.si.entidades.ClientePessoaFisica;
import br.com.bancotla.si.entidades.ClientePessoaJuridica;
import br.com.bancotla.si.entidades.Conta;
import br.com.bancotla.si.entidades.ContaCorrente;
import br.com.bancotla.si.entidades.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Banco bancoTLA = new Banco("Banco TLA LTDA", "Banco F�cil", "01.012.345/0001-00", "Rua Get�lio Vargas, 60. Campina Grande - PB");
		
		String arquivoAgencias = "D:\\agencias.txt";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoAgencias))) {

			String linhaCsv = bufferedReader.readLine();
			while (linhaCsv != null) {

				String[] fields = linhaCsv.split(",");
				String nomeAgencia = fields[0];
				int numeroAgencia = Integer.parseInt(fields[1]);

				bancoTLA.getAgencias().add(new Agencia(nomeAgencia, numeroAgencia));

				linhaCsv = bufferedReader.readLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		for (Agencia agencia : bancoTLA.listaAgencias) {
			System.out.println(agencia);	
		}
		
		System.out.println("====================================");
		
		String arquivoClientePf = "D:\\clientePf.txt";
		
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoClientePf))) {

			String linhaCsv = bufferedReader.readLine();
			while (linhaCsv != null) {

				String[] fields = linhaCsv.split(",");
				int numeroDeCliente = Integer.parseInt(fields[0]);
				String nome = fields[1];
				String endereco = fields[2];
				String cpf = fields[3];
				double rendaMensal = Double.parseDouble(fields[4]);
				
				// DUVIDA >>> pr�tica correta sem atribuir a uma vari�vel?? ERRO ao atribuir erro no programa
				bancoTLA.getAgencias().get(0).getListaClientes().add(new ClientePessoaFisica(numeroDeCliente, nome, endereco, cpf, rendaMensal));
				
				linhaCsv = bufferedReader.readLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		// DUVIDA >>> sintaxe do for para lista de cliente (pf ou cliente gen�rico / in variavel)
		for (Cliente cliente : bancoTLA.getAgencias().get(0).getListaClientes()) {
			System.out.println(cliente);
			System.out.println("--------------------------------");
		}
		
		System.out.println("====================================");
		
		// DUVIDA >>> reconhecimento de caracteres especiais do arquivo CSV
		
		String arquivoClientePj = "D:\\clientePj.txt";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoClientePj))) {

			String linhaCsv = bufferedReader.readLine();
			while (linhaCsv != null) {

				String[] fields = linhaCsv.split(",");
				int numeroDeCliente = Integer.parseInt(fields[0]);
				String razaoSocial = fields[1];
				String endereco = fields[2];
				String cnpj = fields[3];
				long inscricaoMunicipal = Long.parseLong(fields[4]);
				double mediaFaturamentoAnual = Double.parseDouble(fields[5]);
				
				// DUVIDA >>> pr�tica correta sem atribuir a uma vari�vel?? ERRO ao atribuir erro no programa
				bancoTLA.getAgencias().get(0).getListaClientes().add(new ClientePessoaJuridica(numeroDeCliente, razaoSocial, endereco, cnpj, inscricaoMunicipal, mediaFaturamentoAnual));
				
				linhaCsv = bufferedReader.readLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		for (Cliente cliente : bancoTLA.getAgencias().get(0).getListaClientes()) {
			System.out.println(cliente);
			System.out.println("--------------------------------");
		}
		
		System.out.println("====================================");
		
		// DUVIDA >>> impress�o de caracteres especiais no console
		
		// TODO inserir contas e testar m�todos (polimorfismo..)

		// DUVIDA >>> tem outra forma mais enxuta de instanciar o construtor com parametros tipo Classe (Agencia e Cliente)?
		ContaCorrente contaCorrentePf01 = new ContaCorrente(1101, 20000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(0));
		ContaCorrente contaCorrentePf02 = new ContaCorrente(1102, 5000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(1));
		ContaCorrente contaCorrentePf03 = new ContaCorrente(1103, 8000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(2));
		
		ContaPoupanca contaPoupancaPf01 = new ContaPoupanca(2101, 8000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(3));
		ContaPoupanca contaPoupancaPf02 = new ContaPoupanca(2102, 15000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(4));
		
		bancoTLA.listaAgencias.get(0).getListaContas().add(contaCorrentePf01);
		bancoTLA.listaAgencias.get(0).getListaContas().add(contaCorrentePf02);
		bancoTLA.listaAgencias.get(0).getListaContas().add(contaCorrentePf03);
		bancoTLA.listaAgencias.get(0).getListaContas().add(contaPoupancaPf01);
		bancoTLA.listaAgencias.get(0).getListaContas().add(contaPoupancaPf02);
		
		ContaCorrente contaCorrentePj01 = new ContaCorrente(1101, 20000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(0));
		ContaCorrente contaCorrentePj02 = new ContaCorrente(1102, 5000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(1));
		ContaCorrente contaCorrentePj03 = new ContaCorrente(1103, 8000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(2));
		
		bancoTLA.listaAgencias.get(0).getListaContas().add(contaCorrentePj01);
		bancoTLA.listaAgencias.get(0).getListaContas().add(contaCorrentePj02);
		bancoTLA.listaAgencias.get(0).getListaContas().add(contaCorrentePj03);
		
		System.out.println(contaCorrentePf01.calculaTributos());
		System.out.println(contaCorrentePf02.calculaSaldoContaMensal());
		System.out.println(contaCorrentePf03.extrato());
		
	}

}
