package com.br.qualiti.javaBasico.QualitiBank;

public class Conta extends ContaAbstrata {
	public Conta() {
		super();
	}

	public Conta(String numero, Cliente cliente) {
		super(numero, cliente);
	}

	public Conta(String numero, double saldo, Cliente cliente) {
		super(numero, saldo, cliente);
	}

	public void debitar(double valor) throws Exception {
		if (this.getSaldo() - valor < 0) {
			throw new Exception("Saldo insuficiente para debitar " + valor + " da conta " + this.getNumero() + "!");
		} else {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Valor debitado na conta " + this.getNumero() + ": " + valor);
		}

	}

}
