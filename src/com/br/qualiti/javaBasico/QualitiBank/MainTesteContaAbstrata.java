package com.br.qualiti.javaBasico.QualitiBank;

public class MainTesteContaAbstrata {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Ricardo", "12312312310", TipoCliente.VIP);
		Cliente c2 = new Cliente("Ivan", "12345678910", TipoCliente.ESPECIAL);
		Poupanca p1 = new Poupanca("123", 12345, c1);
		ContaBonificada cb1 = new ContaBonificada("333", 2300, c1);
		ContaImposto ci1 = new ContaImposto("123", 12000, c2);
		
		System.out.println("Cliente: " + p1.getCliente().getNome());
		System.out.println("Saldo atual: " + p1.getSaldo());
		
		p1.renderJuros();
		
		System.out.println("Saldo atual depois de render: " + p1.getSaldo());
		System.out.println("Saldo atual na CB: " + cb1.getSaldo());
		
		cb1.creditar(2000);
		
		System.out.println("Saldo atual na CB: " + cb1.getSaldo());
		
		cb1.renderBonus();
		
		System.out.println("Saldo atual na CB: " + cb1.getSaldo());		
		
		System.out.println("Saldo atual na C. Imposto: " + ci1.getSaldo());
		
		try {
			ci1.debitar(200);
		} catch (Exception e) {
			e.getMessage();
		}
		
		System.out.println("Saldo atual na C. Imposto: " + ci1.getSaldo());
	}

}
