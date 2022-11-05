package br.com.mesttra.aulas.aula00;

public class Elevador {
	
//	3. Crie uma classe denominada Elevador para armazenar as informações de um elevador 
//	dentro de um prédio. 
//	A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio 
//	(desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele.
//	
//	A classe deve também disponibilizar os seguintes métodos:
//		Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
//	
//		Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
//		
//		Sobe: para subir um andar (não deve subir se já estiver no último andar);
//		
//		Desce: para descer um andar (não deve descer se já estiver no térreo);
//
//		Crie um programa principal capaz de interagir com seu Elevador.
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int pessoasPresentes;
	
	public Elevador(int totalAndares, int capacidade) {
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
		this.andarAtual = 0;
		this.pessoasPresentes = 0;
	}
	
	public void entra() {
		if (pessoasPresentes + 1 <= capacidade) {
			pessoasPresentes++;
		}
	}

	public void sai() {
		if (pessoasPresentes - 1 >= 0) {
			pessoasPresentes--;
		}
	}
	
	public void sobe() {
		if (andarAtual + 1 <= totalAndares) {
			andarAtual++;
		}
	}
	
	public void desce() {
		if (andarAtual - 1 >= 0) {
			andarAtual--;
		}
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getPessoasPresentes() {
		return pessoasPresentes;
	}
	
	
}
