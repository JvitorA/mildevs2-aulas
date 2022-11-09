package br.com.mesttra.aulas.aula02.formas;

import java.util.ArrayList;

public class ProgramaFormas {
	
	public static void main(String[] args) {
		
		FormaGeometrica quadrado = new Quadrado(1.0);
		FormaGeometrica retangulo = new Retangulo(2.0,7.0);
		FormaGeometrica triangulo = new Triangulo(3.0, 6.0);
		FormaGeometrica circulo = new Circulo(5.0);
		
//		System.out.println("AREA QUADRADO: " + quadrado.calculaArea());
//		System.out.println("AREA RETANGULO: " + retangulo.calculaArea());
//		System.out.println("AREA TRIANGULO: " + triangulo.calculaArea());
//		System.out.println("AREA CIRCULO: " + circulo.calculaArea());
		
		ArrayList<FormaGeometrica> formas = new ArrayList<>();
		formas.add(quadrado);
		formas.add(retangulo);
		formas.add(triangulo);
		formas.add(circulo);
		
		for (FormaGeometrica forma : formas) {
			System.out.println(forma);
			forma.calculaArea();
		}
		
	}

}
