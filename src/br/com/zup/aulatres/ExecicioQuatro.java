package br.com.zup.aulatres;

public class ExecicioQuatro {

	public static void main(String[] args) {
		// Fa�a um programa que calcule e mostre a soma dos 50 primeiros n�meros
		// �mpares.

		System.out.println("Soma dos 50 primeiros n�meros �mpares");
		int soma = 0;
		for (int i = 1; i < 100; i = i + 2) {
			soma = soma + i;
			
		}
		System.out.println(soma);
	}

}
