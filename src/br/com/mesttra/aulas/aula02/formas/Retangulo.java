package br.com.mesttra.aulas.aula02.formas;

public class Retangulo extends FormaGeometrica {

	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		System.out.println("CALCULANDO O RETANGULO");
		double area = this.altura * this.base;
		super.setArea(area);
		return area;
	}

	@Override
	public String toString() {
		return "Retangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	
}
