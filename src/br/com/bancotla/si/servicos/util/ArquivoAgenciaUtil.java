package br.com.bancotla.si.servicos.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.bancotla.si.entidades.Agencia;

public final class ArquivoAgenciaUtil {

	public static List<Agencia> carregarDeArquivo(String arquivoAgencias) {

		List<Agencia> listaAgencia = new ArrayList<Agencia>();

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoAgencias))) {

			String linhaCsv = bufferedReader.readLine();
			while (linhaCsv != null) {

				String[] fields = linhaCsv.split(", ");
				String nomeAgencia = fields[0];
				int numeroAgencia = Integer.parseInt(fields[1]);

				listaAgencia.add(new Agencia(nomeAgencia, numeroAgencia));

				linhaCsv = bufferedReader.readLine();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return listaAgencia;
	}

}
