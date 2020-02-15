package com.br.qualiti.javaBasico.QualitiBank;

public class ContaImposto extends Conta {
	private static double imposto = 0.01;
	
	public ContaImposto (String numero, double saldo, Cliente cliente) {
		super(numero, saldo, cliente);		
	}
	
	@Override
	public void debitar(double valor) throws Exception {
		if (this.getSaldo() - valor < 0) {
			throw new Exception("Saldo insuficiente para debitar " + valor + " da conta " + this.getNumero() + "!");
		} else {
			this.setSaldo(this.getSaldo() - (valor + valor * getImposto()));
			System.out.println("Valor debitado na conta " + this.getNumero() + ": " + valor);
		}

	}
	
	public double getImposto() {
		return imposto;
	}

}
