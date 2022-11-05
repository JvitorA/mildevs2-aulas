package br.com.mesttra.aulas.aula02.universidade;

public class ProgramaUniversidade {
	
	public static void main(String[] args) {
		
		FuncionarioAdministrativo joao = new FuncionarioAdministrativo("Joao", "64325416735", 1, "FACULDADE DE COMPUTACAO", 
				5000, "SECRETARIO", "JUNIOR");
		Coordenador jose = new Coordenador("JOSE", "54641659", 2, "FACULDADE DE COMPUTACAO", 5000);
		
		joao.aumentaSalario();
		jose.aumentaSalario();
		
		System.out.println("SALARIO DO JOAO: " + joao.getSalario());
		System.out.println("SALARIO DO JOSE: " + jose.getSalario());
	}

}
