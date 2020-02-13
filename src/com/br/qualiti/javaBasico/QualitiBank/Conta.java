package com.br.qualiti.javaBasico.QualitiBank;

public class Conta {
	private String numero;
	private double saldo;
	private Cliente cliente;

	public Conta() {

	}

	public Conta(String numero, Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}

	public Conta(String numero, double saldo, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void creditar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		System.out.println("Valor creditado na conta " + this.getNumero() + ": " + valor);
	}

	public void debitar(double valor) throws Exception {
		if (this.getSaldo() - valor < 0) {
			throw new Exception("Saldo insuficiente para debitar " + valor + " da conta " + this.getNumero() + "!");
		} else {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Valor debitado na conta " + this.getNumero() + ": " + valor);
		}

	}

	public void transferir(Conta contaCred, double valor) throws Exception {
		this.debitar(valor);
		contaCred.creditar(valor);
		System.out.println(
				valor + " foi transferido da conta " + this.getNumero() + " para a conta " + contaCred.getNumero());
	}

}
