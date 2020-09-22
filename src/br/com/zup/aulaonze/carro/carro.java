package br.com.zup.exercicios.aulaonze.carro;

public class carro {

	// 1. Crie uma classe que represente um carro, que tenha como caracter�sticas o
	// nome, o peso, a
	// fabricante, a cor e o valor do carro. Crie tamb�m o m�todo darDesconto() que
	// servir� para
	// diminuir o pre�o do carro e o m�todo pintar(), que ser� respons�vel por mudar
	// a cor do carro.
	// Crie um carro no seu programa principal, utilize os m�todos criados e mostre
	// na tela o pre�o e a
	// cor do carro antes e depois da utiliza��o dos m�todos.

	String nome;
	double peso;
	String fabricante;
	String cor;
	double valor;

	public carro(String nome, double peso, String fabricante, String cor, double valor) {
		this.nome = nome;
		this.peso = peso;
		this.fabricante = fabricante;
		this.cor = cor;
		this.valor = valor;
	}

	public double darDesconto(double porcentagemDesconto) {
		this.valor = this.valor - (this.valor * porcentagemDesconto / 100);
		return this.valor;
	}

	public String pintar(String novaCor) {
		this.cor = novaCor;
		return this.cor;

	}

}
