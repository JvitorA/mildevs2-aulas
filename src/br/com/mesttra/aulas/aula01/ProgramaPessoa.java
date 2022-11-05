package br.com.mesttra.aulas.aula01;

public class ProgramaPessoa {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("JOAO", 1900, 1.55);
		
		pessoa.imprimePessoa();
		System.out.println("IDADE ATUAL: " +  pessoa.calculaIdade(2022));
		
		System.out.println("Passaram-se 10 anos");
		pessoa.setAltura(1.65);
		pessoa.setNome("JOAO XPTO");
		pessoa.imprimePessoa();
		System.out.println("IDADE ATUAL: " +  pessoa.calculaIdade(2032));
		
	}

}
