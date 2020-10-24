package br.com.zup.aulaoito;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExercicioQuatro {

	// Leia n nomes digitados pelo usuário e os grave todos (um em cada linha)
	// em minúsculo em um arquivo chamado "nomes.txt".

	public static void main(String[] args) throws IOException {

		FileWriter escrita = new FileWriter("nomes.txt");

		Scanner teclado = new Scanner(System.in);

		String nomesLidos = null;
		int qtdNomes = 0;

		System.out.println("Olá Usúario.");

		System.out.print("Diga Quantos Nomes Deseja Digitar: ");
		qtdNomes = teclado.nextInt();

		for (int i = 1; i <= qtdNomes; i++) {

			System.out.printf("\n\nDigite o %d°  Nome: ", i);
			nomesLidos = teclado.next();

			escrita.write(String.format("-> %s\n\n", nomesLidos.toLowerCase()));
		}

		teclado.close();
		escrita.close();
	}

}
