package br.com.zup.aulatreze.agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	static final int QTD_PESSOAS = 10;

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

	List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public Agenda() {
	}

	public void armazenaPessoa(String nome, int anoNascimento, float altura) throws AgendaException {

		Pessoa armazenaPessoa = new Pessoa(nome, anoNascimento, altura);

		if (this.pessoas.size() < QTD_PESSOAS) {
			this.pessoas.add(armazenaPessoa);
			return;
		}
		throw new AgendaException("\n\tQuantidade Máxima De Pessoas Atingidas\n");
	}

	public void removePessoa(String name) throws AgendaException {
		

		for (int i = 0; i < pessoas.size(); i++) {
			if (this.pessoas.get(i).getNome().equals(name)) {
				pessoas.remove(i);
				return;
			}
		}
		throw new AgendaException("\n\tA Pessoa Não Foi Encontrada\n");
	}

	public int buscaPosicaoPessoa(String name) throws AgendaException {

		for (int i = 0; i < this.pessoas.size(); i++) {
			if (this.pessoas.get(i).getNome().equals(name)) {
				return i;
			}
		}
		throw new AgendaException("\n\tA Pessoa Não Foi Encontrada\n");
	}

	public void imprimeAgenda() {

		for (Pessoa pessoa : this.pessoas) {
			if (pessoa != null)
				pessoa.imprimirDadosPessoais();
		}
	}

	public void imprimePessoa(int index) throws AgendaException {
		if (index >= 0 || pessoas.get(index) != null) {
			this.pessoas.get(index).imprimirDadosPessoais();
		return;
		}
		throw new AgendaException("\n\tA Pessoa Não Foi Encontrada\n");
	}
}
