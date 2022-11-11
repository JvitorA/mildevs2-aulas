package br.com.mesttra.aulas.aula02.universidade;

public class ProgramaUniversidade {
	
	public static void main(String[] args) {
		
		//Funcionario funcionario = new Funcionario();
		
		FuncionarioAdministrativo joao = new FuncionarioAdministrativo("Joao", "64325416735", 1, "FACULDADE DE COMPUTACAO", 
				5000, "SECRETARIO", "JUNIOR");
		Coordenador jose = new Coordenador("JOSE", "54641659", 2, "FACULDADE DE COMPUTACAO", 5000);
		Professor joaoProfessor = new Professor("JOAO", "654645", 465, "FACULDADE DE COMPUTACAO", 5000, "MESTRADO", "Orientacao a Objetos", 10, 1);
		Professor joseProfessor = new Professor("JOSE", "654645", 465, "FACULDADE DE COMPUTACAO", 5000, "MESTRADO", "Orientacao a Objetos", 10, 1);
		Professor crisProfessora = new Professor("Cris", "654645", 465, "FACULDADE DE COMPUTACAO", 5000, "MESTRADO", "Orientacao a Objetos", 10, 1);
		Coordenador lucas = new Coordenador("Lucas", "54641659", 2, "FACULDADE DE COMPUTACAO", 5000);
		
		
		try {
			jose.adicionaProfessor(joseProfessor);
			jose.adicionaProfessor(joaoProfessor);
			jose.adicionaProfessor(crisProfessora);
		} catch (CoordenadorSobrecarregadoException e) {
			//e.printStackTrace();
			System.err.println("O seguinte professor nao foi inserido: " + e.getProfessorNaoInserido().getNome());
		}

		
		joao.aumentaSalario();
		jose.aumentaSalario();
		
		System.out.println("SALARIO DO JOAO: " + joao.getSalario());
		System.out.println("SALARIO DO JOSE: " + jose.getSalario());
	}

}
