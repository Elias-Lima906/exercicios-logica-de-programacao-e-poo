package br.com.zup.exercicios.aulaoito;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExercicioOito {

	// Refaça o exercício número 2 da lista de exercícios em sala (00),
	// contudo, escreva o relatório gerado em um arquivo "relatorioEleicao.txt".

	public static void main(String[] args) throws IOException {

		FileWriter escrita = new FileWriter("relatorioEleicao.txt");
		Scanner teclado = new Scanner(System.in);

		int voto;
		int votosRodrigo = 0, votosIdnilson = 0, votosDiego = 0, votosCristiano = 0, votosNulo = 0, votosEmBranco = 0;

		do {
			System.out.println("Bem Vindo As Eleições.");
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

		float porcentagemVotosNulos = (votosNulo * 100) / (float) totalDeVotos;
		float porcentagemVotosEmBranco = (votosEmBranco * 100) / (float) totalDeVotos;

		escrita.write(String.format("\nO Candidato Rodrigo Recebeu %d Votos \n", votosRodrigo));
		escrita.write(String.format("\nO Candidato Idnilson Recebeu %d Votos \n", votosIdnilson));
		escrita.write(String.format("\nO Candidato Diego Recebeu %d Votos \n", votosDiego));
		escrita.write(String.format("\nO Candidato Cristiano Recebeu %d Votos \n", votosCristiano));

		escrita.write(String.format("\nO Total De Votos Nulos Foi: %d \n", votosNulo));
		escrita.write(String.format("\nO Total De Votos Em Branco Foi: %d \n", votosEmBranco));
		escrita.write(String.format("\nA percentagem de votos nulos sobre o total de votos Foi: %.2f %%\n",
				porcentagemVotosNulos));
		escrita.write(String.format("\nA percentagem de votos Em Branco sobre o total de votos Foi: %.2f %%\n",
				porcentagemVotosEmBranco));

		System.out.println("\nMuito Obrigado Por votar!");

		teclado.close();
		escrita.close();
	}

}
