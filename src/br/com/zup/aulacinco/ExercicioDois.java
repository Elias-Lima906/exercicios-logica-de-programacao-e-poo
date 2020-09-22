package  br.com.zup.exercicios.aulacinco;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		/*
		 * Em uma eleição presidencial existem quatro candidatos. Os votos são
		 * informados por meio de código. Os códigos utilizados são:
		 */

		/*
		 * 1 , 2, 3, 4 - Votos para os respectivos candidatos (você deve montar a tabela
		 * ex: 1 - Jose/ 2- João/etc)
		 */
		// 5 - Voto Nulo
		// 6 - Voto em Branco

		// Faça um programa que calcule e mostre:
		// O total de votos para cada candidato;
		// O total de votos nulos;
		// O total de votos em branco;
		// A percentagem de votos nulos sobre o total de votos;
		// A percentagem de votos em branco sobre o total de votos.

		/*
		 * Para finalizar a votação deve-se digitar zero e caso não seja um valor de
		 * opção conhecida deve- se imprimir "Opção inválida".
		 */
		int voto;
		int votosRodrigo = 0, votosIdnilson = 0, votosDiego = 0, votosCristiano = 0, votosNulo = 0, votosEmBranco = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Bem VIndo As Eleições.");
			System.out.println("Você Tem As Seguintes Opções:");
			System.out.println("1 - Rodrigo\n" + "2 - Idnilson \n" + "3 - Diego \n" + "4 - Cristiano \n" + "5 - Nulo \n"
					+ "6 - Em Branco\n" + "0 - Para Sair\n");
			System.out.println("Digite o seu voto:");
			voto = teclado.nextInt();
			if (voto == 0) {
				break;
			}

			switch (voto) {
			case 1:
				System.out.println("Você Votou Em Rodrigo!\n");
				votosRodrigo += 1;
				break;
			case 2:
				System.out.println("Você Votou Em Idnilson!\n");
				votosIdnilson += 1;
				break;
			case 3:
				System.out.println("Você Votou Em Diego!\n");
				votosDiego += 1;
				break;
			case 4:
				System.out.println("Você Votou Em Cristiano!\n");
				votosCristiano += 1;
				break;
			case 5:
				System.out.println("Você Votou Nulo!\n");
				votosNulo += 1;
				break;
			case 6:
				System.out.println("Você Votou Em Branco!\n");
				votosEmBranco += 1;
				break;
			default:
				System.out.println("Opção Inválida, Tente Novamente!\n");
				break;
			}
		} while (voto != 0);

		int totalDeVotos = votosRodrigo + votosIdnilson + votosDiego + votosCristiano + votosNulo + votosEmBranco;

		System.out.printf("\nO Candidato Rodrigo Recebeu %d Votos \n", votosRodrigo);
		System.out.printf("\nO Candidato Idnilson Recebeu %d Votos \n", votosIdnilson);
		System.out.printf("\nO Candidato Diego Recebeu %d Votos \n", votosDiego);
		System.out.printf("\nO Candidato Cristiano Recebeu %d Votos \n", votosCristiano);

		float porcentagemVotosNulos = (votosNulo * 100) / (float) totalDeVotos;
		float porcentagemVotosEmBranco = (votosEmBranco * 100) / (float) totalDeVotos;

		System.out.printf("\nO Total De Votos Nulos Foi: %d \n", votosNulo);
		System.out.printf("\nO Total De Votos Em Branco Foi: %d \n", votosEmBranco);
		System.out.printf("\nA percentagem de votos nulos sobre o total de votos Foi: %.2f %%\n",
				porcentagemVotosNulos);
		System.out.printf("\nA percentagem de votos Em Branco sobre o total de votos Foi: %.2f %%\n",
				porcentagemVotosEmBranco);

		System.out.println("\nMuito Obrigado Por voltar");

		teclado.close();
	}
}