package br.com.zup.exercicios.aulaonze.contabancaria;

public class ContaBancaria {

	/*
	 * 2. Crie uma classe referente � uma conta banc�ria, que possui como atributos
	 * o seu n�mero, saldo e o nome do correntista. Crie tamb�m o m�todo saque() que
	 * serve para retirar o certo valor do saldo, o m�todo dep�sito() que serve para
	 * adiconar um valor ao saldo e o m�todo extrato() que serve para mostrar na
	 * tela o nome do correntista, o n�mero da conta e o saldo. Crie um programa
	 * principal e demonstre a utiliza��o dos m�todos implementados.
	 */

	private long numeroConta;
	private double saldo;
	private String nome;

	public ContaBancaria(long numeroConta, double saldo, String nome) {

		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.nome = nome;
	}

	public double saque(double sacar) {

		if (sacar <= this.saldo) {
			this.saldo -= sacar;
		}
		return this.saldo;
	}

	public double deposito(double depositar) {

		if (depositar >= 1) {
			this.saldo = this.saldo + depositar;
		}
		return this.saldo;
	}

	public void extrato() {
		System.out.println("\t----------- Extrato -----------");
		System.out.printf("\t------ Nome: %s ------------", this.nome);
		System.out.printf("\n\t------ N� Da Conta: %d ------", this.numeroConta);
		System.out.printf("\n\tO Saldo Em Conta �: R$ %.2f\n", this.saldo);
		System.out.println("\t-------------------------------");
	}

	public double getSaldo() {
		return this.saldo;
	}

}
