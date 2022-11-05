package br.com.mesttra.aulas.aula00;

public class Carro {
	
	
//	1. Crie uma classe que represente um carro, que tenha como características o nome, 
//	o peso, a fabricante, a cor e o valor do carro. Crie também o método darDesconto() 
//	que servirá para diminuir o preço do carro e o método pintar(), que será responsável 
//	por mudar a cor do carro. Crie um carro no seu programa principal, utilize os métodos 
//	criados e mostre na tela o preço e a cor do carro antes e depois da utilização dos métodos.
	String nome;
	double peso;
	String fabricante;
	String cor;
	double valor;
	
	public Carro(String nome, double peso, String fabricante, String cor, double valor) {
		this.nome = nome;
		this.peso = peso;
		this.fabricante = fabricante;
		this.cor = cor;
		this.valor = valor;
	}
	
	public void pintar(String novaCor) {
		this.cor = novaCor;
	}
	
	public void darDesconto(double valorDesc) {
		if (this.valor - valorDesc >= 100) {
			System.out.println("DESCONTO PROCESSADO");
			this.valor -= valorDesc;
		} else {
			System.out.println("DESCONTO NAO PROCESSADO");
		}
	}

}
