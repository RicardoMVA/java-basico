package com.br.qualiti.javaBasico;

public class Teste {
	// 1)

	// a) OK, pois 'b' � um long e pode receber um valor tipo int.
	// b) N�o compila, pois 'c' � um long e n�o cabe em 'd' que � um int, sendo
	// necess�rio realizar um cast de 'c' para int
	// c) N�o compila, pois n�o � poss�vel colocar um valor booleano numa vari�vel
	// do tipo int
	// d) N�o compila, pois '10L' � um long e n�o cabe na vari�vel 'int a'
	// e) OK, pois � poss�vel fazer o cast do long 10 para um int e guard�-lo numa
	// vari�vel do tipo int
	// f) N�o compila, pois n�o � poss�vel converter o int '10' numa vari�vel do
	// tipo char
	// g) OK, pois � poss�vel guardar um valor float dentro de uma vari�vel do tipo
	// double
	// h) N�o compila, pois todo n�mero escrito com casa decimal � considerado um
	// double por padr�o, e este n�o cabe numa vari�vel do tipo 'float'
	// i) OK, pois � poss�vel fazer o cast do double '2.0' para o int '2'
	// j) OK, pois � poss�vel fazer o cast do int '20000' para o byte '32'

	// 2)

	// a) 2, pois a soma '++' ocorre depois da declara��o de 'b' como sendo igual a
	// 'a'
	// b) 3, pois aqui realizamos a soma em 'c' antes de definir 'd' como sendo
	// igual ao referido 'c'
	// c) 0, pois o duplo '&' n�o avalia/executa a segunda condi��o se a primeira
	// for falsa
	// d) 2, pois o '&' simples avalia/executa as duas condi��es e, portanto, 'f++'
	// acrescenta 1 ao valor de 'f'
	// e) 1, pois 'g++ == 4' � falso, visto que 'g' s� � somado ap�s a avalia��o da
	// condicional e o operador tern�rio retornar� 1.

	// 3)

	// a) short idade = 30;
	// b) double a = 2; double b = 3; double media = (a + b) / 2;
	// c) float salario = 3500f;
	// d) String nome = "Ricardo"; int numero = 1234567; float nota1 = 9f; float
	// nota2 = 9.5f; float media = (nota1 + nota2) / 2;
	// e) byte mes = 2; byte dia = 6;

}
