package br.com.zup.aulatreze.agenda;

import br.com.zup.exercicios.auladoze.pessoa.Pessoa;

public class Agenda {

	/*
	 * Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de
	 * realizar as seguintes operações (para representar as pessoas na Agenda
	 * utilize a classe Pessoa construída da aula anterior): void
	 * armazenaPessoa(String nome, int idade, float altura); void
	 * removePessoa(String nome); int buscaPessoa(String nome); // informa em
	 * queposição da agenda está a pessoa void imprimeAgenda(); // imprime os dados
	 * de todas as pessoas da agenda void imprimePessoa(int index); // imprime os
	 * dados da pessoa que está na posição “i” da agenda.
	 */

	private Pessoa[] pessoas;

	public Agenda() {
		this.pessoas = new Pessoa[10];
	}

	public void armazenaPessoa(String nome, int anoNascimento, float altura) {

		Pessoa armazenaPessoa = new Pessoa(nome, anoNascimento, altura);

		for (int i = 0; i < this.pessoas.length; i++) {
			if (this.pessoas[i] == null) {
				this.pessoas[i] = armazenaPessoa;
				break;
			}
		}

	}

	public void removePessoa(String name) {

		for (int i = 0; i < pessoas.length; i++) {
			if (this.pessoas[i] != null && this.pessoas[i].getNome().equals(name)) {
				this.pessoas[i] = null;
			}
		}
	}

	public int buscaPessoa(String name) {

		for (int i = 0; i < this.pessoas.length; i++) {
			if (this.pessoas[i] != null && this.pessoas[i].getNome().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	public void imprimeAgenda() {

		for (Pessoa agenda : this.pessoas) {
			if(agenda != null)
			agenda.imprimirDadosPessoais();
		}
	}

	public void imprimePessoa(int index) {
		if (index >= 0 || pessoas[index] != null) {
			this.pessoas[index].imprimirDadosPessoais();
		}
	}
}
