package br.com.zup.estacionamento;

import java.util.HashMap;
import java.util.Map;

public class Estacionamento {

	private float valorEmCaixa;
	private final int CAPACIDADE_M�XIMA;
	private Map<String, Carro> carros = new HashMap<String, Carro>();

	public Estacionamento() {
		this.valorEmCaixa = 0;
		this.CAPACIDADE_M�XIMA = 400;
	}

	public void registraEntrada(String placa, String cor, String marca, String modelo) throws EstacionamentoException {

		Carro carro = new Carro(placa, cor, marca, modelo);
		if (carros.size() < CAPACIDADE_M�XIMA) {
			carros.put(placa, carro);
		} else {
			throw new EstacionamentoException("\n\tPessoa N�o Adicionada, Capaxidade M�xima Ating�da\n");
		}
	}

	public void registraSaida(String placa, float valorEstadia) throws EstacionamentoException {

		if (carros.keySet().contains(placa)) {
			carros.remove(placa);
			this.valorEmCaixa += valorEstadia;
		} else {
			throw new EstacionamentoException("\n\n\tCarro n�o encontrado!\n");
		}
	}

	public float getValorEmCaixa() {
		return this.valorEmCaixa;
	}

	public boolean carroPresente(String placa) throws EstacionamentoException {

		if (carros.containsKey(placa)) {
			return true;
		} else {
			throw new EstacionamentoException("\n\tN�o Cont�m Nenhum Carro Com Essa Placa No Estacionamento!\n");
		}
	}
}