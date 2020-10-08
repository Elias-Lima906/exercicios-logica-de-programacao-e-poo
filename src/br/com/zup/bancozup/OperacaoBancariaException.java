package br.com.zup.bancozup;

public class OperacaoBancariaException extends Exception {

	private String mensagem;

	private static final long serialVersionUID = 2153102344563262651L;

	public OperacaoBancariaException(String mensagem) {

		this.mensagem = mensagem;
	}

	public String getMensagem() {

		return this.mensagem;
	}

}
