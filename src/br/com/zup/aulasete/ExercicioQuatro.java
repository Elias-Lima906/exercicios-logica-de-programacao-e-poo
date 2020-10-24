package br.com.zup.aulasete;

import java.util.Scanner;

public class ExercicioQuatro {

	public static float CalculaVolumeCilindro(float altura, float raio) {

		return (float) (Math.PI * (Math.pow(raio, 2)) * altura);
	}

	public static void main(String[] args) {
		// Faça uma função que receba a altura e o raio de um cilindro
		// circular e retorne o volume do cilindro.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Abaixo A Altura Do Cilindro e o Raio");

		System.out.print("\nDigite a Altura : ");
		float alturaCilindro = teclado.nextFloat();

		System.out.print("\nDigite o Raio :");
		float raioCilindro = teclado.nextFloat();

		float volumeCilindro = CalculaVolumeCilindro(alturaCilindro, raioCilindro);

		System.out.printf("\nO Volume Do Cilíndro É: %.2f", volumeCilindro);
		
		teclado.close();

	}

}
