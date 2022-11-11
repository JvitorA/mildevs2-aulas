package br.com.mesttra.aulas.aula04.estacionamento;

import java.util.HashMap;
import java.util.Map;

public class Estacionamento {
	
//	Modele a classe Estacionamento com
//	os atributos
//	valorEmCaixa
//	capacidadeMaxima
//	Crie um map para armazenar os carros dentro do estacionamento onde a chave é a
//	placa e o valor é um objeto do tipo Carro.
//	
//	os métodos
//	registraEntrada(carro) - adiciona um carro no estacionamento
//	registraSaida(placa, valorEstadia) - remove um carro do estacionamento e registrando o valor da estadia.
//	imprimeSaldo() - mostra na tela do valor em caixa
//	carroPresente(placa) - mostra na tela se um carro está dentro do estacionamento	
	private double valorEmCaixa;
	private int capacidadeMaxima;
	private Map<String, Carro> carrosEstacionados;
	
	public Estacionamento(double valorEmCaixa, int capacidadeMaxima) {
		this.valorEmCaixa = valorEmCaixa;
		this.capacidadeMaxima = capacidadeMaxima;
		this.carrosEstacionados = new HashMap<String, Carro>();
	}
	
	public boolean registraEntrada(Carro carro) {
		if (this.carrosEstacionados.size() < this.capacidadeMaxima) {
			this.carrosEstacionados.put(carro.getPlaca(), carro);
			return true;
		}
		
		return false;
	}
	
	public boolean registraSaida(String placa, double valorEstadia) {
		if (this.carrosEstacionados.remove(placa) != null) {
			this.valorEmCaixa += valorEstadia;
			return true;
		}
		return false;
	}
	
	public void imprimeSaldo() {
		System.out.println("O SALDO ATUAL É: " + this.valorEmCaixa);
	}
	
	public void carroPresente(String placa) {
		if (this.carrosEstacionados.get(placa) != null) {
			System.out.println("O carro está presente!");
			return;
		}
		System.out.println("O carro não se encontra no estacionamento!");
	}
	
	public void carrosNoPatio() {
		for (Carro carro : this.carrosEstacionados.values()) {
			System.out.println(carro);
		}
	}

}
