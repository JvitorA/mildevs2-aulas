package br.com.mesttra.aulas.aula02.universidade;

public class Coordenador extends Funcionario {

	
//	Os coordenadores possuem os atributos: professoresSupervisionados[10].
	private Professor[] professoresSupervisionados;

	public Coordenador(String nome, String cpf, int nroRegistro, String orgaoLotacao, double salario) {
		super(nome, cpf, nroRegistro, orgaoLotacao, salario);
		this.professoresSupervisionados = new Professor[10];
	}

	public Professor[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}
	
	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario() * 1.05);
	}

}
