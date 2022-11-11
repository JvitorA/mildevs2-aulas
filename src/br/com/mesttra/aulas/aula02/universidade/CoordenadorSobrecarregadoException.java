package br.com.mesttra.aulas.aula02.universidade;

public class CoordenadorSobrecarregadoException extends Exception {

	private static final long serialVersionUID = 6031159393725923703L;

	private Professor professorNaoInserido;

	public CoordenadorSobrecarregadoException(Professor professorNaoInserido) {
		super();
		this.professorNaoInserido = professorNaoInserido;
	}

	public Professor getProfessorNaoInserido() {
		return professorNaoInserido;
	}
	
}
