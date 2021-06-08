package br.com.bancotla.si.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

import br.com.bancotla.si.entidades.Agencia;
import br.com.bancotla.si.entidades.Banco;

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
		
		String arquivoClientePf = "D:\\clientePf.txt";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoClientePf))) {

			String linhaCsv = bufferedReader.readLine();
			while (linhaCsv != null) {

				String[] fields = linhaCsv.split(",");
				int numeroDeCliente = Integer.parseInt(fields[0]);
				String nome = fields[1];
				String endereco = fields[2];
				String cpf = fields[2];
				double rendaMensal = Double.parseDouble(fields[3]);

				// TODO adicionar os clientes na agencia 0001;
				
				linhaCsv = bufferedReader.readLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
			
		

		
			String arquivoClientePj = "D:\\clientePj.txt";
		
		// TODO fazer uma adição das agências por leitura de arquivo
		
		// TODO fazer inserção de clientes PF e PJ por leitura de arquivo
		
		// TODO fazer inserção de contas correntes em uma agencia por leitura de arquivo
		
		// TODO fazer inserção de funcionários por leitura de arquivo

	}

}
