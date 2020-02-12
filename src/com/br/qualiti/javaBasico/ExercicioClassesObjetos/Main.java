package com.br.qualiti.javaBasico.ExercicioClassesObjetos;

import com.br.qualiti.javaBasico.ExercicioStringsArrays.TipoCliente;

public class Main {

	public static void main(String[] args) {
		Cliente p1 = new Cliente("Ricardo", 12345678910D, TipoCliente.VIP);
		Cliente p2 = new Cliente("Ivan", 10987654321D, TipoCliente.ESPECIAL);
		
		System.out.println(p1.getNome() + " é um cliente do tipo " + p1.getTipoCliente());
		System.out.println(p2.getNome() + " é um cliente do tipo " + p2.getTipoCliente());
		
		Conta c1 = new Conta("123", p1);
		Conta c2 = new Conta("321", p2);

		c1.setSaldo(100);
		c2.setSaldo(0);

		System.out.println("Saldo da conta " + c1.getNumero() + ": " + c1.getSaldo());
		System.out.println("Saldo da conta " + c2.getNumero() + ": " + c2.getSaldo());

		try {
			c1.debitar(50);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		c2.creditar(50);

		System.out.println("Saldo da conta " + c1.getNumero() + ": " + c1.getSaldo());
		System.out.println("Saldo da conta " + c2.getNumero() + ": " + c2.getSaldo());

		try {
			c1.transferir(c2, 200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Saldo da conta " + c1.getNumero() + ": " + c1.getSaldo());
		System.out.println("Saldo da conta " + c2.getNumero() + ": " + c2.getSaldo());

	}

}
