package br.com.mesttra.aulas.aula02.formas;

public class Quadrado extends FormaGeometrica {

	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		System.out.println("CALCULANDO O QUADRADO");
		double area = this.lado * this.lado;
		super.setArea(area);
		return area;
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + "]";
	}

	
}
