package br.com.zup.exercicios.aulaonze.contabancaria;

public class ContaBancaria {

	/*
	 * 2. Crie uma classe referente à uma conta bancária, que possui como atributos
	 * o seu número, saldo e o nome do correntista. Crie também o método saque() que
	 * serve para retirar o certo valor do saldo, o método depósito() que serve para
	 * adiconar um valor ao saldo e o método extrato() que serve para mostrar na
	 * tela o nome do correntista, o número da conta e o saldo. Crie um programa
	 * principal e demonstre a utilização dos métodos implementados.
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
		System.out.printf("\n\t------ N° Da Conta: %d ------", this.numeroConta);
		System.out.printf("\n\tO Saldo Em Conta é: R$ %.2f\n", this.saldo);
		System.out.println("\t-------------------------------");
	}

	public double getSaldo() {
		return this.saldo;
	}

}
