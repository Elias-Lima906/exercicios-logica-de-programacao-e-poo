package br.com.zup.aulaquatorze.universidade;

public class Cordenador extends Funcionario {

//	1. Modele as classes referentes aos funcion�rios de uma universidade, que ser�o os professores,
//	coordenadores, e funcion�rios administrativos.
//	Os atributos comuns de todos os funcionarios ser�o: Nome, CPF, n�mero de registro, �rg�o
//	de lota��o e sal�rio.
//
//	Os professores possuem os atributos: N�vel de gradua��o, disciplina ministrada e
//	quantidade de alunos e quantidade de turmas.
//
//	Os coordenadores possuem os atributos: professoresSupervisionados[10].

//	Os funcion�rios administrativos possuem os atributos: Fun��o Administrativa e senioridade.

//	Implemente, al�m dos getters e setters e os construtores, os seguintes m�todos:

//	Aumento de sal�rio: para todos menos os coordenadores aumenta o sal�rio em 10% e para
//	os coordenadores o aumento � de 5%.
//
//	Adiciona turma para os professores.
//a
//	Adiciona professor (para os coordenadores): observe que um coordenador s� pode
//	coordenar 10 professores.

	private Professor[] professoresSupervisionados;

	public Cordenador(String nome, String cpf, int numeroRegistro, String orgaoLotacao, float salario) {
		super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
		professoresSupervisionados = new Professor[10];
	}

	public void adicionaProfessor(Professor professor) {

		for (int i = 0; i < professoresSupervisionados.length; i++) {
			if (professoresSupervisionados[i] == null) {
				professoresSupervisionados[i] = professor;
				break;
			}
		}
	}

	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario() * 1.05f);
	}

	public void imprimirProfessores() {
		for (Professor prof : professoresSupervisionados) {

			if (prof != null) {
				prof.imprimirDadosProfessores();
			}
		}
	}
}
