package br.com.mesttra.aulas.aula00;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		//String nome;
		//String cpf;
		//double peso;
		//int idade;
		//double altura;
		//String email;
		
		Pessoa joao = new Pessoa("Joao", "7899456132", 95.4, 66, 1.92, "joao@joao.com", true);
		Pessoa jose = new Pessoa("Jose", "54687998789", 55.4, 24, 1.55, "jose@jose.com", false);
		
		System.out.println("CPF do Joao: " + joao.cpf);
		System.out.println("CPF do Jose: " + jose.cpf);
	
		
		System.out.println("EMAIL: " + joao.email);
		
		joao.alteraEmail("joao@smartrr.com");

		System.out.println("EMAIL: " + joao.email);
		

		System.out.println("Joao usa oculos: " + joao.usaOculos);
		System.out.println("Jose usa oculos: " + jose.usaOculos);
	}

}
