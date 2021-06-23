package br.com.bancotla.si.servicos.util;

import br.com.bancotla.si.entidades.enums.MoedaEnum;

public class MoedaUtil {

	private static final double COTACAO_DOLAR = 5.0483;
	private static final double COTACAO_PESO_ARGENTINO = 0.05314;

	public static double converterMoeda(double montante, MoedaEnum origem, MoedaEnum destino) {
		
		if (origem.equals(MoedaEnum.REAL) && destino.equals(MoedaEnum.DOLAR)) {
			montante *= COTACAO_DOLAR;
		}
		
		else if (origem.equals(MoedaEnum.REAL) && destino.equals(MoedaEnum.PESO_ARGENTINO)) {
			montante *= COTACAO_PESO_ARGENTINO;
		}
				
		return montante;
		
	}
	
	public static double converterParaReal(double montante, MoedaEnum origem) {
		return converterMoeda(montante, origem, MoedaEnum.REAL);
	}
	
	public static double converterParaDolar(double montante, MoedaEnum origem) {
		return converterMoeda(montante, origem, MoedaEnum.DOLAR);
	}
	
	public static double converterParaPesoArgentino(double montante, MoedaEnum origem) {
		return converterMoeda(montante, origem, MoedaEnum.PESO_ARGENTINO);
	}
	
}
