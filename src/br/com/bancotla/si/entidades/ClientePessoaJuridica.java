package br.com.bancotla.si.entidades;

public final class ClientePessoaJuridica extends Cliente {

	private String razaoSocial;
	private String endereco;
	private long cnpj;
	private long inscricaoMunicipal;
	private double mediaFaturamentoAnual;
	
	public ClientePessoaJuridica(int numeroDeCliente, String razaoSocial, String endereco, long cnpj,
			long inscricaoMunicipal, double mediaFaturamentoAnual) {
		super(numeroDeCliente);
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.mediaFaturamentoAnual = mediaFaturamentoAnual;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public long getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(long inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public double getMediaFaturamentoAnual() {
		return mediaFaturamentoAnual;
	}

	public void setMediaFaturamentoMensal(double mediaFaturamentoAnual) {
		this.mediaFaturamentoAnual = mediaFaturamentoAnual;
	}
	
	public String toString() {
		return "N�mero de Cliente: " + super.getNumeroDeCliente() + "\n" +
				"Raz�o Social: " + razaoSocial + "\n" +
				"CNPJ: " + cnpj + "\n" +
				"Endere�o: " + endereco + "\n" +
				"Inscri��o Municipal: " + inscricaoMunicipal + "\n" +
				"Media do faturamento anual (R$): " + String.format("%.2f", mediaFaturamentoAnual);
	}
	
}
