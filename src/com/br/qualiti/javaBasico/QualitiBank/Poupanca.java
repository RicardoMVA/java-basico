package com.br.qualiti.javaBasico.QualitiBank;

public class Poupanca extends Conta {
	
	private static double taxa = 1.01;
	
	public Poupanca(String numero, double saldo, Cliente cliente) {
		super(numero, saldo, cliente);
	}
	
	public void renderJuros() {
		super.setSaldo(super.getSaldo() * taxa);
	}

}
