package com.br.qualiti.javaBasico.ExercicioStringsArrays;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("Ricardo");
		String s2 = new String("Ricardo");
		
		System.out.println(s1.length() + s2.length());
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1 == s2);

	}

}
