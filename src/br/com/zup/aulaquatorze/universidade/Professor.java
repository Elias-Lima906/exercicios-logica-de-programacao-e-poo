package br.com.zup.aulaquatorze.universidade;

//1. Modele as classes referentes aos funcion�rios de uma universidade, que ser�o os professores,
//coordenadores, e funcion�rios administrativos.
//Os atributos comuns de todos os funcionarios ser�o: Nome, CPF, n�mero de registro, �rg�o
//de lota��o e sal�rio.
//
//Os professores possuem os atributos: N�vel de gradua��o, disciplina ministrada e
//quantidade de alunos e quantidade de turmas.
//
//Os coordenadores possuem os atributos: professoresSupervisionados[10].

//Os funcion�rios administrativos possuem os atributos: Fun��o Administrativa e senioridade.

//Implemente, al�m dos getters e setters e os construtores, os seguintes m�todos:

//Aumento de sal�rio: para todos menos os coordenadores aumenta o sal�rio em 10% e para
//os coordenadores o aumento � de 5%.
//
//Adiciona turma para os professores.
//
//Adiciona professor (para os coordenadores): observe que um coordenador s� pode
//coordenar 10 professores.

public class Professor extends Funcionario {

	private String nivelGraduacao;
	private String disciplinaMinistrada;
	@SuppressWarnings("unused")
	private int qtdAlunos;
	private int qtdTurmas;

	public Professor(String nome, String cpf, int numeroRegistro, String orgaoLotacao, float salario,
			String nivelGraduacao, String disciplinaMinistrada) {
		super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
		this.nivelGraduacao = nivelGraduacao;
		this.disciplinaMinistrada = disciplinaMinistrada;
		this.qtdAlunos = 30;
		this.qtdTurmas = 0;
	}

	public void imprimirDadosProfessores() {
		System.out.println("\n\t-----------------------------");
		// colocar super.get"" no imprime professores
		System.out.printf(
				"\tNome: %s\nCPF: %s\n\tNumero De Registro: %d\n\tOrg�o De Lotacao: %s\n\tNivel De Gradua��o: %d\n\tDisciplina Ministrada: %s\n\tTurmas: %d\n\tSalario: R$ %.2f",
				super.getNome(), super.getCpf(), super.getNumeroRegistro(), super.getOrgaoLotacao(), nivelGraduacao,
				disciplinaMinistrada, this.qtdTurmas, super.getSalario());
		System.out.println("\n\t-----------------------------\n");
	}

	public int adicionaTurma() {
		return this.qtdTurmas = this.qtdTurmas + 1;
	}

	public int setQtdTurmas(int qtdTurmas) {
		return this.qtdTurmas = qtdTurmas;
	}

	public int getQtdTurmas() {
		return qtdTurmas;
	}
}
