package br.com.zup.exercicios.aulaonze.cartaodecredito;

public class CartaoDeCredito {

	/*
	 * 4. Crie uma classe que represente um cartão de crédito, que deve ter como
	 * atributos o seu limite, o saldo da fatura e nome do cliente. Crie também os
	 * métodos aumentaLimite(), diminuiLimite(), realizaCompra() que não deve
	 * permitir uma compra caso o limite tenha sido atingido e o imprimeFatura() que
	 * imprime na tela o valor da fatura.
	 */

	double limite;
	double saldoFatura;
	String nome;

	public CartaoDeCredito(double limite, String nome) {

		this.limite = limite;
		this.saldoFatura = 0;
		this.nome = nome;

	}

	public void aumentaLimite(double novoLimite) {
		this.limite += novoLimite;
		System.out.println("\nLimite Ajustado!\n");
	}

	public void diminuiLimite(double novoLimite) {
		this.limite -= novoLimite;
		System.out.println("\nLimite Ajustado!\n");
	}

	public double realizaCompra(double valorCompra) {

		if (valorCompra < this.limite) {
			this.limite -= valorCompra;
			this.saldoFatura += valorCompra;
			System.out.println("\n\tCompra Efetuada Com Sucesso.\n");
		} else {
			System.out.println("\nLimite Insuficiente!\n");
		}

		return valorCompra;
	}

	public void imprimeFatura() {

		System.out.println("\n\n\t------ Fatura Do Cartao ------");
		System.out.printf("\tA sua fatura está em R$ %.2f\n", this.saldoFatura);
		System.out.printf("\tSeu Limite Disponível é de R$ %.2f", this.limite);
		System.out.println("\n\t------------------------------");

	}

}
