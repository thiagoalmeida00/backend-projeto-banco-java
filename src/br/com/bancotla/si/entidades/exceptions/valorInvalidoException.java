package br.com.bancotla.si.entidades.exceptions;

public class valorInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public valorInvalidoException() {
		super();
	}

	public valorInvalidoException(String message) {
		super(message);
	}

}
