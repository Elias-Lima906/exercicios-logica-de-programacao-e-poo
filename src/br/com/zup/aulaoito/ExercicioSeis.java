package br.com.zup.aulaoito;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExercicioSeis {

	// Leia do usuário os nomes de n peças para um orçamento e grave
	// (linha a linha) em um arquivo chamado "peças.txt".

	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);
		FileWriter escrita = new FileWriter("peças.txt");

		String pecas;
		int quantidadeDePecas = 0;

		System.out.println("Olá Usúario;\n");
		System.out.println("Digite o Número De Peças Que Deseja Adicionar A lista: ");
		System.out.print("\nQuantidade: ");
		quantidadeDePecas = teclado.nextInt();

		for (int i = 0; i < quantidadeDePecas; i++) {
			System.out.print("\n\nDigite o Nome Da Peça: ");
			pecas = teclado.next();

			escrita.append(String.format("%s\n", pecas));

		}
		escrita.close();
		teclado.close();

	}

}
