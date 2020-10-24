package br.com.zup.aulacinco;

import java.util.Scanner;

public class ExercicioCinco {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Escreva um programa que leia o numero de habitantes de uma determinada
		 * cidade, o valor do kwh, e para cada habitante entre com os seguintes dados:
		 * consumo do mes e o codigo do consumidor (1-Residencial, 2-Comercial,
		 * 3-Industrial). No final imprima o maior, o menor e a media do consumo dos
		 * habitantes; e por fim o total do consumo de cada categoria de consumidor
		 */
		float media = 0;
		int consumoMes = 0, i;
		float menor = Integer.MAX_VALUE;
		float maior = Integer.MIN_VALUE;
		float consumoResidencial = 0;
		float consumoComercial = 0;
		float consumoIndustrial = 0;
		int consumidor = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite abaixo a quantidade de habitantes da cidade:");
		int quantidadeHabitantes = teclado.nextInt();

		System.out.println("Agora digite o valor de 1 Kwh em R$ na sua cidade:");
		float valorkilowats = teclado.nextFloat();

		for (i = 1; i <= quantidadeHabitantes; i++) {
			System.out.printf("Digite o consumo do %d habitante\n", i);
			consumoMes = teclado.nextInt();

			if (consumoMes > maior) {
				maior = consumoMes;
			}
			if (consumoMes < menor) {
				menor = consumoMes;
			}
			do {
				System.out.printf("Qual o código do %d consumidor:\n", i);
				System.out.println("1 - Residencial");
				System.out.println("2 - Comercial");
				System.out.println("3 - Industrial");

				consumidor = teclado.nextInt();
				switch (consumidor) {
				case 1:
					consumoResidencial += consumoMes;
					break;
				case 2:
					consumoComercial += consumoMes;
					break;
				case 3:
					consumoIndustrial += consumoMes;
					break;
				default:
					System.out.println("Opção Inválida");
				}

			} while (consumidor < 0 || consumidor > 3);
		}

		media = (consumoResidencial + consumoComercial + consumoIndustrial) / quantidadeHabitantes;

		System.out.printf("\nO maior consumo foi: Kwh %.2f", maior);
		float valorEmReaisMaior = maior * valorkilowats;
		System.out.printf("\nO Valor desse consumo é R$%.2f\n", valorEmReaisMaior);

		System.out.printf("\nO menor consumo foi: Kwh %.2f", menor);
		float valorEmReaisMenor = menor * valorkilowats;
		System.out.printf("\nO Valor desse consumo é R$%.2f\n", valorEmReaisMenor);

		System.out.printf("\nA média do consumo dos habitantes é: Kwh %.2f", media);
		System.out.printf("\nO consumo dos Habitantes Residenciais foi: Kwh %.2f ", consumoResidencial);
		System.out.printf("\nO consumo dos Habitantes Comerciais foi: Kwh %.2f ", consumoComercial);
		System.out.printf("\nO consumo dos Habitantes Industriais foi: Kwh %.2f ", consumoIndustrial);

		teclado.close();
	}

}