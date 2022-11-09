package br.com.mesttra.aulas.aula02.formas;

public abstract class FormaGeometrica {

	private double area;
	
	public FormaGeometrica() {
	}
	
	public abstract double calculaArea();

	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
}
