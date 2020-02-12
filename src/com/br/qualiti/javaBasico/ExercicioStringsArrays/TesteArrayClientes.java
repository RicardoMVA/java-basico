package com.br.qualiti.javaBasico.ExercicioStringsArrays;

public class TesteArrayClientes {

	public static void main(String[] args) {
		Cliente p1 = new Cliente("Ricardo", "12345678910", TipoCliente.VIP);
		Cliente p2 = new Cliente("Ivan", "10987654321", TipoCliente.ESPECIAL);
		
		RepositorioClientesArray repositorio = new RepositorioClientesArray();
		
		repositorio.inserir(p1);
		repositorio.inserir(p2);
		
		System.out.println("O índice do CPF 12345678910 é " + repositorio.procurarIndice("12345678910"));
		
		System.out.println("10987654321 existe? " + repositorio.existe("10987654321"));
		
		System.out.println("O nome associado ao CPF 12345678910 é: " + repositorio.procurar("12345678910").getNome());
		
		p2.setNome("Matheus");
		
		repositorio.atualizar(p2);
		
		System.out.println("Depois de atualizar, o nome do CPF 10987654321 é: " + repositorio.procurar("10987654321").getNome());
		
		repositorio.remover(p1.getCpf());
		
		System.out.println("CPF 12345678910 existe? " + repositorio.existe("12345678910"));

	}

}
