package com.br.qualiti.javaBasico.ExercicioClassesObjetos;

public class Cliente {
	private String nome;
	private double cpf;

	public Cliente() {

	}

	public Cliente(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}
