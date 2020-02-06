package com.br.qualiti.javaBasico;

public class WhileTest {

	public static void main(String[] args) {
		int count = 0;
		
		while(count < 11) {
			System.out.println("Contagem no while 1: " + count);
			count++;
		}
		
		System.out.println("===========================");
		
		count = 0;
		
		do {
			System.out.println("Contagem no while 2: " + count);
			count++;
		} while (count < 11);
	}

}
