package br.com.zup.desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.text.Normalizer;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ForcaEL {

	public static int contarLinhasArquivo() throws IOException {

		LineNumberReader contaLinhas = new LineNumberReader(new FileReader("palavras.txt"));
		contaLinhas.skip(Long.MAX_VALUE);
		int quantidadePalavras = contaLinhas.getLineNumber() + 1;
		contaLinhas.close();

		return quantidadePalavras;

	}

	public static String buscarPalavraAleatoriaArquivo() throws IOException {

		Random random = new Random();
		int quantidadePalavras = contarLinhasArquivo();

		String[] palavra = new String[quantidadePalavras];

		BufferedReader leitor = new BufferedReader(new FileReader("palavras.txt"));
		String linhaLida;
		int linha = 0;
		while ((linhaLida = leitor.readLine()) != null) {
			palavra[linha] = linhaLida;
			linha++;

		}

		leitor.close();

		int posicaoAleatoria = random.nextInt(quantidadePalavras);
		String palavraSorteada = palavra[posicaoAleatoria];

		return removerAcentos(palavraSorteada);

	}

	public static String escreverPalavraAoGanhar(String palavraPremio) throws IOException {

		FileWriter escrita = new FileWriter("palavras.txt", true);

		escrita.append("\n" + palavraPremio);
		escrita.close();

		return "Palavra adicionada com sucesso!";
	}

	public static String removerAcentos(String normalizarPalavra) {
		String normalizarTextoNfd = Normalizer.normalize(normalizarPalavra, Normalizer.Form.NFD);
		Pattern padrao = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return padrao.matcher(normalizarTextoNfd).replaceAll("");
	}

	public static void main(String[] args) throws Exception {

		int jogarNovamente;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Bem Vindo A Forca Tem�tica de Harry Potter!");
			System.out.println("Apenas Palavras Voltadas Ao Mundo Bruxo!\n");
			System.out.println("Obs: Se digitar mais de uma letra ser� considerado chute.\n");

			String palavraSorteada = buscarPalavraAleatoriaArquivo();

			char[] verificarLetras = new char[palavraSorteada.length()];

			for (int i = 0; i < verificarLetras.length; i++) {
				verificarLetras[i] = 0;

				if (palavraSorteada.charAt(i) == ' ') {
					verificarLetras[i] = 1;
					System.out.print(" ");
				} else
					System.out.print(" _ ");
			}

			int indice = 0;
			char[] letrasUtilizadas = new char[20];
			int chances = 6;
			boolean verificarVitoria = false;

			do {
				System.out.printf("\n\n\nVoc� tem  %d  vidas: ", chances);
				System.out.println("\nLetras utilizadas: " + new String(letrasUtilizadas));
				System.out.printf("\n\nDigite Uma Letra: \n" + "Ou Digite a Palavra Se Souber: \n");
				System.out.print("\nOpc�o: ");

				String opcao = teclado.nextLine().toLowerCase();
				String opcaoSemAcento = removerAcentos(opcao);

				if (opcaoSemAcento.length() > 1) {
					if (opcaoSemAcento.equals(palavraSorteada)) {
						verificarVitoria = true;
						break;
					} else {
						chances = 0;
						break;
					}

				} else {
					char letra = opcaoSemAcento.charAt(0);

					letrasUtilizadas[indice] = letra;
					indice++;

					boolean perderchances = true;
					for (int j = 0; j < palavraSorteada.length(); j++) {

						if (letra == palavraSorteada.charAt(j)) {
							verificarLetras[j] = 1;
							perderchances = false;
						}
					}

					if (perderchances) {
						chances--;
					}
				}

				System.out.println("\n");

				verificarVitoria = true;
				for (int i = 0; i < palavraSorteada.length(); i++) {

					if (verificarLetras[i] == 0) {
						System.out.print(" _ ");
						verificarVitoria = false;

					} else {
						System.out.print(" " + palavraSorteada.charAt(i) + " ");
					}
				}

				System.out.println("\n");

			} while (!verificarVitoria && chances > 0);

			if (chances != 0) {
				System.out.println("\n\t !!!Parab�ns Voc� Ganhou, Voc� Manja Muito De Harry Potter!!!");
				System.out.println("\n\tComo Premio Voc� Pode Adicionar Uma Palavra De Seu Gosto No Jogo!");
				System.out.print("\tPalavra: ");
				String palavraPremio = teclado.nextLine();
				System.out.println("\t" + escreverPalavraAoGanhar(palavraPremio));
				System.out.println("\n\t\t -> Sinta-se Avontade Para Jogar De Novo! <-");

			} else {
				System.out.printf("\tA palavra era: -> %s <-", palavraSorteada);
				System.out.println("\n\tInfelizmente Voc� Perdeu, Mas N�o Fique Triste, Jogue De Novo!");
			}

			System.out.print("\n\t\t\tDeseja Jogar Novamente? S/N : ");
			System.out.println("\n\t\t\t(1) - Continuar" + "\n\t\t\t(0) - Sair");
			System.out.print("\n\t\t\tOp��o: ");
			jogarNovamente = teclado.nextInt();

			teclado.nextLine();

		} while (jogarNovamente == 1 || jogarNovamente != 0);
		System.out.println("\t\t\tMuito Obrigado!");

		teclado.close();
	}
}