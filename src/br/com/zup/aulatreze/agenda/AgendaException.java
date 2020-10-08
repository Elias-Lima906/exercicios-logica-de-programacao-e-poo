package br.com.zup.aulatreze.agenda;

public class AgendaException extends Exception {

	private static final long serialVersionUID = 708955642309657817L;

	private String mensagem;

	public AgendaException(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return this.mensagem;
	}

}
