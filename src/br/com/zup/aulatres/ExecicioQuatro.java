package br.com.zup.aulatres;

public class ExecicioQuatro {

	public static void main(String[] args) {
		// Faça um programa que calcule e mostre a soma dos 50 primeiros números
		// ímpares.

		System.out.println("Soma dos 50 primeiros números ímpares");
		int soma = 0;
		for (int i = 1; i < 100; i = i + 2) {
			soma = soma + i;
			
		}
		System.out.println(soma);
	}

}
