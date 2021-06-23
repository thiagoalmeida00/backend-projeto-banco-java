package br.com.bancotla.si.servicos.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.bancotla.si.entidades.ClientePessoaJuridica;

public final class ArquivoClientePjUtil {

	public static List<ClientePessoaJuridica> carregaDeArquivo(String arquivoClientePj) {
		
		List<ClientePessoaJuridica> listaClientes = new ArrayList<ClientePessoaJuridica>();
		
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
				
				listaClientes.add(new ClientePessoaJuridica(numeroDeCliente, razaoSocial, endereco, cnpj, inscricaoMunicipal, mediaFaturamentoAnual));
				
				linhaCsv = bufferedReader.readLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return listaClientes;
	}
	
}
