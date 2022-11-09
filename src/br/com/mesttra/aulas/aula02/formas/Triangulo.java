package br.com.mesttra.aulas.aula02.formas;

public class Triangulo extends FormaGeometrica {
	
	private double base;
	private double altura;
	
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		System.out.println("CALCULANDO O TRIANGULO");
		double area = (this.base * this.altura) / 2.0; 
		super.setArea(area);
		return area;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}

}
