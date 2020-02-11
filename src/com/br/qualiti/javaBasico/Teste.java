package com.br.qualiti.javaBasico;

public class Teste {
	// 1)

	// a) OK, pois 'b' é um long e pode receber um valor tipo int.
	// b) Não compila, pois 'c' é um long e não cabe em 'd' que é um int, sendo
	// necessário realizar um cast de 'c' para int
	// c) Não compila, pois não é possível colocar um valor booleano numa variável
	// do tipo int
	// d) Não compila, pois '10L' é um long e não cabe na variável 'int a'
	// e) OK, pois é possível fazer o cast do long 10 para um int e guardá-lo numa
	// variável do tipo int
	// f) Não compila, pois não é possível converter o int '10' numa variável do
	// tipo char
	// g) OK, pois é possível guardar um valor float dentro de uma variável do tipo
	// double
	// h) Não compila, pois todo número escrito com casa decimal é considerado um
	// double por padrão, e este não cabe numa variável do tipo 'float'
	// i) OK, pois é possível fazer o cast do double '2.0' para o int '2'
	// j) OK, pois é possível fazer o cast do int '20000' para o byte '32'

	// 2)

	// a) 2, pois a soma '++' ocorre depois da declaração de 'b' como sendo igual a
	// 'a'
	// b) 3, pois aqui realizamos a soma em 'c' antes de definir 'd' como sendo
	// igual ao referido 'c'
	// c) 0, pois o duplo '&' não avalia/executa a segunda condição se a primeira
	// for falsa
	// d) 2, pois o '&' simples avalia/executa as duas condições e, portanto, 'f++'
	// acrescenta 1 ao valor de 'f'
	// e) 1, pois 'g++ == 4' é falso, visto que 'g' só é somado após a avaliação da
	// condicional e o operador ternário retornará 1.

	// 3)

	// a) short idade = 30;
	// b) double a = 2; double b = 3; double media = (a + b) / 2;
	// c) float salario = 3500f;
	// d) String nome = "Ricardo"; int numero = 1234567; float nota1 = 9f; float
	// nota2 = 9.5f; float media = (nota1 + nota2) / 2;
	// e) byte mes = 2; byte dia = 6;

}
