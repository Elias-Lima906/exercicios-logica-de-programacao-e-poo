package br.com.zup.aulaquatorze.universidade;

//1. Modele as classes referentes aos funcionários de uma universidade, que serão os professores,
//coordenadores, e funcionários administrativos.
//Os atributos comuns de todos os funcionarios serão: Nome, CPF, número de registro, órgão
//de lotação e salário.
//
//Os professores possuem os atributos: Nível de graduação, disciplina ministrada e
//quantidade de alunos e quantidade de turmas.
//
//Os coordenadores possuem os atributos: professoresSupervisionados[10].

//Os funcionários administrativos possuem os atributos: Função Administrativa e senioridade.

//Implemente, além dos getters e setters e os construtores, os seguintes métodos:

//Aumento de salário: para todos menos os coordenadores aumenta o salário em 10% e para
//os coordenadores o aumento é de 5%.
//
//Adiciona turma para os professores.
//
//Adiciona professor (para os coordenadores): observe que um coordenador só pode
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
				"\tNome: %s\nCPF: %s\n\tNumero De Registro: %d\n\tOrgão De Lotacao: %s\n\tNivel De Graduação: %d\n\tDisciplina Ministrada: %s\n\tTurmas: %d\n\tSalario: R$ %.2f",
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
