package com.br.qualiti.javaBasico.QualitiBank;

public class RepositorioClientesArray {
	private Cliente[] clientes;
	private int indice = -1;
	private static final int TAMANHO_CACHE = 100;
	
	public RepositorioClientesArray() {
		clientes = new Cliente[TAMANHO_CACHE];
	}
	
	public void inserir(Cliente c) {
		indice++;
		clientes[indice] = c;
	}
	
	public int procurarIndice(String cpf) {
		for(int i = 0; i <= indice; i++) {
			if (clientes[i] != null) {		
				if (clientes[i].getCpf().equals(cpf)) {
					return i;
				}
			}
		}
		
		return -1;
	}
	
	public boolean existe(String cpf) {
		if (procurarIndice(cpf) != -1) {
			return true;
		}
		
		return false;
	}
	
	public Cliente procurar(String cpf) {
		int indice = procurarIndice(cpf);
		if(indice != -1) {
			return clientes[indice];
		}
		
		return null;
	}
	
	public void atualizar(Cliente c) {
		int indexDoCliente = procurarIndice(c.getCpf());
		
		if (indexDoCliente != -1) {	
			clientes[indexDoCliente] = c;
		} else {
			System.out.println("Cliente inválido!");
		}		
	}
	
	public void remover(String cpf) {
		int indexDoCliente = procurarIndice(cpf);
		
		if (indexDoCliente != -1) {	
			clientes[indexDoCliente] = null;
		} else {
			System.out.println("CPF inválido!");
		}
	}
}
