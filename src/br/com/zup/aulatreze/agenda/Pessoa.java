package br.com.zup.aulatreze.agenda;

public class Pessoa {

	/*
	 * 3. Crie uma classe para representar uma pessoa, com os atributos privados de
	 * nome, ano de nascimento e altura. Crie os métodos públicos necessários para
	 * sets e gets e também um método para imprimir todos dados de uma pessoa. Crie
	 * um método para calcular a idade da pessoa.
	 */

	private String nome;
	private int anoNascimento;
	private double altura;

	public Pessoa(String nome, int anoNascimento, double altura) {

		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.altura = altura;

	}

	public void imprimirDadosPessoais() {
		System.out.printf("\n\t- Nome: %s", this.nome);
		System.out.printf("\n\t- Ano Nasc: %d", this.anoNascimento);
		System.out.printf("\n\t- idade: %d", idade());
		System.out.printf("\n\t- Altura: %.2f\n\n", this.altura);

	}

	public int idade() {
		return 2020 - this.anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int novoAnoNascimento) {
		this.anoNascimento = novoAnoNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
	}

}