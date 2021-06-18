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
		
		Banco bancoTLA = new Banco("Banco TLA LTDA", "Banco Fácil", "01.012.345/0001-00", "Rua Getúlio Vargas, 60. Campina Grande - PB");
		
		String arquivoAgencias = "D:\\agencias.txt";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoAgencias))) {

			String linhaCsv = bufferedReader.readLine();
			while (linhaCsv != null) {
				
				String[] fields = linhaCsv.split(", ");
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

				String[] fields = linhaCsv.split(", ");
				int numeroDeCliente = Integer.parseInt(fields[0]);
				String nome = fields[1];
				String endereco = fields[2];
				String cpf = fields[3];
				double rendaMensal = Double.parseDouble(fields[4]);
				
				bancoTLA.getAgencias().get(0).getListaClientes().add(new ClientePessoaFisica(numeroDeCliente, nome, endereco, cpf, rendaMensal));
				
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
		
		String arquivoClientePj = "D:\\clientePj.txt";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoClientePj))) {

			String linhaCsv = bufferedReader.readLine();
			while (linhaCsv != null) {

				String[] fields = linhaCsv.split(", ");
				int numeroDeCliente = Integer.parseInt(fields[0]);
				String razaoSocial = fields[1];
				String endereco = fields[2];
				String cnpj = fields[3];
				long inscricaoMunicipal = Long.parseLong(fields[4]);
				double mediaFaturamentoAnual = Double.parseDouble(fields[5]);
				
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
		
		String contaCorrente = "D:\\cc.txt";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(contaCorrente))) {

			String linhaCsv = bufferedReader.readLine();
			
			int contagemTitular = 0;
			while (linhaCsv != null) {

				String[] fields = linhaCsv.split(", ");
				int numeroConta = Integer.parseInt(fields[0]);
				double saldo = Double.parseDouble(fields[1]);
				Agencia agencia = bancoTLA.listaAgencias.get(0);

				for (int i = contagemTitular; i < contagemTitular + 1; i++) {
					Cliente titular = bancoTLA.listaAgencias.get(0).getListaClientes().get(i);
					bancoTLA.listaAgencias.get(0).getListaContas().add(new ContaCorrente(numeroConta, saldo, agencia, titular));
				}
				contagemTitular++;
				
				linhaCsv = bufferedReader.readLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		for (Conta conta : bancoTLA.listaAgencias.get(0).getListaContas()) {
			System.out.println(conta.getAgencia());
			System.out.println(conta.getNumeroConta());
			System.out.println(conta.getTitular());
			System.out.println("Saldo da conta: R$ " + String.format("%.2f", conta.getSaldo()));
			System.out.println("...........................");
		}
		
		/*
		ContaCorrente contaCorrentePf01 = new ContaCorrente(1101, 20000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(0));
		ContaCorrente contaCorrentePf02 = new ContaCorrente(1102, 5000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(1));
		ContaCorrente contaCorrentePf03 = new ContaCorrente(1103, 8000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(2));
		*/
		
		ContaPoupanca contaPoupancaPf01 = new ContaPoupanca(2101, 8000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(3));
		ContaPoupanca contaPoupancaPf02 = new ContaPoupanca(2102, 15000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(4));
		
		bancoTLA.listaAgencias.get(0).getListaContas().add(contaPoupancaPf01);
		bancoTLA.listaAgencias.get(0).getListaContas().add(contaPoupancaPf02);
		
		ContaCorrente contaCorrentePj01 = new ContaCorrente(1101, 20000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(0));
		ContaCorrente contaCorrentePj02 = new ContaCorrente(1102, 5000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(1));
		ContaCorrente contaCorrentePj03 = new ContaCorrente(1103, 8000, bancoTLA.getAgencias().get(0), bancoTLA.getAgencias().get(0).getListaClientes().get(2));
		
		bancoTLA.listaAgencias.get(0).getListaContas().add(contaCorrentePj01);
		bancoTLA.listaAgencias.get(0).getListaContas().add(contaCorrentePj02);
		bancoTLA.listaAgencias.get(0).getListaContas().add(contaCorrentePj03);
		
		System.out.println(contaPoupancaPf01.calculaTributos());
		System.out.println(contaPoupancaPf02.calculaSaldoContaMensal());
		System.out.println(contaCorrentePj01.extrato());
		
	}

}
