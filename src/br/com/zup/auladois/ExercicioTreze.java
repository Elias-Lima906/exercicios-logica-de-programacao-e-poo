package br.com.zup.auladois;
import java.util.Scanner;

public class ExercicioTreze {

	public static void main(String[] args) {
		// Fa�a um programa para a leitura de duas notas parciais de um aluno.
		// O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
		// A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
		// A mensagem "Reprovado", se a m�dia for menor do que sete;
		// A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite Abaixo As notas Do Aluno");

		System.out.println("Digite a 1� Nota");
		float notaUm = teclado.nextFloat();

		System.out.println("Digite a 2� Nota");

		float notaDois = teclado.nextFloat();

		float media = (notaUm + notaDois) / 2f;

		if (media >= 7f && media <= 9f) {
			System.out.printf("Sua media foi %.1f Voc� Foi Aprovado", media);

		} else if (media < 7f) {
			System.out.printf("Sua media foi %.1f Voc� Foi Reprovado", media);

		} else if (media == 10f) {
			System.out.printf("Sua media foi %.1f Voc� Foi Aprovado com Distin��o", media);
		}
		teclado.close();
	}

}
