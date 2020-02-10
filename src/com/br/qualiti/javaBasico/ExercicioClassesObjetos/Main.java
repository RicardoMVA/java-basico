package com.br.qualiti.javaBasico.ExercicioClassesObjetos;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new Conta("123", "Ricardo");
		Conta c2 = new Conta("321", "Ivan");

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
