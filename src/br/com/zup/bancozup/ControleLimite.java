package br.com.zup.bancozup;

public interface ControleLimite {
	boolean aumentarLimiteCheque(String nomeConta) throws OperacaoBancariaException;

	boolean aumentarLimiteCartao(String nomeConta) throws OperacaoBancariaException;

	boolean diminuirLimiteCheque(String nomeConta) throws OperacaoBancariaException;

	boolean diminuirLimiteCartao(String nomeConta) throws OperacaoBancariaException;
}