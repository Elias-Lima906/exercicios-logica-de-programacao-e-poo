package br.com.zup.aulatreze;

public class AlunosMatriculados {

	/*
	 * 2. Escreva uma classe cujos objetos representam alunos matriculados em uma
	 * disciplina. Cada objeto dessa classe deve guardar os seguintes dados do
	 * aluno: matr�cula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os
	 * seguintes m�todos para esta classe: media() - calcula a m�dia final do aluno
	 * (cada prova tem peso 2,5 e o trabalho tem peso 2) final() - calcula quanto o
	 * aluno precisa para a prova final (retorna zero se ele n�o for para a final
	 * [caso em que sua m�dia � maior do que 6])
	 */

	private String nome;
	private String matricula;
	private float notaProvaUm;
	private float notaProvaDois;
	private float notaTrabalho;

	public AlunosMatriculados(String nome, String matricula, float notaProvaUm, float notaProvaDois,
			float notaTrabalho) {

		this.nome = nome;
		this.matricula = matricula;
		this.notaProvaUm = notaProvaUm;
		this.notaProvaDois = notaProvaDois;
		this.notaTrabalho = notaTrabalho;
	}

	public float media() {
		float media = ((this.notaProvaUm * 2.5f) + (this.notaProvaDois * 2.5f) + (this.notaTrabalho * 2f)) / 7f;
		return media;
	}

	public float fim() {
		float notaFinal = media();

		if (notaFinal >= 6) {
			return 0;

		} else
			return 6 - notaFinal;
	}

	public void statusAlunos() {
		System.out.println("\t---------------------");
		System.out.printf("\n\tNome: %s", this.nome);
		System.out.printf("\n\tMatr�cula: %s", this.matricula);
		System.out.printf("\n\tSua M�dia Foi %.1f", media());

		if (media() > 6) {
			System.out.println("\n\tVoc� Passou!\n");

		} else {
			System.out.println("\n\tVoc� N�o Passou!\n");
			System.out.printf("\n\tVoc� Precisa de M�dia %.1f Para Passar!\n", fim());
		}
		System.out.println("\t------------------------");
	}
}
