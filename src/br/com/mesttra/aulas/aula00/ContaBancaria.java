package br.com.mesttra.aulas.aula00;

public class ContaBancaria {
	
	
	private static final int SALDO_MINIMO = 0;
	//	2. Crie uma classe referente à uma conta bancária, que possui como atributos o seu número, 
//	saldo e o nome do correntista. Crie também o método saque() que serve para retirar um certo 
//	valor do saldo, o método depósito() que serve para adicionar um valor ao saldo e o 
//	método extrato() que serve para mostrar na tela o nome do correntista, o número da conta
//	e o saldo. Crie um programa principal e demonstre a utilização dos métodos implementados.
	private int numeroConta;
	private double saldo;
	private String nomeCorrentista;
	
	public ContaBancaria(int numeroConta, String nomeCorrentista) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = SALDO_MINIMO;
		
	}
	
	public void saque(double valorSacado) {
		boolean valorNaoExcedeSaldo = this.saldo - valorSacado >= SALDO_MINIMO;
		if (valorNaoExcedeSaldo) {
			this.saldo -= valorSacado;
		}
	}
	
	public void deposito(double valorDepositado) {
		if (valorDepositado > 0) {
			this.saldo += valorDepositado;
		}
	}

	public void extrato() {
		System.out.println("NOME: " + this.nomeCorrentista);
		System.out.println("NRO CONTA: " + this.numeroConta);
		System.out.println("SALDO: " + this.saldo);
	}
}
