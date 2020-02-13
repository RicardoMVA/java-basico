package com.br.qualiti.javaBasico.QualitiBank;

import com.br.qualiti.javaBasico.QualitiBank.Conta;

public class MainTesteArrayContas {

	public static void main(String[] args) {
		Cliente p1 = new Cliente("Ricardo", "12345678910", TipoCliente.VIP);
		Cliente p2 = new Cliente("Ivan", "10987654321", TipoCliente.ESPECIAL);
		
		Conta c1 = new Conta("123", p1);
		Conta c2 = new Conta("321", p2);
		
		RepositorioContasArray repositorioContas = new RepositorioContasArray();
		
		repositorioContas.inserir(c1);
		repositorioContas.inserir(c2);
		
		System.out.println("O índice da conta " + c1.getNumero() + " é " + repositorioContas.procurarIndice(c1.getNumero()));
		
		System.out.println(c2.getNumero() + " existe? " + repositorioContas.existe(c2.getNumero()));
		
		System.out.println("O saldo da conta " + c2.getNumero() + " é: " + repositorioContas.procurar(c2.getNumero()).getSaldo());
		
		c2.setSaldo(1000);
		
		repositorioContas.atualizar(c2);
		
		System.out.println("Depois de atualizar, o saldo da conta " + c2.getNumero() + " é: " + repositorioContas.procurar(c2.getNumero()).getSaldo());
		
		repositorioContas.remover(c1.getNumero());
		
		System.out.println("Conta " + c1.getNumero() + " existe no repositório? " + repositorioContas.existe(c1.getNumero()));

	}

}
