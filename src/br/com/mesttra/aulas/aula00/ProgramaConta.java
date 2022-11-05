package br.com.mesttra.aulas.aula00;

public class ProgramaConta {
	
	public static void main(String[] args) {
		
		ContaBancaria contaJoao = new ContaBancaria(1, "JOAO");
		ContaBancaria contaJose = new ContaBancaria(2, "JOSE");
		
		contaJoao.deposito(60);
		contaJoao.deposito(-90);
		contaJoao.saque(50);
		contaJoao.saque(50);
		
		System.out.println("JOAO");
		contaJoao.extrato();
		System.out.println("---");
		System.out.println("JOSE");
		contaJose.extrato();
	}
}
