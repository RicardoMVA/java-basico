package com.br.qualiti.javaBasico.QualitiBank;

public class ContaBonificada extends Conta {
	private double bonus;
	
	public ContaBonificada(String numero, double saldo, Cliente cliente) {
		super(numero, saldo, cliente);		
	}
	
	public double getBonus() {
		return this.bonus;
	}
	
	public void renderBonus() {
		super.creditar(this.bonus);
		this.bonus = 0;
	}
	
//	faz override em creditar da classe conta
	public void creditar(double valor) {
		this.bonus = this.bonus + (valor * 0.01);
		super.creditar(valor);
	}
}
