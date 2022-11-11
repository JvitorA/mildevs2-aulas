package br.com.mesttra.aulas.aula04.estacionamento;

public class ProgramaEstacionamento {
	
	public static void main(String[] args) {
		
		Estacionamento garagemJoao = new Estacionamento(0, 50);
		
		Carro corsa = new Carro("OQA123", "Vermelho", "GM", "Corsa");
		Carro polo = new Carro("HUE143", "Cinza", "VW", "Polo");
		Carro gol = new Carro("XYZ874", "Preto", "VW", "Gol");
		
		
		garagemJoao.registraEntrada(gol);
		garagemJoao.registraEntrada(polo);
		garagemJoao.registraEntrada(corsa);
		garagemJoao.registraEntrada(corsa);
		garagemJoao.registraEntrada(corsa);
		garagemJoao.registraEntrada(corsa);
		garagemJoao.registraEntrada(corsa);
		garagemJoao.registraEntrada(corsa);
		
		garagemJoao.carrosNoPatio();
		
		garagemJoao.carroPresente(gol.getPlaca());
		garagemJoao.carroPresente("XYZ124");
		
		garagemJoao.imprimeSaldo();
		
		garagemJoao.registraSaida(gol.getPlaca(), 78.00);
		
		garagemJoao.imprimeSaldo();
		garagemJoao.carroPresente(gol.getPlaca());
	}

}
