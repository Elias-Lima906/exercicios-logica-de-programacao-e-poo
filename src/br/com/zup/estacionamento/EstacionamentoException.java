package br.com.zup.estacionamento;

public class EstacionamentoException extends Exception {

	private static final long serialVersionUID = 7377982967933273901L;

	private String mensagem;

	public EstacionamentoException(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

}
