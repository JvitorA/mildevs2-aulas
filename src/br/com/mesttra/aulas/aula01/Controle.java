package br.com.mesttra.aulas.aula01;

public class Controle {
	
//	4. Crie uma classe Televisao e uma classe ControleRemoto que pode 
//	controlar o volume e trocar os canais da televisão. 
//	
//	O controle de volume permite:
//
//		aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
//
//		aumentar e diminuir o número do canal em uma unidade;
//
//		trocar para um canal indicado;
//
//		consultar o valor do volume de som e o canal selecionado;
//
//		Crie depois um programa principal que interaja com as suas classes, 
//		não se esqueça dos modificadores de acesso e dos getters e setters em suas classes.
	private int volumeMaximo;
	private Televisao televisao;
	
	public Controle(int volumeMaximo) {
		this.volumeMaximo = volumeMaximo;
		this.televisao = new Televisao(0, 0);
	}
	
	public int diminuiVolume() {
		this.televisao.setVolumeAtual(this.televisao.getVolumeAtual() - 1);
		return this.televisao.getVolumeAtual();
	}
	
	public int aumentaVolume() {
		int volumeAtual = this.televisao.getVolumeAtual();
		if (volumeAtual < volumeMaximo) {
			this.televisao.setVolumeAtual(volumeAtual + 1);
		}
		return this.televisao.getVolumeAtual();
	}
	
	public int aumentaCanal() {
		this.televisao.setCanalAtual(this.televisao.getCanalAtual() + 1);
		return this.televisao.getCanalAtual();
	}

	public int diminuiCanal() {
		this.televisao.setCanalAtual(this.televisao.getCanalAtual() - 1);
		return this.televisao.getCanalAtual();
	}
	
	public int trocarCanal(int canalNovo) {
		this.televisao.setCanalAtual(canalNovo);
		return this.televisao.getCanalAtual();
	}
	
	public void consultaValores() {
		System.out.println("CANAL ATUAL: " + this.televisao.getCanalAtual());
		System.out.println("VOLUME ATUAL: " + this.televisao.getVolumeAtual());
	}
}
