package com.br.qualiti.javaBasico;

public class Fatorial {

	public static void main(String[] args) {
		int x = 10;
		
		for (int i = x; i > 1; i--) {
			x *= (i - 1);
		}
		
		System.out.println(x);
	}

}
