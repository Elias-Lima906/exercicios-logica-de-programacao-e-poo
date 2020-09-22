package br.com.zup.exercicios.aulaoito;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExercicioDois {

	// Leia o arquivo criado no exerc�cio anterior a mostre
	// seu conte�do na tela transformando todo texto escrito em mai�sculo.

	public static void main(String[] args) throws IOException {

		FileReader estrutura = new FileReader("dadosPessoais.txt");
		BufferedReader leitor = new BufferedReader(estrutura);

		String linha;

		while ((linha = leitor.readLine()) != null) {

			System.out.println(linha.toUpperCase());

		}

		leitor.close();
		estrutura.close();

	}

}
