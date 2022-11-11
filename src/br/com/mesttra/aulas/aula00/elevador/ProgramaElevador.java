package br.com.mesttra.aulas.aula00.elevador;

public class ProgramaElevador {

	public static void main(String[] args) {
		
		try {
			
			Elevador elevador = new Elevador(4, 3);
			
			System.out.println("ANTES DE OPERAR");
			System.out.println("ANDAR ATUAL: " +  elevador.getAndarAtual());
			System.out.println("PESSOAS PRESENTES: " +  elevador.getPessoasPresentes());
	
			
			elevador.desce();
			elevador.desce();
			elevador.desce();
			elevador.desce();
			elevador.desce();
			
			elevador.entra();
			elevador.entra();
			elevador.entra();
			
			System.out.println("CAPACIDADE: " + elevador.getCapacidade());
			
			elevador.setCapacidade(8);
			
			System.out.println("CAPACIDADE: " + elevador.getCapacidade());
			
			elevador.entra();
			elevador.entra();
			
			elevador.sobe();
			elevador.sobe();
			
			System.out.println("1 RODADA");
			System.out.println("ANDAR ATUAL: " +  elevador.getAndarAtual());
			System.out.println("PESSOAS PRESENTES: " +  elevador.getPessoasPresentes());
			
			elevador.sobe();
			elevador.sobe();
			elevador.sobe();
			elevador.sai();
			
			System.out.println("2 RODADA");
			System.out.println("ANDAR ATUAL: " +  elevador.getAndarAtual());
			System.out.println("PESSOAS PRESENTES: " +  elevador.getPessoasPresentes());
			
			elevador.desce();
			elevador.sai();
			elevador.sai();
			elevador.sai();
			
			System.out.println("2 RODADA");
			System.out.println("ANDAR ATUAL: " +  elevador.getAndarAtual());
			System.out.println("PESSOAS PRESENTES: " +  elevador.getPessoasPresentes());
			

		} catch (MovimentoSubidaElevadorException | MovimentoDescidaElevadorException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

		
	}
	
}
