package com.br.qualiti.javaBasico;

public class SwitchTest {

	public static void main(String[] args) {
		int key = 3;

		switch (key) {
		case 1:
			System.out.println("Esse código nunca roda.");
			
		case 2:
			System.out.println("Esse código nunca roda.");
			
		case 3:
			break;
			
		case 4:
			System.out.println("Esse código nunca roda.");

		}

		System.out.println("Fim da switch.");
	}

}
