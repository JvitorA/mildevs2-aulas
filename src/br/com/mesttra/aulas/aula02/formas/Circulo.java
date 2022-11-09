package br.com.mesttra.aulas.aula02.formas;

public class Circulo extends FormaGeometrica {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		System.out.println("CALCULANDO O CIRCULO");
		double area = Math.PI * Math.pow(this.raio, 2);
		super.setArea(area);
		return area;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}
	
}
