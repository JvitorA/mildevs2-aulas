package br.com.mesttra.aulas.aula00;

import java.util.Scanner;

public class ProgramaCarro {

	public static void main(String[] args) {
		
//		Crie um carro no seu programa principal, utilize os métodos 
//		criados e mostre na tela o preço e a cor do carro antes e depois da utilização dos métodos.

		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		
		double peso = sc.nextDouble();
		
		Carro polo = new Carro(nome, peso, "VW", "preto", 83000);
		
		System.out.println("PRECO: " + polo.valor);
		System.out.println("COR: " + polo.cor);
		
		polo.pintar("branco");
		polo.darDesconto(5000);
		
		System.out.println("PRECO: " + polo.valor);
		System.out.println("COR: " + polo.cor);
		
		polo.darDesconto(80000);
		System.out.println("PRECO: " + polo.valor);
		
	}

}
