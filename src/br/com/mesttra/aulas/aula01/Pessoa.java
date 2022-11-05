package br.com.mesttra.aulas.aula01;

public class Pessoa {
	
//	Crie uma classe para representar uma pessoa, com os atributos privados de nome, 
//	ano de nascimento e altura. 
//	
//	Crie os métodos públicos necessários para sets e gets e também 
//	um método para imprimir todos dados de uma pessoa. 
//	
//	
//	Crie um método para calcular a idade da pessoa.
	private String nome;
	private int anoNascimento;
	private double altura;
	
	public Pessoa(String nome, int anoNascimento, double altura) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.altura = altura;
	}
	
	public int calculaIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
	
	public void imprimePessoa() {
		System.out.println("DADOS DA PESSOA");
		System.out.println("NOME: " + this.nome);
		System.out.println("ANO NASCIMENTO: " + this.anoNascimento);
		System.out.println("ALTURA: " + this.altura);
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getAnoNascimento() {
		return anoNascimento;
	}

}
