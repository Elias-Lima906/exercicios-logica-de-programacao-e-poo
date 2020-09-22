package  br.com.zup.exercicios.aulacinco;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		int primeiroNumero;
		int segundoNumero;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Digite um número que represente o inicio do intervalo \n" + "desejado!");
			primeiroNumero = teclado.nextInt();
			System.out.println("Agora digite o final do intervalo!");
			segundoNumero = teclado.nextInt();

			if (primeiroNumero < 0 || segundoNumero < 0) {
				System.out.println("Opção Inválida, Tente Novamente Com Valores Acima De Zero.\n");
			}
			if(primeiroNumero > segundoNumero) {
				System.out.println("Opção Inválida, Tente Novamente Com Outros Valores.\n");
			}
				
		} while (primeiroNumero < 0 || segundoNumero < 0 || primeiroNumero > segundoNumero);

		int contador = 0;
		int divisores = 0;
		int soma = 0;

		for (int j = primeiroNumero; j <= segundoNumero; j++) {
			divisores = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					divisores++;
				}
			}
			if (divisores == 2) {
				contador++;
				soma = soma + j;
			}

		}
		System.out.printf("A quantidade de números primos entre %d e %d é de %d números!\n", primeiroNumero,
				segundoNumero, contador);
		System.out.printf("E a soma entre eles é %d", soma);

		teclado.close();
	}

}
