package br.com.mesttra.aulas.aula02.universidade;

public class Professor extends Funcionario {
	
//	Os professores possuem os atributos: Nível de graduação, 
//	disciplina ministrada e 
//	quantidade de alunos e quantidade de turmas.
	private String nivelGraduacao;
	private String disciplinaMinistrada;
	private int qtdAlunos;
	private int qtdTurmas;
	
	public Professor(String nome, String cpf, int nroRegistro, String orgaoLotacao, double salario,
			String nivelGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas) {
		super(nome, cpf, nroRegistro, orgaoLotacao, salario);
		this.nivelGraduacao = nivelGraduacao;
		this.disciplinaMinistrada = disciplinaMinistrada;
		this.qtdAlunos = qtdAlunos;
		this.qtdTurmas = qtdTurmas;
	}

	public String getNivelGraduacao() {
		return nivelGraduacao;
	}

	public void setNivelGraduacao(String nivelGraduacao) {
		this.nivelGraduacao = nivelGraduacao;
	}

	public String getDisciplinaMinistrada() {
		return disciplinaMinistrada;
	}

	public void setDisciplinaMinistrada(String disciplinaMinistrada) {
		this.disciplinaMinistrada = disciplinaMinistrada;
	}

	public int getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	public int getQtdTurmas() {
		return qtdTurmas;
	}
	
}
