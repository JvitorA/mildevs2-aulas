package br.com.mesttra.aulas.aula01;

public class ProgramaTelevisao {
	
	public static void main(String[] args) {
		
		Controle controle = new Controle(5);
		
		controle.aumentaCanal();
		controle.aumentaVolume();
		controle.consultaValores();
		
		controle.trocarCanal(96);
		controle.consultaValores();
		
	}

}
