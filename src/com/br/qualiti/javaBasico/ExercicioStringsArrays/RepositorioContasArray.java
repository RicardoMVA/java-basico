package com.br.qualiti.javaBasico.ExercicioStringsArrays;

public class RepositorioContasArray {
	private Conta[] contas;
	private int indice = -1;
	private static final int TAMANHO_CACHE = 100;
	
	public RepositorioContasArray() {
		contas = new Conta[TAMANHO_CACHE];
	}
	
	public void inserir(Conta c) {
		indice++;
		contas[indice] = c;
	}
	
	public int procurarIndice(String numero) {
		for(int i = 0; i <= indice; i++) {
			if (contas[i] != null) {		
				if (contas[i].getNumero().equals(numero)) {
					return i;
				}
			}
		}
		
		return -1;
	}
	
	public boolean existe(String numero) {
		if (procurarIndice(numero) != -1) {
			return true;
		}
		
		return false;
	}
	
	public Conta procurar(String numero) {
		int indice = procurarIndice(numero);
		if(indice != -1) {
			return contas[indice];
		}
		
		return null;
	}
	
	public void atualizar(Conta c) {
		int indexDaConta = procurarIndice(c.getNumero());
		
		if (indexDaConta != -1) {	
			contas[indexDaConta] = c;
		} else {
			System.out.println("Conta inválida!");
		}		
	}
	
	public void remover(String numero) {
		int indexDaConta = procurarIndice(numero);
		
		if (indexDaConta != -1) {	
			contas[indexDaConta] = null;
		} else {
			System.out.println("Conta inválida!");
		}
	}
}
