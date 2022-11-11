package br.com.mesttra.aulas.aula02.universidade;

public class Coordenador extends Funcionario {

	
//	Os coordenadores possuem os atributos: professoresSupervisionados[10].
	private Professor[] professoresSupervisionados;

	public Coordenador(String nome, String cpf, int nroRegistro, String orgaoLotacao, double salario) {
		super(nome, cpf, nroRegistro, orgaoLotacao, salario);
		this.professoresSupervisionados = new Professor[2];
	}
	
	
	public void adicionaProfessor(Professor professor) throws CoordenadorSobrecarregadoException {
		
		for (int i = 0; i < this.professoresSupervisionados.length; i++) {
			if (this.professoresSupervisionados[i] == null) {
				this.professoresSupervisionados[i] = professor;
				return;
			}
		}
		
		throw new CoordenadorSobrecarregadoException(professor);
		
	}
	

	public Professor[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}
	
	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario() * 1.05);
	}

}
