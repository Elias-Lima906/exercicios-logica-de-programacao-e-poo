package br.com.zup.exercicios.auladois;

import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {
		// Fa�a um algoritmo que calcule a m�dia ponderada das notas de 3 provas. A
		// primeira e a segunda prova tem peso 1 e a terceira tem peso 2. Ao final,
		// mostrar a m�dia do aluno e indicar se o aluno foi aprovado ou reprovado.
		// A nota para aprova��o deve ser igual ou superior a 60 pontos.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite As Notas E te Darei a M�dia");

		System.out.println("Digite a 1� Nota");
		int notaUm = teclado.nextInt();

		System.out.println("Digite a 2� Nota");
		int notaDois = teclado.nextInt();
		;

		System.out.println("Digite a 3� Nota");
		int notaTres = teclado.nextInt();
		;

		int mediaPonderada = (notaUm * 1 + notaDois * 1 + notaTres * 2) / 4;

		if (mediaPonderada >= 60) {
			System.out.printf("Sua Media Foi %d Voc� Foi Aprovado", mediaPonderada);

		} else {
			System.out.printf("Sua Media Foi %d Voc� Foi Reprovado", mediaPonderada);
		}
		teclado.close();
	}

}
