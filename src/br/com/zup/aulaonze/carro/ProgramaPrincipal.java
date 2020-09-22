package br.com.zup.exercicios.aulaonze.carro;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Crie um carro no seu programa principal, utilize os métodos criados e mostre
		// na tela o preço e a
		// cor do carro antes e depois da utilização dos métodos.

		carro hrv = new carro("hrv", 900, "honda", "laranja", 90000);

		System.out.println("Valores Sem Deconto e Alteração de Cor: ");

		System.out.println(hrv.valor);

		System.out.println(hrv.cor);

		System.out.println("Valores Com Deconto e Alteração de Cor: ");

		hrv.darDesconto(10);

		hrv.pintar("Preto");

		System.out.println(hrv.valor);

		System.out.println(hrv.cor);

	}

}
