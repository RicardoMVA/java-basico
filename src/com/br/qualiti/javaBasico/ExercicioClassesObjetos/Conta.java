package com.br.qualiti.javaBasico.ExercicioClassesObjetos;

public class Conta {
	private String numero;
	private int saldo;
	private String cliente_nome;
	
	public Conta() {

	}
	
	public Conta(String numero, String cliente_nome) {
		this.numero = numero;
		this.cliente_nome = cliente_nome;
	}
	
	public Conta(String numero, int saldo, String cliente_nome) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente_nome = cliente_nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getCliente_nome() {
		return cliente_nome;
	}

	public void setCliente_nome(String cliente_nome) {
		this.cliente_nome = cliente_nome;
	}
	
	public void creditar(int valor) {
		this.setSaldo(this.getSaldo() + valor);
		System.out.println("Valor creditado na conta " + this.getNumero() + ": " + valor);
		System.out.println("Novo saldo: " + this.getSaldo());
	}
	
	public void debitar(int valor) {
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("Valor debitado na conta " + this.getNumero() + ": " + valor);
		System.out.println("Novo saldo: " + this.getSaldo());
	}
	


}
