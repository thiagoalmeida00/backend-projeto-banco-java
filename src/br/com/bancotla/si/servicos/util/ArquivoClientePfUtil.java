package br.com.bancotla.si.servicos.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.bancotla.si.entidades.ClientePessoaFisica;

public final class ArquivoClientePfUtil {

	public static List<ClientePessoaFisica> carregarDeArquivo(String arquivoClientePf) {
		
		List<ClientePessoaFisica> listaClientes = new ArrayList<ClientePessoaFisica>();
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoClientePf))) {

			String linhaCsv = bufferedReader.readLine();
			while (linhaCsv != null) {

				String[] fields = linhaCsv.split(", ");
				int numeroDeCliente = Integer.parseInt(fields[0]);
				String nome = fields[1];
				String endereco = fields[2];
				String cpf = fields[3];
				double rendaMensal = Double.parseDouble(fields[4]);
				
				listaClientes.add(new ClientePessoaFisica(numeroDeCliente, nome, endereco, cpf, rendaMensal));
				
				linhaCsv = bufferedReader.readLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return listaClientes;
		
	}
	
}
