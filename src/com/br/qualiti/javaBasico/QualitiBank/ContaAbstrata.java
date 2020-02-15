package com.br.qualiti.javaBasico.QualitiBank;

public abstract class ContaAbstrata {
	private String numero;
	private double saldo;
	private Cliente cliente;

	public ContaAbstrata() {

	}

	public ContaAbstrata(String numero, Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}

	public ContaAbstrata(String numero, double saldo, Cliente cliente) {
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

	public abstract void debitar(double valor) throws Exception;

	public void transferir(Conta contaCred, double valor) throws Exception {
		this.debitar(valor);
		contaCred.creditar(valor);
		System.out.println(
				valor + " foi transferido da conta " + this.getNumero() + " para a conta " + contaCred.getNumero());
	}
}
