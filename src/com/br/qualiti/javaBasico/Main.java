package com.br.qualiti.javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

//		===================================================================

//		System.out.println("Digite um n�mero: ");
//		int input = teclado.nextInt();
//		
//		if (input % 2 == 0) {
//			System.out.println("O n�mero � par.");
//		} else {
//			System.out.println("O n�mero � �mpar.");
//		}
//		
//		String resultado = input % 2 == 0 ? "O n�mero � par." : "O n�mero � �mpar.";
//		
//		System.out.println("Resultado do tern�rio: " + resultado);

//		===================================================================

//		int maior = 0;
//		int menor = 0;
//		
//		System.out.println("Digite um n�mero");
//		int input2 = teclado.nextInt();
//		
//		maior = input2;
//		menor = input2;
//		
//		for (int i = 0; i < 4; i++) {
//			System.out.println("Digite um n�mero");
//			input2 = teclado.nextInt();
//			
//			if (input2 > maior) {
//				maior = input2;
//			}
//			
//			if (input2 < menor) {
//				menor = input2;
//			}
//		}
//		
//		System.out.println("O maior valor foi: " + maior);
//		System.out.println("O menor valor foi: " + menor);
//		System.out.println("A diferen�a entre o maior e o menor �: " + (maior - menor));

//		===================================================================

//		System.out.println("Digite a primeira nota: ");
//		double nota1 = teclado.nextDouble();
//		System.out.println("Digite a segunda nota: ");
//		double nota2 = teclado.nextDouble();
//		
//		double media = (nota1 + nota2) / 2;
//		System.out.println("M�dia: " + media);
//		
//		if (media < 4) {
//			System.out.println("Aluno reprovado.");
//		} else if (media > 7) {
//			System.out.println("Aluno aprovado.");
//		} else {
//			System.out.println("Aluno em recupera��o.");
//			System.out.println("A nota m�nima para passar � " + (10 - media));
//		}

//		===================================================================

		System.out.println("Digite o valor em reais: ");
		double reais = teclado.nextDouble();
		System.out.println("Digite a cota��o do d�lar: ");
		double cotacao = teclado.nextDouble();
		
		System.out.println("Valor em reais: " + reais);
		System.out.println("Cota��o do d�lar: " + cotacao);
		System.out.println("Valor em d�lares: " + (reais / cotacao));

		teclado.close();
	}

}
