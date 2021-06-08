package br.com.bancotla.si.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

import br.com.bancotla.si.entidades.Agencia;
import br.com.bancotla.si.entidades.Banco;
import br.com.bancotla.si.entidades.Cliente;
import br.com.bancotla.si.entidades.ClientePessoaFisica;

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Banco bancoTLA = new Banco("Banco TLA LTDA", "Banco Fácil", "01.012.345/0001-00", "Rua Getúlio Vargas, 60. Campina Grande - PB");
		
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
				
				// DUVIDA >>> prática correta sem atribuir a uma variável?? ERRO ao atribuir erro no programa
				bancoTLA.getAgencias().get(0).getListaClientes().add(new ClientePessoaFisica(numeroDeCliente, nome, endereco, cpf, rendaMensal));
				
				linhaCsv = bufferedReader.readLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		// DUVIDA >>> sintaxe do for para lista de cliente (pf ou cliente genérico / in variavel)
		for (Cliente cliente : bancoTLA.getAgencias().get(0).getListaClientes()) {
			System.out.println(cliente);
			System.out.println("--------------------------------");
		}
		
		System.out.println("====================================");
		
		// DUVIDA >>> reconhecimento de caracteres especiais do arquivo CSV
		
		//String arquivoClientePj = "D:\\clientePj.txt";
		
		// TODO impressão de caracteres especiais no console
		
		// TODO fazer inserção de clientes PJ por leitura de arquivo
		
		// TODO inserir contas e testar métodos (polimorfismo..)

	}

}
