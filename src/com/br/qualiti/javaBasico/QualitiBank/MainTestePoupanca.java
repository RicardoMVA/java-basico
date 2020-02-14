package com.br.qualiti.javaBasico.QualitiBank;

public class MainTestePoupanca {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Ricardo", "12312312310", TipoCliente.VIP);
		Poupanca p1 = new Poupanca("123", 12345, c1);
		
		System.out.println("Cliente: " + p1.getCliente().getNome());
		System.out.println("Saldo atual: " + p1.getSaldo());
		
		p1.renderJuros();
		
		System.out.println("Saldo atual depois de render: " + p1.getSaldo());
		
		ContaBonificada cb1 = new ContaBonificada("333", 2300, c1);
		
		System.out.println("Saldo atual na CB: " + cb1.getSaldo());
		
		cb1.creditar(2000);
		
		System.out.println("Saldo atual na CB: " + cb1.getSaldo());
		
		cb1.renderBonus();
		
		System.out.println("Saldo atual na CB: " + cb1.getSaldo());		
		
	}
}
