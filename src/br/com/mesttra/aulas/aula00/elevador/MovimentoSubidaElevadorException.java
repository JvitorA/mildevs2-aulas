package br.com.mesttra.aulas.aula00.elevador;

public class MovimentoSubidaElevadorException extends Exception {

	private static final long serialVersionUID = 4065201970232406708L;

	private String mensagem;

	public MovimentoSubidaElevadorException(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
	
}
