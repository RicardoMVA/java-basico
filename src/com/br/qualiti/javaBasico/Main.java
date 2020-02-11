package com.br.qualiti.javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

//		===================================================================

//		System.out.println("Digite um número: ");
//		int input = teclado.nextInt();
//		
//		if (input % 2 == 0) {
//			System.out.println("O número é par.");
//		} else {
//			System.out.println("O número é ímpar.");
//		}
//		
//		String resultado = input % 2 == 0 ? "O número é par." : "O número é ímpar.";
//		
//		System.out.println("Resultado do ternário: " + resultado);

//		===================================================================

//		int maior = 0;
//		int menor = 0;
//		
//		System.out.println("Digite um número");
//		int input2 = teclado.nextInt();
//		
//		maior = input2;
//		menor = input2;
//		
//		for (int i = 0; i < 4; i++) {
//			System.out.println("Digite um número");
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
//		System.out.println("A diferença entre o maior e o menor é: " + (maior - menor));

//		===================================================================

//		System.out.println("Digite a primeira nota: ");
//		double nota1 = teclado.nextDouble();
//		System.out.println("Digite a segunda nota: ");
//		double nota2 = teclado.nextDouble();
//		
//		double media = (nota1 + nota2) / 2;
//		System.out.println("Média: " + media);
//		
//		if (media < 4) {
//			System.out.println("Aluno reprovado.");
//		} else if (media > 7) {
//			System.out.println("Aluno aprovado.");
//		} else {
//			System.out.println("Aluno em recuperação.");
//			System.out.println("A nota mínima para passar é " + (10 - media));
//		}

//		===================================================================

		System.out.println("Digite o valor em reais: ");
		double reais = teclado.nextDouble();
		System.out.println("Digite a cotação do dólar: ");
		double cotacao = teclado.nextDouble();
		
		System.out.println("Valor em reais: " + reais);
		System.out.println("Cotação do dólar: " + cotacao);
		System.out.println("Valor em dólares: " + (reais / cotacao));

		teclado.close();
	}

}
