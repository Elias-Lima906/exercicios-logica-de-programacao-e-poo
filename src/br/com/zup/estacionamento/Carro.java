package br.com.zup.estacionamento;

public class Carro {

	/*
	 * 4. Modele a classe Carro com os atributos - placa - cor - marca - modelo
	 */

	private String placa;
	private String cor;
	private String marca;
	private String modelo;

	public Carro(String placa, String cor, String marca, String modelo) {
		this.placa = placa;
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getPlaca() {
		return this.placa;
	}

	public String getCor() {
		return this.cor;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getmodelo() {
		return this.modelo;
	}
}
